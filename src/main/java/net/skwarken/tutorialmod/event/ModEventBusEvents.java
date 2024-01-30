package net.skwarken.tutorialmod.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.skwarken.tutorialmod.Knight_Mod;
import net.skwarken.tutorialmod.entity.ModEntities;
import net.skwarken.tutorialmod.entity.custom.KnightEntity;

@Mod.EventBusSubscriber(modid = Knight_Mod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event){
        event.put(ModEntities.KNIGHT.get(), KnightEntity.createAttributes().build());
    }
}
