package org.minetrio1256.notenoughtoolsandarmor.recipe;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import org.minetrio1256.notenoughtoolsandarmor.Main;

public record TheForgeRecipe(Ingredient inputItem, Ingredient inputItem2, ItemStack output) implements Recipe<TheForgeRecipeInput> {
    @Override
    public NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> list = NonNullList.create();
        list.add(inputItem);
        list.add(inputItem2);
        return list;
    }

    @Override
    public boolean matches(TheForgeRecipeInput theForgeRecipeInput, Level level) {
        if(level.isClientSide()) {
            return false;
        }

        return inputItem.test(theForgeRecipeInput.getItem(0)) && inputItem2.test(theForgeRecipeInput.getItem(1));
    }

    @Override
    public ItemStack assemble(TheForgeRecipeInput theForgeRecipeInput, HolderLookup.Provider provider) {
        return output.copy();
    }

    @Override
    public boolean canCraftInDimensions(int i, int i1) {
        return true;
    }

    @Override
    public ItemStack getResultItem(HolderLookup.Provider provider) {
        return output;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipes.TheForge_SERIALIZER.get();
    }

    @Override
    public RecipeType<?> getType() {
        return ModRecipes.TheForge_TYPE.get();
    }

    public static class Serializer implements RecipeSerializer<TheForgeRecipe> {
        public static final MapCodec<TheForgeRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC_NONEMPTY.fieldOf("ingredient").forGetter(TheForgeRecipe::inputItem),
                Ingredient.CODEC_NONEMPTY.fieldOf("ingredient2").forGetter(TheForgeRecipe::inputItem2),
                net.minecraft.world.item.ItemStack.CODEC.fieldOf("result").forGetter(TheForgeRecipe::output)
        ).apply(inst, TheForgeRecipe::new));

        public static final StreamCodec<RegistryFriendlyByteBuf, TheForgeRecipe> STREAM_CODEC =
                StreamCodec.composite(
                        Ingredient.CONTENTS_STREAM_CODEC, TheForgeRecipe::inputItem,
                        Ingredient.CONTENTS_STREAM_CODEC, TheForgeRecipe::inputItem2,
                        ItemStack.STREAM_CODEC, TheForgeRecipe::output,
                        TheForgeRecipe::new);


        @Override
        public MapCodec<TheForgeRecipe> codec() {
            return CODEC;
        }

        @Override
        public StreamCodec<RegistryFriendlyByteBuf, TheForgeRecipe> streamCodec() {
            return STREAM_CODEC;
        }
    }
}