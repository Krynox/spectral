package me.krynox.spectral.client.rendering.entity;

import me.krynox.spectral.Spectral;
import me.krynox.spectral.entity.SpiritEntity;
import me.krynox.spectral.magic.MagicType;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class SpiritModel extends GeoModel<SpiritEntity> {
    private String type;
    public SpiritModel(MagicType type) {
        this.type = type.toString().toLowerCase();
    }
    @Override
    public ResourceLocation getModelResource(SpiritEntity animatable) {
        return Spectral.resLoc("geo/entity/spirit.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SpiritEntity animatable) {
        return Spectral.resLoc("textures/entity/" + type + "_spirit.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SpiritEntity animatable) {
        return Spectral.resLoc("animations/entity/spirit.animation.json");
    }
}
