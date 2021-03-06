package org.avp.client.render.items;

import org.avp.AliensVsPredator;
import org.avp.client.model.tile.ModelCryostasisTube;
import org.lwjgl.opengl.GL11;

import com.asx.mdx.lib.client.util.ItemRenderer;
import com.asx.mdx.lib.client.util.OpenGL;

import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class RenderItemCryostasisTube extends ItemRenderer<ModelCryostasisTube>
{
    public RenderItemCryostasisTube()
    {
        super(AliensVsPredator.resources().models().CRYOSTASIS_TUBE);
    }

    @Override
    public void renderThirdPersonRight(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType)
    {
        float glScale = 0.75F;

        OpenGL.translate(0F, -0.3F, -0.35F);
        OpenGL.disableCullFace();
        OpenGL.scale(glScale, -glScale, -glScale);
        this.getModel().draw();

        OpenGL.pushMatrix();
        {
            AliensVsPredator.resources().models().CRYOSTASIS_TUBE_MASK.draw();
        }
        OpenGL.popMatrix();
        OpenGL.enableCullFace();
    }

    @Override
    public void renderFirstPersonRight(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType)
    {
        float glScale = 0.5F;

        OpenGL.translate(0.1F, 0.4F, -0.1F);
        OpenGL.disableCullFace();
        OpenGL.scale(glScale, -glScale, glScale);
        this.getModel().draw();

        OpenGL.pushMatrix();
        {
            AliensVsPredator.resources().models().CRYOSTASIS_TUBE_MASK.draw();
        }
        OpenGL.popMatrix();
        OpenGL.enableCullFace();
    }

    @Override
    public void renderInInventory(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType)
    {
        float glScale = 0.5F;
        OpenGL.scale(glScale, glScale, glScale);
        OpenGL.translate(0.25F, 0.1F, 0F);
        OpenGL.rotate(230F, 1F, 0F, 0F);
        OpenGL.rotate(45F, 0F, 0F, 1F);
        OpenGL.rotate(230F, 0.0F, 1.0F, 0.0F);
        OpenGL.disableCullFace();
        this.getModel().draw();
        AliensVsPredator.resources().models().CRYOSTASIS_TUBE_MASK.draw();
        OpenGL.enableCullFace();
    }

    @Override
    public void renderInWorld(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType)
    {
        OpenGL.scale(0.5F, -0.5F, 0.5F);
        OpenGL.translate(0F, -1.5F, 0F);
        OpenGL.disableCullFace();
        this.getModel().draw();

        OpenGL.pushMatrix();
        {
            OpenGL.enable(GL11.GL_BLEND);
            AliensVsPredator.resources().models().CRYOSTASIS_TUBE_MASK.draw();
            OpenGL.disableBlend();
        }
        OpenGL.popMatrix();
        OpenGL.enableCullFace();
    }
}
