package org.avp.client.model.entities.living;

import com.asx.mdx.lib.client.util.models.Model;

import net.minecraft.client.model.ModelRenderer;

public class ModelPredatorHound extends Model
{
    public ModelRenderer chest;
    public ModelRenderer stomach;
    public ModelRenderer lQuills;
    public ModelRenderer rQuills;
    public ModelRenderer lMidQuills;
    public ModelRenderer rMidQuills;
    public ModelRenderer lShoulder;
    public ModelRenderer rShoulder;
    public ModelRenderer neck;
    public ModelRenderer tail;
    public ModelRenderer lThigh;
    public ModelRenderer rThigh;
    public ModelRenderer lHip;
    public ModelRenderer rHip;
    public ModelRenderer lShin;
    public ModelRenderer lLowerLeg;
    public ModelRenderer lHPaw;
    public ModelRenderer lHClaws;
    public ModelRenderer rShin;
    public ModelRenderer rLowerLeg;
    public ModelRenderer rHPaw;
    public ModelRenderer rHClaws;
    public ModelRenderer lForearm;
    public ModelRenderer lFPaw;
    public ModelRenderer lFClaws;
    public ModelRenderer rForearm;
    public ModelRenderer rFPaw;
    public ModelRenderer rFClaws;
    public ModelRenderer head1;
    public ModelRenderer lHorn1a;
    public ModelRenderer rHorn1a;
    public ModelRenderer lTusk1;
    public ModelRenderer rTusk1;
    public ModelRenderer nose;
    public ModelRenderer jaw1;
    public ModelRenderer l2Horn1a;
    public ModelRenderer r2Horn1a;
    public ModelRenderer rNoseSpike1;
    public ModelRenderer lNoseSpike1;
    public ModelRenderer jawUpper;
    public ModelRenderer teethLower;
    public ModelRenderer lHorn2;
    public ModelRenderer lHorn3;
    public ModelRenderer lHorn1b;
    public ModelRenderer lHorn1c;
    public ModelRenderer lHorn1d;
    public ModelRenderer lHorn2_1;
    public ModelRenderer lHorn3_1;
    public ModelRenderer lHorn1b_1;
    public ModelRenderer lHorn1c_1;
    public ModelRenderer lHorn1d_1;
    public ModelRenderer rNoseSpike2;
    public ModelRenderer lNoseSpike2;
    public ModelRenderer teethUpper;
    public ModelRenderer lHorn2_2;
    public ModelRenderer lHorn3_2;
    public ModelRenderer lHorn1b_2;
    public ModelRenderer lHorn1c_2;
    public ModelRenderer lHorn1d_2;
    public ModelRenderer rHorn1c;
    public ModelRenderer rHorn1d;
    public ModelRenderer rHorn1b;
    public ModelRenderer rHorn2;
    public ModelRenderer rHorn3;
    public ModelRenderer lTusk2a;
    public ModelRenderer lTusk2b;
    public ModelRenderer lTusk2c;
    public ModelRenderer lTusk2d;
    public ModelRenderer lTusk3;
    public ModelRenderer lTusk4;
    public ModelRenderer rTusk2a;
    public ModelRenderer rTusk2b;
    public ModelRenderer rTusk2c;
    public ModelRenderer rTusk2d;
    public ModelRenderer rTusk3;
    public ModelRenderer rTusk4;

