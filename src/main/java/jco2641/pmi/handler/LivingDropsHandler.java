package jco2641.pmi.handler;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.init.Items;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class LivingDropsHandler {

    private float dropRate = 0.45F;
    private int qtyDrop = 0;

    @SubscribeEvent
    public void onEntityDrop (LivingDropsEvent event) {
        Entity entity = event.getEntity();
        EntityLivingBase living = event.getEntityLiving();

        if (event.getSource().getDamageType().equals("player")) {
            if (entity instanceof EntityAnimal) {
                if (entity.worldObj.rand.nextFloat() < dropRate) {
                    //Random roll 1-3
                    qtyDrop = entity.worldObj.rand.nextInt(3) + 1;
                    living.dropItem(Items.BONE, qtyDrop);
                }
            }
        }
    }
}