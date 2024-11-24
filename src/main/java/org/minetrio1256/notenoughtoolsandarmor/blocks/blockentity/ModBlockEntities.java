package org.minetrio1256.notenoughtoolsandarmor.blocks.blockentity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.minetrio1256.notenoughtoolsandarmor.Main;
import org.minetrio1256.notenoughtoolsandarmor.blocks.ModBlocks;
import org.minetrio1256.notenoughtoolsandarmor.blocks.blockentity.custom.TheForgeBlockEntity;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Main.MOD_ID);

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }

    public static final RegistryObject<BlockEntityType<TheForgeBlockEntity>> TheForge_BE =
            BLOCK_ENTITIES.register("crystallizer_be", () -> BlockEntityType.Builder.of(
                    TheForgeBlockEntity::new, ModBlocks.TheForge.get()).build(null));
}
