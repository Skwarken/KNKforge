package net.skwarken.tutorialmod.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.skwarken.tutorialmod.Knight_Mod;
import net.skwarken.tutorialmod.entity.client.KnightModel;
import net.skwarken.tutorialmod.entity.client.ModmodelLayers;

@Mod.EventBusSubscriber(modid = Knight_Mod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientsEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModmodelLayers.KNIGHT_LAYER, KnightModel::createBodyLayer);
    }
}
