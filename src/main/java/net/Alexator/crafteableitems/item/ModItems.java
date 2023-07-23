package net.Alexator.crafteableitems.item;

import net.Alexator.crafteableitems.crafteableitems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {


    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, crafteableitems.MOD_ID);

    public static final RegistryObject<Item> REINFORCEDLEATHER = ITEMS.register("reinforcedleather",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.CRAFTEABLEITEMS_TAB)));

    public static final RegistryObject<Item> REINFORCEDSTRING = ITEMS.register("reinforcedstring",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.CRAFTEABLEITEMS_TAB)));

    public static final RegistryObject<Item> ROTTENLEATHER = ITEMS.register("rottenleather",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.CRAFTEABLEITEMS_TAB)));




    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);
    }
}


