package net.skwarken.tutorialmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.skwarken.tutorialmod.Knight_Mod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Knight_Mod.MOD_ID);

    public static final RegistryObject<Item> LONG_SWORD = ITEMS.register("long_sword",
            () -> new Item(new Item.Properties()));

    public  static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
