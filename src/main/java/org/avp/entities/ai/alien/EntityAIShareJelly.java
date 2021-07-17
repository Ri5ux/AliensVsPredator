package org.avp.entities.ai.alien;

import org.avp.entities.living.species.SpeciesXenomorph;
import org.avp.entities.living.species.xenomorphs.EntityMatriarch;

import net.minecraft.entity.ai.EntityAIBase;

public class EntityAIShareJelly extends EntityAIBase
{

    private SpeciesXenomorph xenomorph;

    public EntityAIShareJelly(SpeciesXenomorph xenomorph)
    {
        super();
        this.xenomorph = xenomorph;
        this.setMutexBits(5);
    }

    @Override
    public boolean shouldExecute()
    {
        return this.xenomorph.getJellyLevel() > 0 && xenomorph.getHive() != null && xenomorph.getAttackTarget() == null;
    }

    @Override
    public void updateTask()
    {
        super.updateTask();
        if (this.xenomorph.getHive().getQueen() != null && !this.xenomorph.getHive().getQueen().isDead && !(this.xenomorph instanceof EntityMatriarch))
        {
            if (this.xenomorph.getHive().getQueen().getOvipositorSize() < EntityMatriarch.OVIPOSITOR_THRESHOLD_SIZE || this.xenomorph.getHive().getQueen().reproducing)
            {
                if (this.xenomorph.getHive().getQueen().getJellyLevel() < EntityMatriarch.OVIPOSITOR_JELLYLEVEL_THRESHOLD * 2 && this.xenomorph.getJellyLevel() >= 80)
                {
                    this.xenomorph.getHive().getQueen().setJellyLevel(this.xenomorph.getHive().getQueen().getJellyLevel() + this.xenomorph.getJellyLevel());
                    this.xenomorph.setJellyLevel(0);
                }
            }
        }
        else
            this.xenomorph.setHive(null);
    }
}