    public ModelPredatorHound()
    {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.rHorn1d = new ModelRenderer(this, 66, 8);
        this.rHorn1d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHorn1d.addBox(0.3F, -0.6F, -2.1F, 1, 1, 3, 0.0F);
        this.lQuills = new ModelRenderer(this, 0, 30);
        this.lQuills.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lQuills.addBox(2.5F, -8.5F, -2.8F, 0, 7, 12, 0.0F);
        this.setRotation(lQuills, 0.0F, 0.03490658503988659F, 0.10471975511965977F);
        this.rShin = new ModelRenderer(this, 50, 14);
        this.rShin.setRotationPoint(0.0F, 5.8F, 0.1F);
        this.rShin.addBox(-0.4F, -1.7F, -0.4F, 3, 3, 6, 0.0F);
        this.setRotation(rShin, -0.5009094953223726F, 0.0F, 0.0F);
        this.lHorn1c_2 = new ModelRenderer(this, 66, 8);
        this.lHorn1c_2.mirror = true;
        this.lHorn1c_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn1c_2.addBox(-1.2F, -1.0F, -2.1F, 1, 1, 3, 0.0F);
        this.rTusk2b = new ModelRenderer(this, 66, 8);
        this.rTusk2b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rTusk2b.addBox(-0.6F, 0.2F, -7.2F, 1, 1, 4, 0.0F);
        this.lHorn3_2 = new ModelRenderer(this, 66, 8);
        this.lHorn3_2.mirror = true;
        this.lHorn3_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn3_2.addBox(-1.0F, -2.6F, -10.5F, 1, 1, 4, 0.0F);
        this.setRotation(lHorn3_2, 0.2617993877991494F, 0.0F, 0.0F);
        this.rHClaws = new ModelRenderer(this, 61, 41);
        this.rHClaws.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.rHClaws.addBox(-1.5F, -0.3F, -1.7F, 3, 0, 3, 0.0F);
        this.setRotation(rHClaws, 0.5009094953223726F, 0.0F, 0.0F);
        this.lFPaw = new ModelRenderer(this, 33, 25);
        this.lFPaw.mirror = true;
        this.lFPaw.setRotationPoint(0.0F, 6.3F, 0.9F);
        this.lFPaw.addBox(-1.5F, 0.0F, -3.9F, 3, 2, 4, 0.0F);
        this.setRotation(lFPaw, 0.27314402793711257F, 0.0F, 0.136659280431156F);
        this.l2Horn1a = new ModelRenderer(this, 66, 8);
        this.l2Horn1a.setRotationPoint(2.7F, -0.4F, 1.4F);
        this.l2Horn1a.addBox(-0.8F, -1.0F, -2.1F, 1, 1, 3, 0.0F);
        this.setRotation(l2Horn1a, -0.5009094953223726F, -0.22689280275926282F, 0.0F);
        this.nose = new ModelRenderer(this, 80, 8);
        this.nose.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.nose.addBox(-1.5F, -2.56F, -3.8F, 3, 1, 2, 0.0F);
        this.setRotation(nose, 0.4553564018453205F, 0.0F, 0.0F);
        this.rTusk2a = new ModelRenderer(this, 66, 8);
        this.rTusk2a.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rTusk2a.addBox(-0.6F, -0.3F, -7.2F, 1, 1, 4, 0.0F);
        this.lShoulder = new ModelRenderer(this, 33, 0);
        this.lShoulder.mirror = true;
        this.lShoulder.setRotationPoint(4.0F, -0.3F, 1.0F);
        this.lShoulder.addBox(-1.8F, -0.6F, -3.2F, 3, 8, 4, 0.0F);
        this.setRotation(lShoulder, 0.18203784098300857F, -0.017453292519943295F, -0.15707963267948966F);
        this.rHip = new ModelRenderer(this, 32, 44);
        this.rHip.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHip.addBox(-3.0F, -5.3F, 4.5F, 3, 3, 5, 0.0F);
        this.setRotation(rHip, -0.136659280431156F, 0.0F, -0.40980330836826856F);
        this.lHorn1d = new ModelRenderer(this, 66, 8);
        this.lHorn1d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn1d.addBox(-1.2F, -0.6F, -2.1F, 1, 1, 3, 0.0F);
        this.lHorn1b_2 = new ModelRenderer(this, 66, 8);
        this.lHorn1b_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn1b_2.addBox(-0.8F, -0.6F, -2.1F, 1, 1, 3, 0.0F);
        this.lTusk2c = new ModelRenderer(this, 66, 8);
        this.lTusk2c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lTusk2c.addBox(-0.6F, -0.3F, -7.2F, 1, 1, 5, 0.0F);
        this.lHorn2_2 = new ModelRenderer(this, 65, 7);
        this.lHorn2_2.mirror = true;
        this.lHorn2_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn2_2.addBox(-1.0F, -0.8F, -7.0F, 1, 1, 5, 0.0F);
        this.rQuills = new ModelRenderer(this, 0, 30);
        this.rQuills.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rQuills.addBox(-1.5F, -8.5F, -2.8F, 0, 7, 12, 0.0F);
        this.setRotation(rQuills, 0.0F, -0.03490658503988659F, -0.10471975511965977F);
        this.lHorn2_1 = new ModelRenderer(this, 65, 7);
        this.lHorn2_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn2_1.addBox(-1.0F, -0.8F, -7.0F, 1, 1, 5, 0.0F);
        this.lLowerLeg = new ModelRenderer(this, 51, 25);
        this.lLowerLeg.mirror = true;
        this.lLowerLeg.setRotationPoint(1.0F, -0.4F, 5.2F);
        this.lLowerLeg.addBox(-1.5F, -0.5F, -1.4F, 3, 5, 2, 0.0F);
        this.setRotation(lLowerLeg, 0.36425021489121656F, 0.0F, 0.0F);
        this.teethUpper = new ModelRenderer(this, 0, 52);
        this.teethUpper.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.teethUpper.addBox(-1.5F, 0.2F, -5.2F, 3, 1, 2, 0.0F);
        this.lTusk4 = new ModelRenderer(this, 67, 9);
        this.lTusk4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lTusk4.addBox(-0.4F, 4.0F, -11.6F, 1, 1, 3, 0.0F);
        this.setRotation(lTusk4, -0.5235987755982988F, 0.0F, 0.0F);
        this.rForearm = new ModelRenderer(this, 34, 13);
        this.rForearm.mirror = true;
        this.rForearm.setRotationPoint(0.2F, 6.3F, -0.5F);
        this.rForearm.addBox(-1.3F, 0.0F, -1.5F, 3, 8, 3, 0.0F);
        this.setRotation(rForearm, -0.5918411493512771F, 0.0F, -0.045553093477052F);
        this.rHorn3 = new ModelRenderer(this, 66, 8);
        this.rHorn3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHorn3.addBox(0.1F, -2.6F, -10.5F, 1, 1, 4, 0.0F);
        this.setRotation(rHorn3, 0.2617993877991494F, 0.0F, 0.0F);
        this.jaw1 = new ModelRenderer(this, 80, 38);
        this.jaw1.setRotationPoint(0.0F, 1.4F, -1.5F);
        this.jaw1.addBox(-1.5F, -0.69F, -3.5F, 3, 1, 5, 0.0F);
        this.head1 = new ModelRenderer(this, 80, 15);
        this.head1.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.head1.addBox(-2.5F, -2.13F, -2.8F, 5, 4, 3, 0.0F);
        this.setRotation(head1, 0.2617993877991494F, 0.0F, 0.0F);
        this.lHorn1b_1 = new ModelRenderer(this, 66, 8);
        this.lHorn1b_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn1b_1.addBox(-0.8F, -0.6F, -2.1F, 1, 1, 3, 0.0F);
        this.lHorn2 = new ModelRenderer(this, 65, 7);
        this.lHorn2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn2.addBox(-1.0F, -0.8F, -7.0F, 1, 1, 5, 0.0F);
        this.lHorn1d_2 = new ModelRenderer(this, 66, 8);
        this.lHorn1d_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn1d_2.addBox(-1.2F, -0.6F, -2.1F, 1, 1, 3, 0.0F);
        this.r2Horn1a = new ModelRenderer(this, 66, 8);
        this.r2Horn1a.setRotationPoint(-1.7F, -0.4F, 1.4F);
        this.r2Horn1a.addBox(-0.8F, -1.0F, -2.1F, 1, 1, 3, 0.0F);
        this.setRotation(r2Horn1a, -0.5009094953223726F, 0.22689280275926282F, 0.0F);
        this.rHPaw = new ModelRenderer(this, 51, 34);
        this.rHPaw.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.rHPaw.addBox(-1.5F, -0.2F, -3.5F, 3, 2, 4, 0.0F);
        this.setRotation(rHPaw, 0.36425021489121656F, 0.0F, -0.15707963267948966F);
        this.lTusk3 = new ModelRenderer(this, 67, 9);
        this.lTusk3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lTusk3.addBox(-0.4F, 2.4F, -9.4F, 1, 1, 4, 0.0F);
        this.setRotation(lTusk3, -0.3490658503988659F, 0.0F, 0.0F);
        this.lThigh = new ModelRenderer(this, 48, 1);
        this.lThigh.mirror = true;
        this.lThigh.setRotationPoint(1.7F, -0.6F, 6.5F);
        this.lThigh.addBox(-1.0F, -0.9F, -1.1F, 4, 8, 4, 0.0F);
        this.setRotation(lThigh, -0.091106186954104F, 0.0F, -0.15707963267948966F);
        this.lTusk1 = new ModelRenderer(this, 66, 8);
        this.lTusk1.setRotationPoint(2.4F, 1.5F, -0.7F);
        this.lTusk1.addBox(-0.9F, -0.5F, -3.2F, 2, 2, 3, 0.0F);
        this.setRotation(lTusk1, 0.36425021489121656F, -0.3141592653589793F, 0.0F);
        this.lHClaws = new ModelRenderer(this, 61, 41);
        this.lHClaws.mirror = true;
        this.lHClaws.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.lHClaws.addBox(-1.5F, -0.3F, -1.7F, 3, 0, 3, 0.0F);
        this.setRotation(lHClaws, 0.5009094953223726F, 0.0F, 0.0F);
        this.lHorn1a = new ModelRenderer(this, 66, 8);
        this.lHorn1a.mirror = true;
        this.lHorn1a.setRotationPoint(2.8F, -2.3F, -1.0F);
        this.lHorn1a.addBox(-0.8F, -1.0F, -2.1F, 1, 1, 3, 0.0F);
        this.setRotation(lHorn1a, -0.36425021489121656F, -0.22689280275926282F, 0.0F);
        this.rHorn1c = new ModelRenderer(this, 66, 8);
        this.rHorn1c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHorn1c.addBox(0.3F, -1.0F, -2.1F, 1, 1, 3, 0.0F);
        this.rLowerLeg = new ModelRenderer(this, 51, 25);
        this.rLowerLeg.setRotationPoint(1.0F, -0.4F, 5.2F);
        this.rLowerLeg.addBox(-1.5F, -0.5F, -1.4F, 3, 5, 2, 0.0F);
        this.setRotation(rLowerLeg, 0.36425021489121656F, 0.0F, 0.0F);
        this.rNoseSpike2 = new ModelRenderer(this, 67, 9);
        this.rNoseSpike2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rNoseSpike2.addBox(-3.1F, -0.2F, -7.6F, 1, 1, 3, 0.0F);
        this.setRotation(rNoseSpike2, 0.0F, -0.4363323129985824F, 0.0F);
        this.tail = new ModelRenderer(this, 65, 1);
        this.tail.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail.addBox(-0.5F, 0.4F, 8.0F, 2, 2, 3, 0.0F);
        this.setRotation(tail, 0.31869712141416456F, 0.0F, 0.0F);
        this.lNoseSpike1 = new ModelRenderer(this, 67, 9);
        this.lNoseSpike1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lNoseSpike1.addBox(-0.1F, -0.1F, -5.4F, 1, 1, 3, 0.0F);
        this.setRotation(lNoseSpike1, -0.17453292519943295F, -0.4363323129985824F, 0.0F);
        this.lTusk2a = new ModelRenderer(this, 66, 8);
        this.lTusk2a.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lTusk2a.addBox(-0.1F, -0.3F, -7.2F, 1, 1, 5, 0.0F);
        this.stomach = new ModelRenderer(this, 1, 17);
        this.stomach.setRotationPoint(0.0F, 0.0F, 3.8F);
        this.stomach.addBox(-2.5F, -2.5F, 0.0F, 6, 5, 9, 0.0F);
        this.setRotation(stomach, -0.26703537555513246F, 0.0F, 0.0F);
        this.lTusk2b = new ModelRenderer(this, 66, 8);
        this.lTusk2b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lTusk2b.addBox(-0.1F, 0.2F, -7.2F, 1, 1, 5, 0.0F);
        this.rTusk3 = new ModelRenderer(this, 67, 9);
        this.rTusk3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rTusk3.addBox(-0.4F, 2.4F, -9.4F, 1, 1, 3, 0.0F);
        this.setRotation(rTusk3, -0.3490658503988659F, 0.0F, 0.0F);
        this.rFClaws = new ModelRenderer(this, 61, 41);
        this.rFClaws.setRotationPoint(0.0F, 1.3F, -3.5F);
        this.rFClaws.addBox(-1.5F, 0.0F, -2.0F, 3, 0, 3, 0.0F);
        this.setRotation(rFClaws, 0.22759093446006054F, 0.0F, 0.0F);
        this.lShin = new ModelRenderer(this, 50, 14);
        this.lShin.mirror = true;
        this.lShin.setRotationPoint(0.0F, 5.8F, 0.1F);
        this.lShin.addBox(-0.4F, -1.6F, -0.4F, 3, 3, 6, 0.0F);
        this.setRotation(lShin, -0.5009094953223726F, 0.0F, 0.0F);
        this.lHorn1b = new ModelRenderer(this, 66, 8);
        this.lHorn1b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn1b.addBox(-0.8F, -0.6F, -2.1F, 1, 1, 3, 0.0F);
        this.lHorn3_1 = new ModelRenderer(this, 66, 8);
        this.lHorn3_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn3_1.addBox(-1.0F, -2.6F, -10.5F, 1, 1, 4, 0.0F);
        this.setRotation(lHorn3_1, 0.2617993877991494F, 0.0F, 0.0F);
        this.rShoulder = new ModelRenderer(this, 33, 0);
        this.rShoulder.setRotationPoint(-3.0F, -0.3F, 1.0F);
        this.rShoulder.addBox(-1.2F, -0.6F, -3.2F, 3, 8, 4, 0.0F);
        this.setRotation(rShoulder, 0.18203784098300857F, 0.017453292519943295F, 0.15707963267948966F);
        this.rMidQuills = new ModelRenderer(this, 0, 19);
        this.rMidQuills.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rMidQuills.addBox(0.8F, -10.0F, -7.4F, 0, 8, 14, 0.0F);
        this.setRotation(rMidQuills, 0.0F, 0.0F, -0.22759093446006054F);
        this.lHorn3 = new ModelRenderer(this, 66, 8);
        this.lHorn3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn3.addBox(-1.0F, -2.6F, -10.5F, 1, 1, 4, 0.0F);
        this.setRotation(lHorn3, 0.2617993877991494F, 0.0F, 0.0F);
        this.lHip = new ModelRenderer(this, 32, 44);
        this.lHip.mirror = true;
        this.lHip.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHip.addBox(0.8F, -5.6F, 4.5F, 3, 3, 5, 0.0F);
        this.setRotation(lHip, -0.136659280431156F, 0.0F, 0.40980330836826856F);
        this.rHorn2 = new ModelRenderer(this, 65, 7);
        this.rHorn2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHorn2.addBox(0.1F, -0.8F, -7.0F, 1, 1, 5, 0.0F);
        this.lMidQuills = new ModelRenderer(this, 0, 19);
        this.lMidQuills.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lMidQuills.addBox(0.5F, -10.0F, -7.4F, 0, 8, 14, 0.0F);
        this.setRotation(lMidQuills, 0.0F, 0.0F, 0.22759093446006054F);
        this.rTusk2c = new ModelRenderer(this, 66, 8);
        this.rTusk2c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rTusk2c.addBox(-0.1F, -0.3F, -7.2F, 1, 1, 4, 0.0F);
        this.rHorn1a = new ModelRenderer(this, 66, 8);
        this.rHorn1a.setRotationPoint(-2.9F, -2.3F, -1.0F);
        this.rHorn1a.addBox(-0.1F, -1.0F, -2.1F, 1, 1, 3, 0.0F);
        this.setRotation(rHorn1a, -0.36425021489121656F, 0.22689280275926282F, 0.0F);
        this.lHorn1c = new ModelRenderer(this, 66, 8);
        this.lHorn1c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn1c.addBox(-1.2F, -1.0F, -2.1F, 1, 1, 3, 0.0F);
        this.neck = new ModelRenderer(this, 80, 23);
        this.neck.setRotationPoint(0.5F, 0.0F, -3.5F);
        this.neck.addBox(-2.5F, -2.3F, -3.9F, 5, 5, 3, 0.0F);
        this.setRotation(neck, 0.03490658503988659F, 0.0F, 0.0F);
        this.teethLower = new ModelRenderer(this, 0, 57);
        this.teethLower.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.teethLower.addBox(-1.5F, -1.5F, -3.4F, 3, 1, 2, 0.0F);
        this.lNoseSpike2 = new ModelRenderer(this, 67, 9);
        this.lNoseSpike2.setRotationPoint(0.0F, 0.0F, -0.0F);
        this.lNoseSpike2.addBox(2.1F, -0.1F, -7.5F, 1, 1, 3, 0.0F);
        this.setRotation(lNoseSpike2, 0.0F, 0.4363323129985824F, 0.0F);
        this.lHorn1c_1 = new ModelRenderer(this, 66, 8);
        this.lHorn1c_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn1c_1.addBox(-1.2F, -1.0F, -2.1F, 1, 1, 3, 0.0F);
        this.lHorn1d_1 = new ModelRenderer(this, 66, 8);
        this.lHorn1d_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn1d_1.addBox(-1.2F, -0.6F, -2.1F, 1, 1, 3, 0.0F);
        this.chest = new ModelRenderer(this, 0, 0);
        this.chest.setRotationPoint(0.0F, 10.2F, -4.5F);
        this.chest.addBox(-2.9F, -3.0F, -4.5F, 7, 7, 9, 0.0F);
        this.setRotation(chest, 0.12217304763960307F, 0.0F, 0.0F);
        this.rThigh = new ModelRenderer(this, 48, 1);
        this.rThigh.setRotationPoint(-3.0F, -0.6F, 6.5F);
        this.rThigh.addBox(-1.0F, -1.3F, -1.1F, 4, 8, 4, 0.0F);
        this.setRotation(rThigh, -0.091106186954104F, 0.0F, 0.15707963267948966F);
        this.rNoseSpike1 = new ModelRenderer(this, 67, 9);
        this.rNoseSpike1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rNoseSpike1.addBox(-0.9F, -0.1F, -5.4F, 1, 1, 3, 0.0F);
        this.setRotation(rNoseSpike1, -0.17453292519943295F, 0.4363323129985824F, 0.0F);
        this.jawUpper = new ModelRenderer(this, 95, 8);
        this.jawUpper.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jawUpper.addBox(-1.5F, -0.6F, -5.2F, 3, 1, 3, 0.0F);
        this.rHorn1b = new ModelRenderer(this, 66, 8);
        this.rHorn1b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHorn1b.addBox(-0.1F, -0.6F, -2.1F, 1, 1, 3, 0.0F);
        this.rTusk2d = new ModelRenderer(this, 66, 8);
        this.rTusk2d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rTusk2d.addBox(-0.1F, 0.2F, -7.2F, 1, 1, 4, 0.0F);
        this.lTusk2d = new ModelRenderer(this, 66, 8);
        this.lTusk2d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lTusk2d.addBox(-0.6F, 0.2F, -7.2F, 1, 1, 5, 0.0F);
        this.rTusk4 = new ModelRenderer(this, 67, 9);
        this.rTusk4.setRotationPoint(0.0F, 0.0F, 0.0F); 
        this.rTusk4.addBox(-0.4F, 4.0F, -11.6F, 1, 1, 3, 0.0F);
        this.setRotation(rTusk4, -0.5235987755982988F, 0.0F, 0.0F);
        this.lHPaw = new ModelRenderer(this, 51, 34);
        this.lHPaw.mirror = true;
        this.lHPaw.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.lHPaw.addBox(-1.5F, -0.2F, -3.5F, 3, 2, 4, 0.0F);
        this.setRotation(lHPaw, 0.36425021489121656F, 0.0F, 0.15707963267948966F);
        this.rFPaw = new ModelRenderer(this, 33, 25);
        this.rFPaw.setRotationPoint(0.0F, 6.3F, 0.9F);
        this.rFPaw.addBox(-1.5F, 0.0F, -3.9F, 3, 2, 4, 0.0F);
        this.setRotation(rFPaw, 0.27314402793711257F, 0.0F, -0.091106186954104F);
        this.lForearm = new ModelRenderer(this, 34, 13);
        this.lForearm.mirror = true;
        this.lForearm.setRotationPoint(-0.2F, 6.3F, -0.5F);
        this.lForearm.addBox(-1.7F, 0.0F, -1.5F, 3, 8, 3, 0.0F);
        this.setRotation(lForearm, -0.5918411493512771F, 0.0F, 0.045553093477052F);
        this.lFClaws = new ModelRenderer(this, 61, 41);
        this.lFClaws.mirror = true;
        this.lFClaws.setRotationPoint(0.0F, 1.3F, -3.5F);
        this.lFClaws.addBox(-1.5F, 0.0F, -2.0F, 3, 0, 3, 0.0F);
        this.setRotation(lFClaws, 0.22759093446006054F, 0.0F, 0.0F);
        this.rTusk1 = new ModelRenderer(this, 66, 8);
        this.rTusk1.setRotationPoint(-2.5F, 1.5F, -0.7F);
        this.rTusk1.addBox(-0.9F, -0.5F, -3.2F, 2, 2, 3, 0.0F);
        this.setRotation(rTusk1, 0.36425021489121656F, 0.3141592653589793F, 0.0F);
        this.rHorn1a.addChild(this.rHorn1d);
        this.chest.addChild(this.lQuills);
        this.rThigh.addChild(this.rShin);
        this.lHorn1a.addChild(this.lHorn1c_2);
        this.rTusk1.addChild(this.rTusk2b);
        this.lHorn1a.addChild(this.lHorn3_2);
        this.rHPaw.addChild(this.rHClaws);
        this.lForearm.addChild(this.lFPaw);
        this.head1.addChild(this.l2Horn1a);
        this.head1.addChild(this.nose);
        this.rTusk1.addChild(this.rTusk2a);
        this.chest.addChild(this.lShoulder);
        this.stomach.addChild(this.rHip);
        this.l2Horn1a.addChild(this.lHorn1d);
        this.lHorn1a.addChild(this.lHorn1b_2);
        this.lTusk1.addChild(this.lTusk2c);
        this.lHorn1a.addChild(this.lHorn2_2);
        this.chest.addChild(this.rQuills);
        this.r2Horn1a.addChild(this.lHorn2_1);
        this.lShin.addChild(this.lLowerLeg);
        this.jawUpper.addChild(this.teethUpper);
        this.lTusk1.addChild(this.lTusk4);
        this.rShoulder.addChild(this.rForearm);
        this.rHorn1a.addChild(this.rHorn3);
        this.head1.addChild(this.jaw1);
        this.neck.addChild(this.head1);
        this.r2Horn1a.addChild(this.lHorn1b_1);
        this.l2Horn1a.addChild(this.lHorn2);
        this.lHorn1a.addChild(this.lHorn1d_2);
        this.head1.addChild(this.r2Horn1a);
        this.rLowerLeg.addChild(this.rHPaw);
        this.lTusk1.addChild(this.lTusk3);
        this.stomach.addChild(this.lThigh);
        this.neck.addChild(this.lTusk1);
        this.lHPaw.addChild(this.lHClaws);
        this.neck.addChild(this.lHorn1a);
        this.rHorn1a.addChild(this.rHorn1c);
        this.rShin.addChild(this.rLowerLeg);
        this.rNoseSpike1.addChild(this.rNoseSpike2);
        this.stomach.addChild(this.tail);
        this.head1.addChild(this.lNoseSpike1);
        this.lTusk1.addChild(this.lTusk2a);
        this.chest.addChild(this.stomach);
        this.lTusk1.addChild(this.lTusk2b);
        this.rTusk1.addChild(this.rTusk3);
        this.rFPaw.addChild(this.rFClaws);
        this.lThigh.addChild(this.lShin);
        this.l2Horn1a.addChild(this.lHorn1b);
        this.r2Horn1a.addChild(this.lHorn3_1);
        this.chest.addChild(this.rShoulder);
        this.chest.addChild(this.rMidQuills);
        this.l2Horn1a.addChild(this.lHorn3);
        this.stomach.addChild(this.lHip);
        this.rHorn1a.addChild(this.rHorn2);
        this.chest.addChild(this.lMidQuills);
        this.rTusk1.addChild(this.rTusk2c);
        this.neck.addChild(this.rHorn1a);
        this.l2Horn1a.addChild(this.lHorn1c);
        this.chest.addChild(this.neck);
        this.jaw1.addChild(this.teethLower);
        this.lNoseSpike1.addChild(this.lNoseSpike2);
        this.r2Horn1a.addChild(this.lHorn1c_1);
        this.r2Horn1a.addChild(this.lHorn1d_1);
        this.stomach.addChild(this.rThigh);
        this.head1.addChild(this.rNoseSpike1);
        this.head1.addChild(this.jawUpper);
        this.rHorn1a.addChild(this.rHorn1b);
        this.rTusk1.addChild(this.rTusk2d);
        this.lTusk1.addChild(this.lTusk2d);
        this.rTusk1.addChild(this.rTusk4);
        this.lLowerLeg.addChild(this.lHPaw);
        this.rForearm.addChild(this.rFPaw);
        this.lShoulder.addChild(this.lForearm);
        this.lFPaw.addChild(this.lFClaws);
        this.neck.addChild(this.rTusk1);
    }

    @Override
    public void render(Object obj)
    {
        draw(chest);
    }
}
