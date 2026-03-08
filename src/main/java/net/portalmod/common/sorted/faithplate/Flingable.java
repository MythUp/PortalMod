package net.portalmod.common.sorted.faithplate;

import net.minecraft.entity.LivingEntity;

public interface Flingable {
    void setFlinging(LivingEntity entity, boolean flinging);
    boolean isFlinging();
}