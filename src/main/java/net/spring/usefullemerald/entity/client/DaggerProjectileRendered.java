package net.spring.usefullemerald.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.client.renderer.state.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.Identifier;
import net.spring.usefullemerald.UsefullEmerald;
import net.spring.usefullemerald.entity.custom.DaggerProjectileEntity;

public class DaggerProjectileRendered extends EntityRenderer<DaggerProjectileEntity,DaggerRenderState> {
    private DaggerProjectileModel model;

    public DaggerProjectileRendered(EntityRendererProvider.Context context) {
        super(context);
        this.model = new DaggerProjectileModel(context.bakeLayer(DaggerProjectileModel.LAYER_LOCATION));
    }

    @Override
    public DaggerRenderState createRenderState() {
        return new DaggerRenderState();
    }

    @Override
    public void submit(DaggerRenderState renderState, PoseStack poseStack, SubmitNodeCollector nodeCollector, CameraRenderState cameraRenderState) {

        poseStack.pushPose();

        poseStack.translate(0, -1, 0);
        poseStack.mulPose(Axis.YP.rotationDegrees(renderState.yRot - 180.0F));
        poseStack.mulPose(Axis.ZP.rotationDegrees(renderState.xRot));

        nodeCollector.submitModelPart(this.model.root(), poseStack, this.model.renderType(DaggerProjectileModel.TEXTURE), renderState.lightCoords, OverlayTexture.NO_OVERLAY, null, false, false, -1, null, 0);
        poseStack.popPose();

        super.submit(renderState, poseStack, nodeCollector, cameraRenderState);

    }


    public Identifier getTextureLocation() {
        return Identifier.fromNamespaceAndPath(UsefullEmerald.MODID, "textures/entity/dagger/dagger.png");
    }


    @Override
    public void extractRenderState(DaggerProjectileEntity entity, DaggerRenderState reusedState, float partialTick) {
        super.extractRenderState(entity, reusedState, partialTick);
        reusedState.yRot = entity.getYRot(partialTick);
        reusedState.xRot = entity.getXRot(partialTick);
    }
}
