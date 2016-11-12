package jco2641.pmi.proxy;

import jco2641.pmi.ModItems;
import jco2641.pmi.ModRecipes;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e){
        ModItems.init();
    }

    public void init (FMLInitializationEvent e){
        ModRecipes.init();
    }

    public void postInit (FMLPostInitializationEvent e){

    }
}
