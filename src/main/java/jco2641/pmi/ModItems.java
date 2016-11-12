package jco2641.pmi;

import jco2641.pmi.items.WitherBone;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

    public static WitherBone witherbone;

    public static void init(){
        witherbone = new WitherBone();
    }

    @SideOnly(Side.CLIENT)
    public static void initModels(){
        witherbone.initModel();
    }
}
