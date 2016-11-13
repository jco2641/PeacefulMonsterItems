package jco2641.pmi.handler;

import com.google.common.collect.ImmutableList;
import jco2641.pmi.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.*;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.List;

public class LootHandler {

    private static final List<String> TABLES = ImmutableList.of(
            "inject/abandoned_mineshaft",
            "inject/jungle_temple",
            "inject/simple_dungeon",
            "inject/spawn_bonus_chest",
            "inject/village_blacksmith"
    );

    public LootHandler(){
        for (String s : TABLES){
            LootTableList.register(new ResourceLocation(Reference.MODID,s));
        }
    }

    @SubscribeEvent
    public void lootLoad(LootTableLoadEvent evt){
        String prefix = "minecraft:chests/";
        String name = evt.getName().toString();

        if (name.startsWith(prefix)){
            String file = name.substring(name.indexOf(prefix) + prefix.length());
            switch (file){
                case "abandoned_mineshaft":
                case "jungle_temple":
                case "simple_dungeon":
                case "spawn_bonus_chest":
                case "village_blacksmith":
                    evt.getTable().addPool(getInjectPool(file));
                    break;
                default: break;

            }
        }
    }

    private LootPool getInjectPool(String entryName){
        return new LootPool(
                new LootEntry[]{
                        getInjectEntry(entryName, 1)
                },
                new LootCondition[0],
                new RandomValueRange(1),
                new RandomValueRange(0, 2),
                "pmi_inject_pool"
        );
    }

    private LootEntryTable getInjectEntry(String name, int weight) {
        return new LootEntryTable(
                new ResourceLocation(
                        Reference.MODID,
                        "inject/" + name
                ),
                weight,
                0,
                new LootCondition[0],
                "pmi_inject_entry"
        );
    }
}
