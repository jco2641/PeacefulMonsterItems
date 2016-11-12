package jco2641.pmi;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.potion.PotionUtils;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class ModRecipes {

    public static void init(){
        //3 Bone meal + 1 cactus green -> slimeball
        final int WHITE_DYE_DMG = EnumDyeColor.WHITE.getDyeDamage();
        final int GREEN_DYE_DMG = EnumDyeColor.GREEN.getDyeDamage();
        GameRegistry.addShapelessRecipe(new ItemStack(Items.SLIME_BALL,1),
                new Object[]{
                        new ItemStack(Items.DYE,1,WHITE_DYE_DMG),
                        new ItemStack(Items.DYE,1,WHITE_DYE_DMG),
                        PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.WATER),
                        new ItemStack(Items.DYE,1,GREEN_DYE_DMG)
                }
        );

        //Blaze Powder + Slimeball -> magma cream
        GameRegistry.addShapelessRecipe(new ItemStack(Items.MAGMA_CREAM,1),
                new Object[]{
                        new ItemStack(Items.SLIME_BALL,1),
                        new ItemStack(Items.BLAZE_POWDER,1)
                }
        );

        //Bone + 4 Coal -> Withered Bone (Add this)
        GameRegistry.addRecipe(new ItemStack(Items.BONE,1),
                new Object[]{
                        ".C.",
                        "CBC",
                        ".C.",
                        'C', Items.COAL,
                        'B', new ItemStack(Items.BONE,1)
                }
        );


    }
}
