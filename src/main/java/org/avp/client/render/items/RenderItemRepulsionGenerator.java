package org.avp.client.render.items;

import org.avp.AliensVsPredator;
import org.avp.client.model.tile.ModelRepulsionGenerator;

import com.asx.mdx.lib.client.util.ItemRenderer;
import com.asx.mdx.lib.client.util.OpenGL;

import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class RenderItemRepulsionGenerator extends ItemRenderer<ModelRepulsionGenerator>
{
    public RenderItemRepulsionGenerator()
    {
        super(AliensVsPredator.resources().models().REPULSION_GENERATOR);
    }

    @Override
    public void renderThirdPersonRight(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType)
    {
        float glScale = 0.8F;
        OpenGL.translate(0, 0.5F, 0F);
        OpenGL.scale(glScale, -glScale, glScale);
        OpenGL.disableCullFace();
        this.getModel().draw();
        OpenGL.enableCullFace();
    }

    @Override
    public void renderFirstPersonRight(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType)
    {
        float glScale = 0.35F;
        OpenGL.translate(-0.2F, 0.55F, 0.2F);
        OpenGL.rotate(95.0F, 1.0F, 0.0F, 0.0F);
        OpenGL.rotate(120.0F, 0.0F, 1.0F, 0.0F);
        OpenGL.rotate(79.0F, 0.0F, 0.0F, 1.0F);
        OpenGL.scale(glScale, glScale, glScale);
        this.getModel().draw();
    }

    @Override
    public void renderInInventory(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType)
    {
        float glScale = 0.65F;
        OpenGL.scale(glScale, glScale, glScale);
        OpenGL.translate(0.65F, 0.45F, 0F);
        OpenGL.rotate(230F, 1F, 0F, 0F);
        OpenGL.rotate(45F, 0F, 0F, 1F);
        OpenGL.rotate(90F, 0.0F, 1.0F, 0.0F);
        this.getModel().draw();
    }

    @Override
    public void renderInWorld(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType)
    {
        OpenGL.scale(1F, -1F, 1F);
        OpenGL.translate(0F, -1.5F, 0F);
        OpenGL.disableCullFace();
        this.getModel().draw();
        OpenGL.enableCullFace();
    }
}
