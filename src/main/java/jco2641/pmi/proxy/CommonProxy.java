package jco2641.pmi.proxy;

import jco2641.pmi.Config;
import jco2641.pmi.ModItems;
import jco2641.pmi.ModRecipes;
import jco2641.pmi.handler.LivingDropsHandler;
import jco2641.pmi.handler.LootHandler;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import java.io.File;

public class CommonProxy {

    public static Configuration config;

    public void preInit(FMLPreInitializationEvent e){

        File directory = e.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "peacefulmonsteritems.cfg"));
        Config.readConfig();

        ModItems.init();
    }

    public void init (FMLInitializationEvent e){
        ModRecipes.init();
    }

    public void postInit (FMLPostInitializationEvent e){
        if (config.hasChanged()){
            config.save();
        }
        MinecraftForge.EVENT_BUS.register(new LivingDropsHandler());
        MinecraftForge.EVENT_BUS.register(new LootHandler());
    }
}
