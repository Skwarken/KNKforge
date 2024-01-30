package net.skwarken.tutorialmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.skwarken.tutorialmod.Knight_Mod;
import net.skwarken.tutorialmod.entity.custom.KnightEntity;

public class KnightRenderer extends MobRenderer<KnightEntity, KnightModel<KnightEntity>> {
    public KnightRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new KnightModel<>(pContext.bakeLayer(ModmodelLayers.KNIGHT_LAYER)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(KnightEntity knightEntity) {
        return new ResourceLocation(Knight_Mod.MOD_ID, "textures/entity/knight.png");
    }

    @Override
    public void render(KnightEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {



        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
