// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
package net.skwarken.tutorialmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;

public class KnightModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart Root;
	private final ModelPart Head;

	public KnightModel(ModelPart root) {
		this.Root = root.getChild("Root");
		this.Head = Root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Root = partdefinition.addOrReplaceChild("Root", CubeListBuilder.create(), PartPose.offset(0.0F, 3.0F, 0.0F));

		PartDefinition Upperbody = Root.addOrReplaceChild("Upperbody", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Torso = Upperbody.addOrReplaceChild("Torso", CubeListBuilder.create().texOffs(30, 12).addBox(-5.0F, 7.0F, -2.0F, 10.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(24, 0).addBox(-6.0F, 6.0F, -3.0F, 12.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(24, 27).addBox(-5.0F, 3.0F, -2.0F, 10.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 16).addBox(-6.0F, -2.0F, -3.0F, 12.0F, 5.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(32, 7).addBox(-5.0F, -3.0F, -2.0F, 10.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hipcape = Torso.addOrReplaceChild("hipcape", CubeListBuilder.create(), PartPose.offset(-0.25F, 9.0F, 0.25F));

		PartDefinition cube_r1 = hipcape.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -2.0F, -0.25F, 0.0F, -1.5708F, 0.0873F));

		PartDefinition cube_r2 = hipcape.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 57).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5F, -2.0F, -0.25F, 0.0F, 1.5708F, -0.0873F));

		PartDefinition cube_r3 = hipcape.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(8, 57).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 8.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(58, 12).addBox(-8.5F, 0.0F, 0.0F, 4.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -2.0F, -2.25F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hipcape.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(24, 34).addBox(-2.0F, 0.0F, 0.0F, 11.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.25F, -2.0F, 1.75F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cape = Torso.addOrReplaceChild("cape", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r5 = cape.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 27).addBox(-6.0F, -1.0F, 0.0F, 12.0F, 20.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 3.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Arms = Upperbody.addOrReplaceChild("Arms", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right2 = Arms.addOrReplaceChild("right2", CubeListBuilder.create().texOffs(41, 37).addBox(-10.5F, -3.0F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition upper = right2.addOrReplaceChild("upper", CubeListBuilder.create().texOffs(16, 52).addBox(-10.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition lower = upper.addOrReplaceChild("lower", CubeListBuilder.create().texOffs(0, 47).addBox(-10.0F, 4.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left2 = Arms.addOrReplaceChild("left2", CubeListBuilder.create().texOffs(36, 18).addBox(5.5F, -3.0F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition upper2 = left2.addOrReplaceChild("upper2", CubeListBuilder.create().texOffs(24, 42).addBox(6.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition lower2 = upper2.addOrReplaceChild("lower2", CubeListBuilder.create().texOffs(40, 44).addBox(6.0F, 4.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Head = Root.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -11.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition legs = Root.addOrReplaceChild("legs", CubeListBuilder.create(), PartPose.offset(0.0F, 21.0F, 0.0F));

		PartDefinition right = legs.addOrReplaceChild("right", CubeListBuilder.create().texOffs(32, 54).addBox(-5.0F, -12.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition low = right.addOrReplaceChild("low", CubeListBuilder.create().texOffs(56, 31).addBox(-5.0F, -6.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left = legs.addOrReplaceChild("left", CubeListBuilder.create().texOffs(52, 21).addBox(-5.0F, -12.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 0.0F, 0.0F));

		PartDefinition low2 = left.addOrReplaceChild("low2", CubeListBuilder.create().texOffs(52, 50).addBox(-5.0F, -6.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return null;
	}
}