package org.minetrio1256.notenoughtoolsandarmor.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class TemplatesItem {
    public static void load() {
        System.out.println("Loaded templates");
    }
        public static final RegistryObject<Item> TEMPLATE = ModItems.ITEMS.register("template",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TEMPLATE_AXE = ModItems.ITEMS.register("template_axe",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TEMPLATE_HOE = ModItems.ITEMS.register("template_hoe",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TEMPLATE_PICKAXE = ModItems.ITEMS.register("template_pickaxe",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TEMPLATE_SHOVEL = ModItems.ITEMS.register("template_shovel",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TEMPLATE_STICK = ModItems.ITEMS.register("template_stick",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TEMPLATE_SWORD = ModItems.ITEMS.register("template_sword",
                () -> new Item(new Item.Properties()));
}
