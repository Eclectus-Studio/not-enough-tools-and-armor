package org.minetrio1256.notenoughtoolsandarmor.recipe;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeInput;

public record TheForgeRecipeInput(ItemStack input1, ItemStack input2) implements RecipeInput {

    @Override
    public ItemStack getItem(int i) {
        if(i == 0){
            return input1;
        } else if (i == 1){
            return input2;
        } else {
            return input1;
        }
    }

    @Override
    public int size() {
        return 2;
    }
}