package net.spring.usefullemerald.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import com.mojang.serialization.MapCodec;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.object.projectile.TridentModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.special.SpecialModelRenderer;
import net.minecraft.client.renderer.special.TridentSpecialRenderer;
import net.minecraft.client.renderer.state.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.resources.Identifier;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.spring.usefullemerald.UsefullEmerald;
import net.spring.usefullemerald.entity.custom.DaggerProjectileEntity;

public class DaggerProjectileRendered extends EntityRenderer<DaggerProjectileEntity,EntityRenderState> {
    private DaggerProjectileModel model;

    public DaggerProjectileRendered(EntityRendererProvider.Context context) {
        super(context);
        this.model = new DaggerProjectileModel(context.bakeLayer(DaggerProjectileModel.LAYER_LOCATION));
    }

    @Override
    public EntityRenderState createRenderState() {
        return new EntityRenderState();
    }

    @Override
    public void submit(EntityRenderState renderState, PoseStack poseStack, SubmitNodeCollector nodeCollector, CameraRenderState cameraRenderState) {
        super.submit(renderState, poseStack, nodeCollector, cameraRenderState);

        poseStack.pushPose();
        poseStack.scale(1.0F, -1.0F, -1.0F);
        poseStack.mulPose(Axis.YP.rotationDegrees(- 90.0F));
        nodeCollector.submitModelPart(this.model.root(), poseStack, this.model.renderType(DaggerProjectileModel.TEXTURE), renderState.lightCoords, OverlayTexture.NO_OVERLAY, null, false, false, -1, null, 0);
        poseStack.popPose();

    }


    public Identifier getTextureLocation() {
        return Identifier.fromNamespaceAndPath(UsefullEmerald.MODID, "textures/entity/dagger/dagger.png");
    }

    //


}
