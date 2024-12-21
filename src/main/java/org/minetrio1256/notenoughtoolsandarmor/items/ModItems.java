package org.minetrio1256.notenoughtoolsandarmor.items;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.minetrio1256.notenoughtoolsandarmor.Main;
import org.minetrio1256.notenoughtoolsandarmor.items.tools.Tiers.CustomTiers;
import org.minetrio1256.notenoughtoolsandarmor.items.armor.ModArmorMaterials;
import org.minetrio1256.notenoughtoolsandarmor.items.tools.ToolItem.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);
    public static final RegistryObject<Item> OAK_LOG_HELMET = ITEMS.register("oak_log_helmet",
            () -> new ArmorItem(ModArmorMaterials.OAK_LOG_ARMOR, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> OAK_LOG_CHESTPLATE = ITEMS.register("oak_log_chestplate",
            () -> new ArmorItem(ModArmorMaterials.OAK_LOG_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> OAK_LOG_LEGGINGS = ITEMS.register("oak_log_leggings",
            () -> new ArmorItem(ModArmorMaterials.OAK_LOG_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> OAK_LOG_BOOTS = ITEMS.register("oak_log_boots",
            () -> new ArmorItem(ModArmorMaterials.OAK_LOG_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> TEMPLATE = ModItems.ITEMS.register("template",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEMPLATE_PICKAXE = ModItems.ITEMS.register("template_pickaxe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEMPLATE_AXE = ModItems.ITEMS.register("template_axe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEMPLATE_SHOVEL = ModItems.ITEMS.register("template_shovel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEMPLATE_STICK = ModItems.ITEMS.register("template_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEMPLATE_SWORD = ModItems.ITEMS.register("template_sword",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_LOG_STICK = ModItems.ITEMS.register("template_hoe",
            () -> new Item(new Item.Properties()));

    public static void register (IEventBus eventBus) {
        axe.load();

        hoe.load();

        pickaxe.load();

        shovel.load();

        sword.load();

        StickItem.load();

        ITEMS.register(eventBus);
    }
}