package net.debux.astralmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab ASTRAL_TAB = new CreativeModeTab("astralmodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.COBALT_INGOT.get());
        }
    };
}
