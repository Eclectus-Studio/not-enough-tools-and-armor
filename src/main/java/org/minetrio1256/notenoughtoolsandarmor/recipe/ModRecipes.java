package org.minetrio1256.notenoughtoolsandarmor.recipe;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraftforge.common.util.RecipeMatcher;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.minetrio1256.notenoughtoolsandarmor.Main;


public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Main.MOD_ID);
    public static final DeferredRegister<RecipeType<?>> TYPES =
            DeferredRegister.create(ForgeRegistries.RECIPE_TYPES, Main.MOD_ID);

    public static final RegistryObject<RecipeSerializer<TheForgeRecipe>> TheForge_SERIALIZER =
            SERIALIZERS.register("toolforging", TheForgeRecipe.Serializer::new);

    public static final RegistryObject<RecipeType<TheForgeRecipe>> TheForge_TYPE =
            TYPES.register("toolforging", () -> new RecipeType<TheForgeRecipe>() {
                @Override
                public String toString() {
                    return "toolforging";
                }
            });
    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
        TYPES.register(eventBus);
    }
}
