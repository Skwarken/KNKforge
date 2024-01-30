package net.skwarken.tutorialmod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.skwarken.tutorialmod.Knight_Mod;
import net.skwarken.tutorialmod.entity.custom.KnightEntity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Knight_Mod.MOD_ID);

    public static final RegistryObject<EntityType<KnightEntity>> KNIGHT=
            ENTITY_TYPES.register("knight", () -> EntityType.Builder.of(KnightEntity::new, MobCategory.CREATURE)
                    .sized(1, 2).build("knight"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
