package net.Alexator.crafteableitems.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {


    public static final CreativeModeTab CRAFTEABLEITEMS_TAB = new CreativeModeTab("crafteableitemstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.REINFORCEDLEATHER.get());
        }
    };
}
