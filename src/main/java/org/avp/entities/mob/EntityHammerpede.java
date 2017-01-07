package org.avp.entities.mob;

import java.util.ArrayList;

import org.avp.AliensVsPredator;
import org.avp.Sounds;
import org.avp.entities.EntityAcidPool;

import com.arisux.mdxlib.lib.world.CoordData;
import com.arisux.mdxlib.lib.world.block.Blocks;

import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.monster.IMob;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class EntityHammerpede extends EntitySpeciesAlien implements IMob
{
    public static IEntitySelector entitySelector = new IEntitySelector()
    {
        @Override
        public boolean isEntityApplicable(Entity entity)
        {
            return !(entity instanceof EntitySpeciesAlien) && !(entity instanceof EntityHammerpede) && !(entity instanceof EntityAcidPool);
        }
    };

    public EntityHammerpede(World par1World)
    {
        super(par1World);

        this.setSize(0.5F, 0.5F);
        this.experienceValue = 16;
        this.getNavigator().setCanSwim(true);
        this.getNavigator().setAvoidsWater(false);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, 0.8D, true));
        this.targetTasks.addTask(0, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, Entity.class, 10 /** targetChance **/
            , false /** checkSight **/
            , false /** nearbyOnly **/
            , entitySelector));
    }

    @Override
    public boolean canBreatheUnderwater()
    {
        return true;
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(14.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5499999761581421D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(0.5D);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(32.0D);
    }

    @Override
    protected void entityInit()
    {
        super.entityInit();
    }

    @Override
    protected boolean isAIEnabled()
    {
        return true;
    }

    @Override
    public void onUpdate()
    {
        super.onUpdate();
        this.fallDistance = 0F;
        this.lurkInBlackGoo();
    }

    public void lurkInBlackGoo()
    {
        if (this.getAttackTarget() == null)
        {
            if (this.worldObj.getWorldTime() % 40 == 0 && this.rand.nextInt(4) == 0)
            {
                if (this.worldObj.getBlock((int) this.posX, (int) this.posY, (int) this.posZ) != AliensVsPredator.blocks().blockBlackGoo)
                {
                    ArrayList<CoordData> coordData = Blocks.getCoordDataInRangeIncluding((int) this.posX, (int) this.posY, (int) this.posZ, (int) 10, this.worldObj, AliensVsPredator.blocks().blockBlackGoo);

                    if (coordData.size() > 0)
                    {
                        CoordData selectedCoord = coordData.get(this.rand.nextInt(coordData.size()));
                        this.getNavigator().tryMoveToXYZ((double) selectedCoord.x, (double) selectedCoord.y, (double) selectedCoord.z, this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).getAttributeValue());
                    }
                    coordData.clear();
                    coordData = null;
                }
            }
        }
    }

    @Override
    protected String getDeathSound()
    {
        return Sounds.SOUND_CHESTBURSTER_ATTACK.getKey();
    }

    @Override
    protected String getHurtSound()
    {
        return Sounds.SOUND_CHESTBURSTER_HURT.getKey();
    }

    @Override
    protected boolean canTriggerWalking()
    {
        return false;
    }

    @Override
    protected boolean canDespawn()
    {
        return false;
    }

    @Override
    public boolean isOnLadder()
    {
        return this.isCollidedHorizontally;
    }

    public boolean isClimbing()
    {
        return this.isOnLadder() && this.motionY > 1.0099999997764826D;
    }

    @Override
    protected void attackEntity(Entity entity, float damage)
    {
        super.attackEntity(entity, damage);
    }

    @Override
    public boolean isPotionApplicable(PotionEffect potionEffect)
    {
        return potionEffect.getPotionID() == Potion.poison.id ? false : super.isPotionApplicable(potionEffect);
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound nbt)
    {
        super.readEntityFromNBT(nbt);
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound nbt)
    {
        super.writeEntityToNBT(nbt);
    }
}
