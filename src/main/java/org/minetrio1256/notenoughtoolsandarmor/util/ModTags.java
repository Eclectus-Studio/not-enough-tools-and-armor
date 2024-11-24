package org.minetrio1256.notenoughtoolsandarmor.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import org.minetrio1256.notenoughtoolsandarmor.Main;

public class ModTags {
    public static class Blocks {
        //public static final TagKey<Block> NEEDS_AZURITE_TOOL = createTag("needs_azurite_tool");
        //public static final TagKey<Block> INCORRECT_FOR_AZURITE_TOOL = createTag("incorrect_for_azurite_tool");

        public static final TagKey<Block> ACACIA_LOG_MINEABLE = createTag("mineable/acacia_log_mineable");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, name));
        }
    }

    public static class Items {
        //public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, name));
        }
    }
}
