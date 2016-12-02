package jco2641.pmi;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.potion.PotionUtils;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

    public static void init(){
        //3 Bone meal + 1 cactus green -> slimeball
        if (Config.slimeball) {
            final int WHITE_DYE_DMG = EnumDyeColor.WHITE.getDyeDamage();
            final int GREEN_DYE_DMG = EnumDyeColor.GREEN.getDyeDamage();
            GameRegistry.addShapelessRecipe(new ItemStack(Items.SLIME_BALL,1),
                    new ItemStack(Items.DYE,1,WHITE_DYE_DMG),
                    new ItemStack(Items.DYE,1,WHITE_DYE_DMG),
                    PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.WATER),
                    new ItemStack(Items.DYE,1,GREEN_DYE_DMG)
            );
        }

        //Blaze Powder + Slimeball -> magma cream
        if (Config.magma_cream) {
            GameRegistry.addShapelessRecipe(new ItemStack(Items.MAGMA_CREAM,1),
                    new ItemStack(Items.SLIME_BALL,1),
                    new ItemStack(Items.BLAZE_POWDER,1)
            );
        }

        //Bone + 4 Coal -> Withered Bone
        if (Config.wither_bone) {
            GameRegistry.addRecipe(new ItemStack(ModItems.witherbone,1),
                    ".C.",
                    "CBC",
                    ".C.",
                    'C', Items.COAL,
                    'B', Items.BONE
            );
        }

        //Bone + Gold + Magma Block -> Blaze Rod
        if (Config.blaze_rod) {
            GameRegistry.addRecipe(new ItemStack(Items.BLAZE_ROD,1),
                    "..B",
                    ".G.",
                    "M..",
                    'B', Items.BONE,
                    'G',Items.GOLD_INGOT,
                    'M',Blocks.field_189877_df
            );
        }

        //2 Sand, 2 Charcoal, 1 Flint -> 4 Gunpowder
        if(Config.gunpowder){
            GameRegistry.addRecipe(new ItemStack(Items.GUNPOWDER,1),
                    ".S.",
                    "CFC",
                    ".S.",
                    'S',Blocks.SAND,
                    'C',new ItemStack(Items.COAL,1,1),
                    'F',Items.FLINT
            );
            GameRegistry.addRecipe(new ItemStack(Items.GUNPOWDER,1),
                    ".C.",
                    "SFS",
                    ".C.",
                    'S',Blocks.SAND,
                    'C',new ItemStack(Items.COAL,1,1),
                    'F',Items.FLINT
            );
        }

        //1 Beef/Pork/Mutton + fermented spider eye -> 6 rotten flesh
        if(Config.rotten_flesh){
            GameRegistry.addShapelessRecipe(new ItemStack(Items.ROTTEN_FLESH,6),
                    new ItemStack(Items.BEEF,1),
                    new ItemStack(Items.FERMENTED_SPIDER_EYE)
            );
            GameRegistry.addShapelessRecipe(new ItemStack(Items.ROTTEN_FLESH,6),
                    new ItemStack(Items.MUTTON,1),
                    new ItemStack(Items.FERMENTED_SPIDER_EYE)
            );
            GameRegistry.addShapelessRecipe(new ItemStack(Items.ROTTEN_FLESH,6),
                    new ItemStack(Items.PORKCHOP,1),
                    new ItemStack(Items.FERMENTED_SPIDER_EYE)
            );
        }

        //4 Gunpowder -> Creeper skull
        if(Config.creeper_skull){
            GameRegistry.addRecipe(new ItemStack(Items.SKULL,1,4),
                    "GG.",
                    "GG.",
                    "...",
                    'G',Items.GUNPOWDER
            );
        }

        //4 Bone -> Skeleton skull
        if(Config.skeleton_skull){
            GameRegistry.addRecipe(new ItemStack(Items.SKULL,1,0),
                    "BB.",
                    "BB.",
                    "...",
                    'B',Items.BONE
            );
        }

        //4 Withered Bone -> Wither skeleton skull
        if(Config.wither_skull){
            GameRegistry.addRecipe(new ItemStack(Items.SKULL,1,1),
                    "WW.",
                    "WW.",
                    "...",
                    'W',ModItems.witherbone
            );
        }

        //4 Rotten flesh -> Zombie skull
        if(Config.zombie_skull){
            GameRegistry.addRecipe(new ItemStack(Items.SKULL,1,2),
                    "RR.",
                    "RR.",
                    "...",
                    'R',Items.ROTTEN_FLESH
            );
        }

        //1 Beef/Pork/Mutton + Skeleton skull -> Player skull
        if(Config.player_skull){
            GameRegistry.addRecipe(new ItemStack(Items.SKULL,1,3),
                    ".M.",
                    ".S.",
                    "...",
                    'M',Items.BEEF,
                    'S',new ItemStack(Items.SKULL,1,0)
            );
            GameRegistry.addRecipe(new ItemStack(Items.SKULL,1,3),
                    ".M.",
                    ".S.",
                    "...",
                    'M',Items.PORKCHOP,
                    'S',new ItemStack(Items.SKULL,1,0)
            );
            GameRegistry.addRecipe(new ItemStack(Items.SKULL,1,3),
                    ".M.",
                    ".S.",
                    "...",
                    'M',Items.MUTTON,
                    'S',new ItemStack(Items.SKULL,1,0)
            );
        }

        //2 Feathers + 2 Iron + Awkward potion -> Ghast tear
        if(Config.ghast_tear){
            GameRegistry.addRecipe(new ItemStack(Items.GHAST_TEAR,1),
                    ".F.",
                    "IPI",
                    ".F.",
                    'F',Items.FEATHER,
                    'I',Items.IRON_INGOT,
                    'P',PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.AWKWARD)
            );
            GameRegistry.addRecipe(new ItemStack(Items.GHAST_TEAR,1),
                    ".I.",
                    "FPF",
                    ".I.",
                    'F',Items.FEATHER,
                    'I',Items.IRON_INGOT,
                    'P',PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.AWKWARD)
            );
        }

        //4 Gunpowder + 4 Redstone + 1 Emerald -> 4 Ender Pearls
        if(Config.ender_pearl){
            GameRegistry.addRecipe(new ItemStack(Items.ENDER_PEARL,4),
                    "GRG",
                    "RER",
                    "GRG",
                    'G',Items.GUNPOWDER,
                    'R',Items.REDSTONE,
                    'E',Items.EMERALD
            );
            GameRegistry.addRecipe(new ItemStack(Items.ENDER_PEARL,4),
                    "RGR",
                    "GEG",
                    "RGR",
                    'G',Items.GUNPOWDER,
                    'R',Items.REDSTONE,
                    'E',Items.EMERALD
            );
        }

        //8 Sandstone + 1 Ender Pearl -> 8 End Stone
        if(Config.end_stone){
            GameRegistry.addRecipe(new ItemStack(Blocks.END_STONE,8),
                    "SSS",
                    "SES",
                    "SSS",
                    'S',Blocks.SANDSTONE,
                    'E',Items.ENDER_PEARL
            );
        }

        //4 Wither Skeleton Skull + 4 Soul Sand + 1 Block of Diamond -> Nether Star
        if(Config.nether_star){
            GameRegistry.addRecipe(new ItemStack(Items.NETHER_STAR),
                    "WSW",
                    "SDS",
                    "WSW",
                    'W', new ItemStack(Items.SKULL,1,1),
                    'S',Blocks.SOUL_SAND,
                    'D',Blocks.DIAMOND_BLOCK
            );
            GameRegistry.addRecipe(new ItemStack(Items.NETHER_STAR),
                    "SWS",
                    "WDW",
                    "SWS",
                    'W', new ItemStack(Items.SKULL,1,1),
                    'S',Blocks.SOUL_SAND,
                    'D',Blocks.DIAMOND_BLOCK
            );
        }

        //1 Flint + 1 Fish + 1 Lapis -> 8 Prismarine shard
        if(Config.prismarine){
            final int BLUE_DYE_DMG = EnumDyeColor.BLUE.getDyeDamage();
            GameRegistry.addShapelessRecipe(new ItemStack(Items.PRISMARINE_SHARD,8),
                    new ItemStack(Items.FISH),
                    new ItemStack(Items.FLINT),
                    new ItemStack(Items.DYE,1,BLUE_DYE_DMG)
            );
        }
    }
}
