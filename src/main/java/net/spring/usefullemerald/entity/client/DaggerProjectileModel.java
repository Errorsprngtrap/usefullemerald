package net.spring.usefullemerald.entity.client;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.resources.Identifier;
import net.spring.usefullemerald.UsefullEmerald;

public class DaggerProjectileModel extends EntityModel<EntityRenderState> {
    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(Identifier.fromNamespaceAndPath(UsefullEmerald.MODID, "dagger_converted"), "main");
    public static final Identifier TEXTURE =
            Identifier.fromNamespaceAndPath(UsefullEmerald.MODID, "textures/entity/dagger/dagger.png");
    private final ModelPart main;

    public DaggerProjectileModel(ModelPart root) {
        super(root);
        this.main = root.getChild("main");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 2.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(10, 8).addBox(-1.0F, -5.0F, 0.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(10, 9).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 13).addBox(-2.0F, 1.0F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 16.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 16, 16);
    }

    @Override
    public void setupAnim(EntityRenderState state) {

    }

}
