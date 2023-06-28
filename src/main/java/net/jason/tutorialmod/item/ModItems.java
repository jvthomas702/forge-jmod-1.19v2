package net.jason.tutorialmod.item;

import net.jason.tutorialmod.TutorialMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> drug = Items.register("chili-p-crystal-meth",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> unrefined_drug = Items.register("unrefined_chili_meth",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static void register (IEventBus eventBus)
    {
        Items.register(eventBus);
    }
}


