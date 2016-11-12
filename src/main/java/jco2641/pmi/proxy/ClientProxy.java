package jco2641.pmi.proxy;

import jco2641.pmi.ModItems;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy{

    @Override
    public void preInit(FMLPreInitializationEvent e){
        super.preInit(e);
        ModItems.initModels();
    }
}
