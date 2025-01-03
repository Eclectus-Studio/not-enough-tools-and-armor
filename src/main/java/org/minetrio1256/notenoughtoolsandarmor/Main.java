package org.minetrio1256.notenoughtoolsandarmor;

import com.mojang.logging.LogUtils;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.minetrio1256.notenoughtoolsandarmor.blocks.ModBlocks;
import org.minetrio1256.notenoughtoolsandarmor.blocks.blockentity.ModBlockEntities;
import org.minetrio1256.notenoughtoolsandarmor.items.ModItems;
import org.minetrio1256.notenoughtoolsandarmor.items.tabs.ModCreativeModeTab;
import org.minetrio1256.notenoughtoolsandarmor.recipe.ModRecipes;
import org.minetrio1256.notenoughtoolsandarmor.screen.ModMenuTypes;
import org.minetrio1256.notenoughtoolsandarmor.screen.ModMenuTypes;
import org.minetrio1256.notenoughtoolsandarmor.screen.custom.theforge.TheForgeScreen;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Main.MOD_ID)
public class Main {

    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "notenoughtoolsandarmor";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public Main() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        ModCreativeModeTab.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModRecipes.register(modEventBus);


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }



    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            MenuScreens.register(ModMenuTypes.TheForgeMenu.get(), TheForgeScreen::new);
        }
    }
}
