package org.minetrio1256.notenoughtoolsandarmor.items.tools.Tiers;

import com.google.common.base.Suppliers;

import java.util.Objects;
import java.util.function.Supplier;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;

import org.minetrio1256.notenoughtoolsandarmor.items.McBlockCustomPart.McBlockPartItem;

public enum CustomTiers implements Tier {
    OAK_LOG(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 59, 2.0F, 0.0F, 15, () -> {
        return Ingredient.of(new ItemLike[]{Items.OAK_LOG});
    }),
    SPRUCE_LOG(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 59, 2.0F, 0.0F, 15, () -> {
        return Ingredient.of(new ItemLike[]{Items.SPRUCE_LOG});
    }),
    ACACIA_LOG(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 59, 2.0F, 0.0F, 15, () -> {
        return Ingredient.of(new ItemLike[]{Items.ACACIA_LOG});
    }),
    JUNGLE_LOG(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 59, 2.0F, 0.0F, 15, () -> {
        return Ingredient.of(new ItemLike[]{Items.JUNGLE_LOG});
    }),
    DARK_OAK_LOG(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 59, 2.0F, 0.0F, 15, () -> {
        return Ingredient.of(new ItemLike[]{Items.DARK_OAK_LOG});
    }),
    MANGROVE_LOG(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 59, 2.0F, 0.0F, 15, () -> {
        return Ingredient.of(new ItemLike[]{Items.MANGROVE_LOG});
    }),
    CHERRY_LOG(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 59, 2.0F, 0.0F, 15, () -> {
        return Ingredient.of(new ItemLike[]{Items.CHERRY_LOG});
    }),
    BIRCH_LOG(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 59, 2.0F, 0.0F, 15, () -> {
        return Ingredient.of(new ItemLike[]{Items.BIRCH_LOG});
    }),
    SPRUCE_LOG_TOP(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 59, 2.0F, 0.0F, 15, () -> {
        return Ingredient.of(new ItemLike[]{McBlockPartItem.SPRUCE_LOG_TOP.get()});
    }),
    WOOD(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 59, 2.0F, 0.0F, 15, () -> {
        return Ingredient.of(ItemTags.PLANKS);
    }),
    AMETHYST(BlockTags.INCORRECT_FOR_STONE_TOOL, 59, 2.0F, 0.0F, 15, () -> {
        return Ingredient.of(new ItemLike[]{Items.AMETHYST_SHARD});
    }),
    IRON(BlockTags.INCORRECT_FOR_IRON_TOOL, 59, 2.0F, 0.0F, 15, () -> {
        return Ingredient.of(new ItemLike[]{Items.IRON_INGOT});
    }),
    ACACIA_LOG_TOP(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 59, 2.0F, 0.0F, 15, () -> {
        return Ingredient.of(new ItemLike[]{McBlockPartItem.BIRCH_LOG_TOP.get()});
    });

    private final TagKey<Block> incorrectBlocksForDrops;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> repairIngredient;

    private CustomTiers(final TagKey pIncorrectBlockForDrops, final int pUses, final float pSpeed, final float pDamage, final int pEnchantmentValue, final Supplier pRepairIngredient) {
        this.incorrectBlocksForDrops = pIncorrectBlockForDrops;
        this.uses = pUses;
        this.speed = pSpeed;
        this.damage = pDamage;
        this.enchantmentValue = pEnchantmentValue;
        Objects.requireNonNull(pRepairIngredient);
        this.repairIngredient = Suppliers.memoize(() -> (Ingredient) pRepairIngredient.get());

    }

    public int getUses() {
        return this.uses;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    public TagKey<Block> getIncorrectBlocksForDrops() {
        return this.incorrectBlocksForDrops;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
