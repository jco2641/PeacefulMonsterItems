package jco2641.pmi;

import jco2641.pmi.proxy.CommonProxy;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Level;

public class Config {

    private static final String CATEGORY_GENERAL = "general";
    private static final String CATEGORY_RECIPES = "recipes";

    //General category stuff here
    // ??

    //Recipe category toggles
    public static boolean slimeball         = true;
    public static boolean blaze_rod         = true;
    public static boolean magma_cream       = true;
    public static boolean wither_bone       = true;
    public static boolean wither_skull      = true;
    public static boolean rotten_flesh      = true;
    public static boolean zombie_skull      = true;
    public static boolean gunpowder         = true;
    public static boolean creeper_skull     = true;
    public static boolean skeleton_skull    = true;
    public static boolean player_skull      = true;
    public static boolean ghast_tear        = true;
    public static boolean ender_pearl       = true;
    public static boolean end_stone         = true;
    public static boolean nether_star       = true;

    public static void readConfig(){
        Configuration cfg = CommonProxy.config;
        try {
            cfg.load();
            //initGeneralConfig(cfg);
            initRecipesConfig(cfg);
        } catch (Exception e1) {
            PeacefulMonsterItems.logger.log(Level.ERROR, "Problem loading config file", e1);
        } finally {
            if (cfg.hasChanged()){
                cfg.save();
            }
        }
    }

    private static void initGeneralConfig(Configuration cfg){
        cfg.addCustomCategoryComment(CATEGORY_GENERAL,"General Configuration");
        //init whatever things here
    }

    private static void initRecipesConfig(Configuration cfg){
        cfg.addCustomCategoryComment(CATEGORY_RECIPES,"Disable added recipes.");
        slimeball =         cfg.getBoolean("slimeball",     CATEGORY_RECIPES,true,"Enable Slime Ball recipe");
        blaze_rod =         cfg.getBoolean("blaze_rod",     CATEGORY_RECIPES,true,"Enable Blaze Rod recipe");
        magma_cream =       cfg.getBoolean("magma_cream",   CATEGORY_RECIPES,true,"Enable Magma Cream recipe");
        wither_bone =       cfg.getBoolean("wither_bone",   CATEGORY_RECIPES,true,"Enable Withered Bone recipe");
        wither_skull =      cfg.getBoolean("wither_skull",  CATEGORY_RECIPES,true,"Enable Wither Skeleton Skull recipe");
        rotten_flesh =      cfg.getBoolean("rotten_flesh",  CATEGORY_RECIPES,true,"Enable Rotten Flesh recipe");
        zombie_skull =      cfg.getBoolean("zombie_skull",  CATEGORY_RECIPES,true,"Enable Zombie Head recipe");
        gunpowder =         cfg.getBoolean("gunpowder",     CATEGORY_RECIPES,true,"Enable Gunpowder recipe");
        creeper_skull =     cfg.getBoolean("creeper_skull", CATEGORY_RECIPES,true,"Enable Creeper Head recipe");
        skeleton_skull =    cfg.getBoolean("skeleton_skull",CATEGORY_RECIPES,true,"Enable Skeleton Skull recipe");
        player_skull =      cfg.getBoolean("player_skull",  CATEGORY_RECIPES,true,"Enable Player Head recipe");
        ghast_tear =        cfg.getBoolean("ghast_tear",    CATEGORY_RECIPES,true,"Enable Ghast Tear recipe");
        ender_pearl =       cfg.getBoolean("ender_pearl",   CATEGORY_RECIPES,true,"Enable Ender Pearl recipe");
        end_stone =         cfg.getBoolean("end_stone",     CATEGORY_RECIPES,true,"Enable End Stone recipe");
        nether_star =       cfg.getBoolean("nether_star",   CATEGORY_RECIPES,true,"Enable Nether Star recipe");
    }

}
