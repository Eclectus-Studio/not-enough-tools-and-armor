package org.minetrio1256.notenoughtoolsandarmor.items.tools.ToolItem;

import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.minetrio1256.notenoughtoolsandarmor.items.ModItems;
import org.minetrio1256.notenoughtoolsandarmor.items.tools.Tiers.CustomTiers;

public class hoe {
    //remove duplicate

    public static void load(){
        System.out.println("Loaded hoes!");
    }
    public static final RegistryObject<Item> ACACIA_LOG_HOE = ModItems.ITEMS.register("acacia_log_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_LOG_TOP_HOE = ModItems.ITEMS.register("acacia_log_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_PLANKS_HOE = ModItems.ITEMS.register("acacia_planks_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_BLOCK_HOE = ModItems.ITEMS.register("amethyst_block_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> ANCIENT_DEBRIS_SIDE_HOE = ModItems.ITEMS.register("ancient_debris_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> ANCIENT_DEBRIS_TOP_HOE = ModItems.ITEMS.register("ancient_debris_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> ANDESITE_HOE = ModItems.ITEMS.register("andesite_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> ANVIL_HOE = ModItems.ITEMS.register("anvil_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> AZALEA_TOP_HOE = ModItems.ITEMS.register("azalea_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_BLOCK_HOE = ModItems.ITEMS.register("bamboo_block_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_BLOCK_TOP_HOE = ModItems.ITEMS.register("bamboo_block_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_DOOR_BOTTOM_HOE = ModItems.ITEMS.register("bamboo_door_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_FENCE_GATE_PARTICLE_HOE = ModItems.ITEMS.register("bamboo_fence_gate_particle_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_FENCE_PARTICLE_HOE = ModItems.ITEMS.register("bamboo_fence_particle_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_MOSAIC_HOE = ModItems.ITEMS.register("bamboo_mosaic_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_PLANKS_HOE = ModItems.ITEMS.register("bamboo_planks_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_STALK_HOE = ModItems.ITEMS.register("bamboo_stalk_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BARREL_BOTTOM_HOE = ModItems.ITEMS.register("barrel_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BARREL_SIDE_HOE = ModItems.ITEMS.register("barrel_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BARREL_TOP_HOE = ModItems.ITEMS.register("barrel_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BARREL_TOP_OPEN_HOE = ModItems.ITEMS.register("barrel_top_open_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BASALT_SIDE_HOE = ModItems.ITEMS.register("basalt_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BASALT_TOP_HOE = ModItems.ITEMS.register("basalt_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BEACON_HOE = ModItems.ITEMS.register("beacon_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BEDROCK_HOE = ModItems.ITEMS.register("bedrock_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BEE_NEST_BOTTOM_HOE = ModItems.ITEMS.register("bee_nest_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BEE_NEST_FRONT_HOE = ModItems.ITEMS.register("bee_nest_front_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BEE_NEST_FRONT_HONEY_HOE = ModItems.ITEMS.register("bee_nest_front_honey_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BEE_NEST_SIDE_HOE = ModItems.ITEMS.register("bee_nest_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BEE_NEST_TOP_HOE = ModItems.ITEMS.register("bee_nest_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BEEHIVE_END_HOE = ModItems.ITEMS.register("beehive_end_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BEEHIVE_FRONT_HOE = ModItems.ITEMS.register("beehive_front_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BEEHIVE_FRONT_HONEY_HOE = ModItems.ITEMS.register("beehive_front_honey_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BEEHIVE_SIDE_HOE = ModItems.ITEMS.register("beehive_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_DOOR_BOTTOM_HOE = ModItems.ITEMS.register("birch_door_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_DOOR_TOP_HOE = ModItems.ITEMS.register("birch_door_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_LOG_HOE = ModItems.ITEMS.register("birch_log_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_LOG_TOP_HOE = ModItems.ITEMS.register("birch_log_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_PLANKS_HOE = ModItems.ITEMS.register("birch_planks_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_TRAPDOOR_HOE = ModItems.ITEMS.register("birch_trapdoor_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BLACK_CONCRETE_HOE = ModItems.ITEMS.register("black_concrete_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BLACK_CONCRETE_POWDER_HOE = ModItems.ITEMS.register("black_concrete_powder_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BLACK_GLAZED_TERRACOTTA_HOE = ModItems.ITEMS.register("black_glazed_terracotta_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BLACK_SHULKER_BOX_HOE = ModItems.ITEMS.register("black_shulker_box_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BLACK_STAINED_GLASS_HOE = ModItems.ITEMS.register("black_stained_glass_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BLACK_TERRACOTTA_HOE = ModItems.ITEMS.register("black_terracotta_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BLACK_WOOL_HOE = ModItems.ITEMS.register("black_wool_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BLACKSTONE_HOE = ModItems.ITEMS.register("blackstone_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BLACKSTONE_TOP_HOE = ModItems.ITEMS.register("blackstone_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BLAST_FURNACE_FRONT_HOE = ModItems.ITEMS.register("blast_furnace_front_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BLAST_FURNACE_SIDE_HOE = ModItems.ITEMS.register("blast_furnace_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BLAST_FURNACE_TOP_HOE = ModItems.ITEMS.register("blast_furnace_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BLUE_CONCRETE_HOE = ModItems.ITEMS.register("blue_concrete_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BLUE_CONCRETE_POWDER_HOE = ModItems.ITEMS.register("blue_concrete_powder_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BLUE_GLAZED_TERRACOTTA_HOE = ModItems.ITEMS.register("blue_glazed_terracotta_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BLUE_ICE_HOE = ModItems.ITEMS.register("blue_ice_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BLUE_SHULKER_BOX_HOE = ModItems.ITEMS.register("blue_shulker_box_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BLUE_STAINED_GLASS_HOE = ModItems.ITEMS.register("blue_stained_glass_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BLUE_TERRACOTTA_HOE = ModItems.ITEMS.register("blue_terracotta_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BLUE_WOOL_HOE = ModItems.ITEMS.register("blue_wool_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BONE_BLOCK_SIDE_HOE = ModItems.ITEMS.register("bone_block_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BONE_BLOCK_TOP_HOE = ModItems.ITEMS.register("bone_block_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BOOKSHELF_HOE = ModItems.ITEMS.register("bookshelf_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BRAIN_CORAL_BLOCK_HOE = ModItems.ITEMS.register("brain_coral_block_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BREWING_STAND_BASE_HOE = ModItems.ITEMS.register("brewing_stand_base_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BRICKS_HOE = ModItems.ITEMS.register("bricks_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BROWN_CONCRETE_HOE = ModItems.ITEMS.register("brown_concrete_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BROWN_CONCRETE_POWDER_HOE = ModItems.ITEMS.register("brown_concrete_powder_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BROWN_GLAZED_TERRACOTTA_HOE = ModItems.ITEMS.register("brown_glazed_terracotta_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BROWN_MUSHROOM_BLOCK_HOE = ModItems.ITEMS.register("brown_mushroom_block_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BROWN_SHULKER_BOX_HOE = ModItems.ITEMS.register("brown_shulker_box_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BROWN_STAINED_GLASS_HOE = ModItems.ITEMS.register("brown_stained_glass_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BROWN_TERRACOTTA_HOE = ModItems.ITEMS.register("brown_terracotta_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BROWN_WOOL_HOE = ModItems.ITEMS.register("brown_wool_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BUBBLE_CORAL_BLOCK_HOE = ModItems.ITEMS.register("bubble_coral_block_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> BUDDING_AMETHYST_HOE = ModItems.ITEMS.register("budding_amethyst_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CACTUS_BOTTOM_HOE = ModItems.ITEMS.register("cactus_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CACTUS_SIDE_HOE = ModItems.ITEMS.register("cactus_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CACTUS_TOP_HOE = ModItems.ITEMS.register("cactus_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CAKE_BOTTOM_HOE = ModItems.ITEMS.register("cake_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CAKE_TOP_HOE = ModItems.ITEMS.register("cake_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CALCITE_HOE = ModItems.ITEMS.register("calcite_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CALIBRATED_SCULK_SENSOR_TOP_HOE = ModItems.ITEMS.register("calibrated_sculk_sensor_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CARTOGRAPHY_TABLE_SIDE1_HOE = ModItems.ITEMS.register("cartography_table_side1_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CARTOGRAPHY_TABLE_SIDE2_HOE = ModItems.ITEMS.register("cartography_table_side2_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CARTOGRAPHY_TABLE_SIDE3_HOE = ModItems.ITEMS.register("cartography_table_side3_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CARTOGRAPHY_TABLE_TOP_HOE = ModItems.ITEMS.register("cartography_table_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CARVED_PUMPKIN_HOE = ModItems.ITEMS.register("carved_pumpkin_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CAULDRON_INNER_HOE = ModItems.ITEMS.register("cauldron_inner_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_DOOR_BOTTOM_HOE = ModItems.ITEMS.register("cherry_door_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_LOG_HOE = ModItems.ITEMS.register("cherry_log_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_LOG_TOP_HOE = ModItems.ITEMS.register("cherry_log_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_PLANKS_HOE = ModItems.ITEMS.register("cherry_planks_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CHIPPED_ANVIL_TOP_HOE = ModItems.ITEMS.register("chipped_anvil_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CHISELED_BOOKSHELF_EMPTY_HOE = ModItems.ITEMS.register("chiseled_bookshelf_empty_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CHISELED_BOOKSHELF_OCCUPIED_HOE = ModItems.ITEMS.register("chiseled_bookshelf_occupied_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CHISELED_BOOKSHELF_SIDE_HOE = ModItems.ITEMS.register("chiseled_bookshelf_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CHISELED_BOOKSHELF_TOP_HOE = ModItems.ITEMS.register("chiseled_bookshelf_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CHISELED_COPPER_HOE = ModItems.ITEMS.register("chiseled_copper_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CHISELED_DEEPSLATE_HOE = ModItems.ITEMS.register("chiseled_deepslate_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CHISELED_NETHER_BRICKS_HOE = ModItems.ITEMS.register("chiseled_nether_bricks_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CHISELED_POLISHED_BLACKSTONE_HOE = ModItems.ITEMS.register("chiseled_polished_blackstone_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CHISELED_QUARTZ_BLOCK_HOE = ModItems.ITEMS.register("chiseled_quartz_block_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CHISELED_QUARTZ_BLOCK_TOP_HOE = ModItems.ITEMS.register("chiseled_quartz_block_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CHISELED_RED_SANDSTONE_HOE = ModItems.ITEMS.register("chiseled_red_sandstone_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CHISELED_SANDSTONE_HOE = ModItems.ITEMS.register("chiseled_sandstone_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CHISELED_STONE_BRICKS_HOE = ModItems.ITEMS.register("chiseled_stone_bricks_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CHISELED_TUFF_HOE = ModItems.ITEMS.register("chiseled_tuff_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CHISELED_TUFF_BRICKS_HOE = ModItems.ITEMS.register("chiseled_tuff_bricks_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CHISELED_TUFF_BRICKS_TOP_HOE = ModItems.ITEMS.register("chiseled_tuff_bricks_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CHISELED_TUFF_TOP_HOE = ModItems.ITEMS.register("chiseled_tuff_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CHORUS_FLOWER_HOE = ModItems.ITEMS.register("chorus_flower_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CHORUS_FLOWER_DEAD_HOE = ModItems.ITEMS.register("chorus_flower_dead_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CHORUS_PLANT_HOE = ModItems.ITEMS.register("chorus_plant_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CLAY_HOE = ModItems.ITEMS.register("clay_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> COAL_BLOCK_HOE = ModItems.ITEMS.register("coal_block_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> COAL_ORE_HOE = ModItems.ITEMS.register("coal_ore_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> COARSE_DIRT_HOE = ModItems.ITEMS.register("coarse_dirt_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> COBBLED_DEEPSLATE_HOE = ModItems.ITEMS.register("cobbled_deepslate_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> COBBLESTONE_HOE = ModItems.ITEMS.register("cobblestone_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> COMPARATOR_HOE = ModItems.ITEMS.register("comparator_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> COMPARATOR_ON_HOE = ModItems.ITEMS.register("comparator_on_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> COMPOSTER_BOTTOM_HOE = ModItems.ITEMS.register("composter_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> COMPOSTER_SIDE_HOE = ModItems.ITEMS.register("composter_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_BLOCK_HOE = ModItems.ITEMS.register("copper_block_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_BULB_HOE = ModItems.ITEMS.register("copper_bulb_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_BULB_LIT_HOE = ModItems.ITEMS.register("copper_bulb_lit_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_BULB_LIT_POWERED_HOE = ModItems.ITEMS.register("copper_bulb_lit_powered_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_BULB_POWERED_HOE = ModItems.ITEMS.register("copper_bulb_powered_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_DOOR_BOTTOM_HOE = ModItems.ITEMS.register("copper_door_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_ORE_HOE = ModItems.ITEMS.register("copper_ore_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_TRAPDOOR_HOE = ModItems.ITEMS.register("copper_trapdoor_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CRACKED_DEEPSLATE_BRICKS_HOE = ModItems.ITEMS.register("cracked_deepslate_bricks_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CRACKED_DEEPSLATE_TILES_HOE = ModItems.ITEMS.register("cracked_deepslate_tiles_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CRACKED_NETHER_BRICKS_HOE = ModItems.ITEMS.register("cracked_nether_bricks_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CRACKED_POLISHED_BLACKSTONE_BRICKS_HOE = ModItems.ITEMS.register("cracked_polished_blackstone_bricks_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CRACKED_STONE_BRICKS_HOE = ModItems.ITEMS.register("cracked_stone_bricks_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CRAFTER_BOTTOM_HOE = ModItems.ITEMS.register("crafter_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CRAFTER_EAST_HOE = ModItems.ITEMS.register("crafter_east_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CRAFTER_EAST_CRAFTING_HOE = ModItems.ITEMS.register("crafter_east_crafting_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CRAFTER_EAST_TRIGGERED_HOE = ModItems.ITEMS.register("crafter_east_triggered_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CRAFTER_NORTH_HOE = ModItems.ITEMS.register("crafter_north_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CRAFTER_NORTH_CRAFTING_HOE = ModItems.ITEMS.register("crafter_north_crafting_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CRAFTER_SOUTH_HOE = ModItems.ITEMS.register("crafter_south_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CRAFTER_SOUTH_TRIGGERED_HOE = ModItems.ITEMS.register("crafter_south_triggered_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CRAFTER_TOP_HOE = ModItems.ITEMS.register("crafter_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CRAFTER_TOP_CRAFTING_HOE = ModItems.ITEMS.register("crafter_top_crafting_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CRAFTER_TOP_TRIGGERED_HOE = ModItems.ITEMS.register("crafter_top_triggered_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CRAFTER_WEST_HOE = ModItems.ITEMS.register("crafter_west_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CRAFTER_WEST_CRAFTING_HOE = ModItems.ITEMS.register("crafter_west_crafting_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CRAFTER_WEST_TRIGGERED_HOE = ModItems.ITEMS.register("crafter_west_triggered_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CRAFTING_TABLE_FRONT_HOE = ModItems.ITEMS.register("crafting_table_front_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CRAFTING_TABLE_SIDE_HOE = ModItems.ITEMS.register("crafting_table_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CRAFTING_TABLE_TOP_HOE = ModItems.ITEMS.register("crafting_table_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_DOOR_BOTTOM_HOE = ModItems.ITEMS.register("crimson_door_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_DOOR_TOP_HOE = ModItems.ITEMS.register("crimson_door_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_NYLIUM_HOE = ModItems.ITEMS.register("crimson_nylium_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_NYLIUM_SIDE_HOE = ModItems.ITEMS.register("crimson_nylium_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_PLANKS_HOE = ModItems.ITEMS.register("crimson_planks_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_STEM_TOP_HOE = ModItems.ITEMS.register("crimson_stem_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CRYING_OBSIDIAN_HOE = ModItems.ITEMS.register("crying_obsidian_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CUT_COPPER_HOE = ModItems.ITEMS.register("cut_copper_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CUT_RED_SANDSTONE_HOE = ModItems.ITEMS.register("cut_red_sandstone_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CUT_SANDSTONE_HOE = ModItems.ITEMS.register("cut_sandstone_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CYAN_CONCRETE_HOE = ModItems.ITEMS.register("cyan_concrete_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CYAN_CONCRETE_POWDER_HOE = ModItems.ITEMS.register("cyan_concrete_powder_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CYAN_GLAZED_TERRACOTTA_HOE = ModItems.ITEMS.register("cyan_glazed_terracotta_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CYAN_SHULKER_BOX_HOE = ModItems.ITEMS.register("cyan_shulker_box_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CYAN_STAINED_GLASS_HOE = ModItems.ITEMS.register("cyan_stained_glass_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CYAN_TERRACOTTA_HOE = ModItems.ITEMS.register("cyan_terracotta_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> CYAN_WOOL_HOE = ModItems.ITEMS.register("cyan_wool_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_DOOR_BOTTOM_HOE = ModItems.ITEMS.register("dark_oak_door_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_DOOR_TOP_HOE = ModItems.ITEMS.register("dark_oak_door_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_LOG_HOE = ModItems.ITEMS.register("dark_oak_log_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_LOG_TOP_HOE = ModItems.ITEMS.register("dark_oak_log_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_PLANKS_HOE = ModItems.ITEMS.register("dark_oak_planks_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_TRAPDOOR_HOE = ModItems.ITEMS.register("dark_oak_trapdoor_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DARK_PRISMARINE_HOE = ModItems.ITEMS.register("dark_prismarine_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DAYLIGHT_DETECTOR_INVERTED_TOP_HOE = ModItems.ITEMS.register("daylight_detector_inverted_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DAYLIGHT_DETECTOR_SIDE_HOE = ModItems.ITEMS.register("daylight_detector_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DAYLIGHT_DETECTOR_TOP_HOE = ModItems.ITEMS.register("daylight_detector_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DEBUG_HOE = ModItems.ITEMS.register("debug_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DEBUG2_HOE = ModItems.ITEMS.register("debug2_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DEEPSLATE_HOE = ModItems.ITEMS.register("deepslate_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DEEPSLATE_BRICKS_HOE = ModItems.ITEMS.register("deepslate_bricks_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DEEPSLATE_COAL_ORE_HOE = ModItems.ITEMS.register("deepslate_coal_ore_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DEEPSLATE_COPPER_ORE_HOE = ModItems.ITEMS.register("deepslate_copper_ore_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DEEPSLATE_DIAMOND_ORE_HOE = ModItems.ITEMS.register("deepslate_diamond_ore_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DEEPSLATE_EMERALD_ORE_HOE = ModItems.ITEMS.register("deepslate_emerald_ore_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DEEPSLATE_GOLD_ORE_HOE = ModItems.ITEMS.register("deepslate_gold_ore_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DEEPSLATE_IRON_ORE_HOE = ModItems.ITEMS.register("deepslate_iron_ore_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DEEPSLATE_LAPIS_ORE_HOE = ModItems.ITEMS.register("deepslate_lapis_ore_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DEEPSLATE_REDSTONE_ORE_HOE = ModItems.ITEMS.register("deepslate_redstone_ore_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DEEPSLATE_TILES_HOE = ModItems.ITEMS.register("deepslate_tiles_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DEEPSLATE_TOP_HOE = ModItems.ITEMS.register("deepslate_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_BLOCK_HOE = ModItems.ITEMS.register("diamond_block_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_ORE_HOE = ModItems.ITEMS.register("diamond_ore_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DIORITE_HOE = ModItems.ITEMS.register("diorite_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DIRT_HOE = ModItems.ITEMS.register("dirt_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DIRT_PATH_SIDE_HOE = ModItems.ITEMS.register("dirt_path_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DIRT_PATH_TOP_HOE = ModItems.ITEMS.register("dirt_path_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DISPENSER_FRONT_HOE = ModItems.ITEMS.register("dispenser_front_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DISPENSER_FRONT_VERTICAL_HOE = ModItems.ITEMS.register("dispenser_front_vertical_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_EGG_HOE = ModItems.ITEMS.register("dragon_egg_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DRIED_KELP_BOTTOM_HOE = ModItems.ITEMS.register("dried_kelp_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DRIED_KELP_SIDE_HOE = ModItems.ITEMS.register("dried_kelp_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DRIED_KELP_TOP_HOE = ModItems.ITEMS.register("dried_kelp_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DRIPSTONE_BLOCK_HOE = ModItems.ITEMS.register("dripstone_block_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DROPPER_FRONT_HOE = ModItems.ITEMS.register("dropper_front_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> DROPPER_FRONT_VERTICAL_HOE = ModItems.ITEMS.register("dropper_front_vertical_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_BLOCK_HOE = ModItems.ITEMS.register("emerald_block_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_ORE_HOE = ModItems.ITEMS.register("emerald_ore_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> ENCHANTING_TABLE_BOTTOM_HOE = ModItems.ITEMS.register("enchanting_table_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> ENCHANTING_TABLE_TOP_HOE = ModItems.ITEMS.register("enchanting_table_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> END_PORTAL_FRAME_TOP_HOE = ModItems.ITEMS.register("end_portal_frame_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> END_STONE_HOE = ModItems.ITEMS.register("end_stone_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> END_STONE_BRICKS_HOE = ModItems.ITEMS.register("end_stone_bricks_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> EXPOSED_CHISELED_COPPER_HOE = ModItems.ITEMS.register("exposed_chiseled_copper_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> EXPOSED_COPPER_HOE = ModItems.ITEMS.register("exposed_copper_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> EXPOSED_COPPER_BULB_HOE = ModItems.ITEMS.register("exposed_copper_bulb_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> EXPOSED_COPPER_BULB_LIT_HOE = ModItems.ITEMS.register("exposed_copper_bulb_lit_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> EXPOSED_COPPER_BULB_LIT_POWERED_HOE = ModItems.ITEMS.register("exposed_copper_bulb_lit_powered_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> EXPOSED_COPPER_BULB_POWERED_HOE = ModItems.ITEMS.register("exposed_copper_bulb_powered_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> EXPOSED_COPPER_DOOR_BOTTOM_HOE = ModItems.ITEMS.register("exposed_copper_door_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> EXPOSED_CUT_COPPER_HOE = ModItems.ITEMS.register("exposed_cut_copper_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> FARMLAND_HOE = ModItems.ITEMS.register("farmland_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> FARMLAND_MOIST_HOE = ModItems.ITEMS.register("farmland_moist_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> FIRE_CORAL_BLOCK_HOE = ModItems.ITEMS.register("fire_coral_block_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> FLETCHING_TABLE_FRONT_HOE = ModItems.ITEMS.register("fletching_table_front_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> FLETCHING_TABLE_SIDE_HOE = ModItems.ITEMS.register("fletching_table_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> FLETCHING_TABLE_TOP_HOE = ModItems.ITEMS.register("fletching_table_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> FROSTED_ICE_0_HOE = ModItems.ITEMS.register("frosted_ice_0_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> FROSTED_ICE_1_HOE = ModItems.ITEMS.register("frosted_ice_1_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> FROSTED_ICE_2_HOE = ModItems.ITEMS.register("frosted_ice_2_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> FROSTED_ICE_3_HOE = ModItems.ITEMS.register("frosted_ice_3_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> FURNACE_FRONT_HOE = ModItems.ITEMS.register("furnace_front_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> FURNACE_FRONT_ON_HOE = ModItems.ITEMS.register("furnace_front_on_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> FURNACE_SIDE_HOE = ModItems.ITEMS.register("furnace_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> FURNACE_TOP_HOE = ModItems.ITEMS.register("furnace_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> GILDED_BLACKSTONE_HOE = ModItems.ITEMS.register("gilded_blackstone_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> GLOW_ITEM_FRAME_HOE = ModItems.ITEMS.register("glow_item_frame_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> GLOWSTONE_HOE = ModItems.ITEMS.register("glowstone_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> GOLD_BLOCK_HOE = ModItems.ITEMS.register("gold_block_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> GOLD_ORE_HOE = ModItems.ITEMS.register("gold_ore_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> GRANITE_HOE = ModItems.ITEMS.register("granite_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> GRASS_BLOCK_SIDE_HOE = ModItems.ITEMS.register("grass_block_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> GRASS_BLOCK_SNOW_HOE = ModItems.ITEMS.register("grass_block_snow_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> GRAVEL_HOE = ModItems.ITEMS.register("gravel_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> GRAY_CONCRETE_HOE = ModItems.ITEMS.register("gray_concrete_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> GRAY_CONCRETE_POWDER_HOE = ModItems.ITEMS.register("gray_concrete_powder_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> GRAY_GLAZED_TERRACOTTA_HOE = ModItems.ITEMS.register("gray_glazed_terracotta_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> GRAY_SHULKER_BOX_HOE = ModItems.ITEMS.register("gray_shulker_box_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> GRAY_STAINED_GLASS_HOE = ModItems.ITEMS.register("gray_stained_glass_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> GRAY_TERRACOTTA_HOE = ModItems.ITEMS.register("gray_terracotta_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> GRAY_WOOL_HOE = ModItems.ITEMS.register("gray_wool_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> GREEN_CONCRETE_HOE = ModItems.ITEMS.register("green_concrete_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> GREEN_CONCRETE_POWDER_HOE = ModItems.ITEMS.register("green_concrete_powder_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> GREEN_GLAZED_TERRACOTTA_HOE = ModItems.ITEMS.register("green_glazed_terracotta_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> GREEN_SHULKER_BOX_HOE = ModItems.ITEMS.register("green_shulker_box_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> GREEN_STAINED_GLASS_HOE = ModItems.ITEMS.register("green_stained_glass_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> GREEN_TERRACOTTA_HOE = ModItems.ITEMS.register("green_terracotta_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> GREEN_WOOL_HOE = ModItems.ITEMS.register("green_wool_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> HAY_BLOCK_SIDE_HOE = ModItems.ITEMS.register("hay_block_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> HAY_BLOCK_TOP_HOE = ModItems.ITEMS.register("hay_block_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> HONEY_BLOCK_BOTTOM_HOE = ModItems.ITEMS.register("honey_block_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> HONEY_BLOCK_SIDE_HOE = ModItems.ITEMS.register("honey_block_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> HONEY_BLOCK_TOP_HOE = ModItems.ITEMS.register("honey_block_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> HONEYCOMB_BLOCK_HOE = ModItems.ITEMS.register("honeycomb_block_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> HOPPER_INSIDE_HOE = ModItems.ITEMS.register("hopper_inside_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> HOPPER_OUTSIDE_HOE = ModItems.ITEMS.register("hopper_outside_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> HORN_CORAL_BLOCK_HOE = ModItems.ITEMS.register("horn_coral_block_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> ICE_HOE = ModItems.ITEMS.register("ice_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> IRON_BLOCK_HOE = ModItems.ITEMS.register("iron_block_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> IRON_DOOR_BOTTOM_HOE = ModItems.ITEMS.register("iron_door_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> IRON_ORE_HOE = ModItems.ITEMS.register("iron_ore_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> ITEM_FRAME_HOE = ModItems.ITEMS.register("item_frame_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> JACK_O_LANTERN_HOE = ModItems.ITEMS.register("jack_o_lantern_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> JIGSAW_BOTTOM_HOE = ModItems.ITEMS.register("jigsaw_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> JIGSAW_LOCK_HOE = ModItems.ITEMS.register("jigsaw_lock_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> JIGSAW_SIDE_HOE = ModItems.ITEMS.register("jigsaw_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> JIGSAW_TOP_HOE = ModItems.ITEMS.register("jigsaw_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> JUKEBOX_SIDE_HOE = ModItems.ITEMS.register("jukebox_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> JUKEBOX_TOP_HOE = ModItems.ITEMS.register("jukebox_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_DOOR_BOTTOM_HOE = ModItems.ITEMS.register("jungle_door_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_LOG_HOE = ModItems.ITEMS.register("jungle_log_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_LOG_TOP_HOE = ModItems.ITEMS.register("jungle_log_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_PLANKS_HOE = ModItems.ITEMS.register("jungle_planks_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_BLOCK_HOE = ModItems.ITEMS.register("lapis_block_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_ORE_HOE = ModItems.ITEMS.register("lapis_ore_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> LECTERN_BASE_HOE = ModItems.ITEMS.register("lectern_base_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> LECTERN_FRONT_HOE = ModItems.ITEMS.register("lectern_front_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> LECTERN_SIDES_HOE = ModItems.ITEMS.register("lectern_sides_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> LECTERN_TOP_HOE = ModItems.ITEMS.register("lectern_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_HOE = ModItems.ITEMS.register("light_blue_concrete_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_POWDER_HOE = ModItems.ITEMS.register("light_blue_concrete_powder_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_GLAZED_TERRACOTTA_HOE = ModItems.ITEMS.register("light_blue_glazed_terracotta_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_SHULKER_BOX_HOE = ModItems.ITEMS.register("light_blue_shulker_box_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_STAINED_GLASS_HOE = ModItems.ITEMS.register("light_blue_stained_glass_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_TERRACOTTA_HOE = ModItems.ITEMS.register("light_blue_terracotta_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_WOOL_HOE = ModItems.ITEMS.register("light_blue_wool_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_HOE = ModItems.ITEMS.register("light_gray_concrete_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_POWDER_HOE = ModItems.ITEMS.register("light_gray_concrete_powder_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GRAY_GLAZED_TERRACOTTA_HOE = ModItems.ITEMS.register("light_gray_glazed_terracotta_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GRAY_SHULKER_BOX_HOE = ModItems.ITEMS.register("light_gray_shulker_box_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GRAY_TERRACOTTA_HOE = ModItems.ITEMS.register("light_gray_terracotta_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GRAY_WOOL_HOE = ModItems.ITEMS.register("light_gray_wool_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> LIME_CONCRETE_HOE = ModItems.ITEMS.register("lime_concrete_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> LIME_CONCRETE_POWDER_HOE = ModItems.ITEMS.register("lime_concrete_powder_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> LIME_GLAZED_TERRACOTTA_HOE = ModItems.ITEMS.register("lime_glazed_terracotta_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> LIME_SHULKER_BOX_HOE = ModItems.ITEMS.register("lime_shulker_box_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> LIME_STAINED_GLASS_HOE = ModItems.ITEMS.register("lime_stained_glass_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> LIME_TERRACOTTA_HOE = ModItems.ITEMS.register("lime_terracotta_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> LIME_WOOL_HOE = ModItems.ITEMS.register("lime_wool_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> LODESTONE_SIDE_HOE = ModItems.ITEMS.register("lodestone_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> LODESTONE_TOP_HOE = ModItems.ITEMS.register("lodestone_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> LOOM_BOTTOM_HOE = ModItems.ITEMS.register("loom_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> LOOM_FRONT_HOE = ModItems.ITEMS.register("loom_front_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> LOOM_SIDE_HOE = ModItems.ITEMS.register("loom_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> LOOM_TOP_HOE = ModItems.ITEMS.register("loom_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_CONCRETE_HOE = ModItems.ITEMS.register("magenta_concrete_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_CONCRETE_POWDER_HOE = ModItems.ITEMS.register("magenta_concrete_powder_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_GLAZED_TERRACOTTA_HOE = ModItems.ITEMS.register("magenta_glazed_terracotta_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_SHULKER_BOX_HOE = ModItems.ITEMS.register("magenta_shulker_box_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_STAINED_GLASS_HOE = ModItems.ITEMS.register("magenta_stained_glass_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_TERRACOTTA_HOE = ModItems.ITEMS.register("magenta_terracotta_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_WOOL_HOE = ModItems.ITEMS.register("magenta_wool_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_DOOR_BOTTOM_HOE = ModItems.ITEMS.register("mangrove_door_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_DOOR_TOP_HOE = ModItems.ITEMS.register("mangrove_door_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_LOG_HOE = ModItems.ITEMS.register("mangrove_log_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_LOG_TOP_HOE = ModItems.ITEMS.register("mangrove_log_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_PLANKS_HOE = ModItems.ITEMS.register("mangrove_planks_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_TRAPDOOR_HOE = ModItems.ITEMS.register("mangrove_trapdoor_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> MELON_SIDE_HOE = ModItems.ITEMS.register("melon_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> MELON_TOP_HOE = ModItems.ITEMS.register("melon_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> MOSS_BLOCK_HOE = ModItems.ITEMS.register("moss_block_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> MOSSY_COBBLESTONE_HOE = ModItems.ITEMS.register("mossy_cobblestone_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> MOSSY_STONE_BRICKS_HOE = ModItems.ITEMS.register("mossy_stone_bricks_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> MUD_HOE = ModItems.ITEMS.register("mud_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> MUD_BRICKS_HOE = ModItems.ITEMS.register("mud_bricks_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> MUDDY_MANGROVE_ROOTS_SIDE_HOE = ModItems.ITEMS.register("muddy_mangrove_roots_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> MUDDY_MANGROVE_ROOTS_TOP_HOE = ModItems.ITEMS.register("muddy_mangrove_roots_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> MUSHROOM_BLOCK_INSIDE_HOE = ModItems.ITEMS.register("mushroom_block_inside_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> MUSHROOM_STEM_HOE = ModItems.ITEMS.register("mushroom_stem_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> MYCELIUM_SIDE_HOE = ModItems.ITEMS.register("mycelium_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> MYCELIUM_TOP_HOE = ModItems.ITEMS.register("mycelium_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> NETHER_BRICKS_HOE = ModItems.ITEMS.register("nether_bricks_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> NETHER_GOLD_ORE_HOE = ModItems.ITEMS.register("nether_gold_ore_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> NETHER_QUARTZ_ORE_HOE = ModItems.ITEMS.register("nether_quartz_ore_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_BLOCK_HOE = ModItems.ITEMS.register("netherite_block_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> NETHERRACK_HOE = ModItems.ITEMS.register("netherrack_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> NOTE_BLOCK_HOE = ModItems.ITEMS.register("note_block_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> OAK_DOOR_BOTTOM_HOE = ModItems.ITEMS.register("oak_door_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> OAK_LEAVES_HOE = ModItems.ITEMS.register("oak_leaves_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> OAK_LOG_HOE = ModItems.ITEMS.register("oak_log_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> OAK_LOG_TOP_HOE = ModItems.ITEMS.register("oak_log_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> OAK_PLANKS_HOE = ModItems.ITEMS.register("oak_planks_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> OBSERVER_BACK_HOE = ModItems.ITEMS.register("observer_back_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> OBSERVER_BACK_ON_HOE = ModItems.ITEMS.register("observer_back_on_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> OBSERVER_FRONT_HOE = ModItems.ITEMS.register("observer_front_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> OBSERVER_SIDE_HOE = ModItems.ITEMS.register("observer_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> OBSERVER_TOP_HOE = ModItems.ITEMS.register("observer_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_HOE = ModItems.ITEMS.register("obsidian_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> OCHRE_FROGLIGHT_SIDE_HOE = ModItems.ITEMS.register("ochre_froglight_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> OCHRE_FROGLIGHT_TOP_HOE = ModItems.ITEMS.register("ochre_froglight_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_CONCRETE_HOE = ModItems.ITEMS.register("orange_concrete_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_CONCRETE_POWDER_HOE = ModItems.ITEMS.register("orange_concrete_powder_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_GLAZED_TERRACOTTA_HOE = ModItems.ITEMS.register("orange_glazed_terracotta_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_SHULKER_BOX_HOE = ModItems.ITEMS.register("orange_shulker_box_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_STAINED_GLASS_HOE = ModItems.ITEMS.register("orange_stained_glass_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_TERRACOTTA_HOE = ModItems.ITEMS.register("orange_terracotta_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_WOOL_HOE = ModItems.ITEMS.register("orange_wool_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> OXIDIZED_CHISELED_COPPER_HOE = ModItems.ITEMS.register("oxidized_chiseled_copper_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> OXIDIZED_COPPER_HOE = ModItems.ITEMS.register("oxidized_copper_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> OXIDIZED_COPPER_BULB_HOE = ModItems.ITEMS.register("oxidized_copper_bulb_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> OXIDIZED_COPPER_BULB_LIT_HOE = ModItems.ITEMS.register("oxidized_copper_bulb_lit_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> OXIDIZED_COPPER_BULB_LIT_POWERED_HOE = ModItems.ITEMS.register("oxidized_copper_bulb_lit_powered_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> OXIDIZED_COPPER_BULB_POWERED_HOE = ModItems.ITEMS.register("oxidized_copper_bulb_powered_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> OXIDIZED_COPPER_DOOR_BOTTOM_HOE = ModItems.ITEMS.register("oxidized_copper_door_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> OXIDIZED_CUT_COPPER_HOE = ModItems.ITEMS.register("oxidized_cut_copper_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> PACKED_ICE_HOE = ModItems.ITEMS.register("packed_ice_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> PACKED_MUD_HOE = ModItems.ITEMS.register("packed_mud_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> PEARLESCENT_FROGLIGHT_SIDE_HOE = ModItems.ITEMS.register("pearlescent_froglight_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> PEARLESCENT_FROGLIGHT_TOP_HOE = ModItems.ITEMS.register("pearlescent_froglight_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> PINK_CONCRETE_HOE = ModItems.ITEMS.register("pink_concrete_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> PINK_CONCRETE_POWDER_HOE = ModItems.ITEMS.register("pink_concrete_powder_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> PINK_GLAZED_TERRACOTTA_HOE = ModItems.ITEMS.register("pink_glazed_terracotta_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> PINK_SHULKER_BOX_HOE = ModItems.ITEMS.register("pink_shulker_box_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> PINK_STAINED_GLASS_HOE = ModItems.ITEMS.register("pink_stained_glass_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> PINK_TERRACOTTA_HOE = ModItems.ITEMS.register("pink_terracotta_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> PINK_WOOL_HOE = ModItems.ITEMS.register("pink_wool_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> PISTON_BOTTOM_HOE = ModItems.ITEMS.register("piston_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> PISTON_INNER_HOE = ModItems.ITEMS.register("piston_inner_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> PISTON_SIDE_HOE = ModItems.ITEMS.register("piston_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> PISTON_TOP_HOE = ModItems.ITEMS.register("piston_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> PISTON_TOP_STICKY_HOE = ModItems.ITEMS.register("piston_top_sticky_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> PODZOL_SIDE_HOE = ModItems.ITEMS.register("podzol_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> PODZOL_TOP_HOE = ModItems.ITEMS.register("podzol_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_ANDESITE_HOE = ModItems.ITEMS.register("polished_andesite_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_BASALT_SIDE_HOE = ModItems.ITEMS.register("polished_basalt_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_BASALT_TOP_HOE = ModItems.ITEMS.register("polished_basalt_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_BLACKSTONE_HOE = ModItems.ITEMS.register("polished_blackstone_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_BLACKSTONE_BRICKS_HOE = ModItems.ITEMS.register("polished_blackstone_bricks_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_DEEPSLATE_HOE = ModItems.ITEMS.register("polished_deepslate_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_DIORITE_HOE = ModItems.ITEMS.register("polished_diorite_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_GRANITE_HOE = ModItems.ITEMS.register("polished_granite_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_TUFF_HOE = ModItems.ITEMS.register("polished_tuff_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> POWDER_SNOW_HOE = ModItems.ITEMS.register("powder_snow_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> PRISMARINE_BRICKS_HOE = ModItems.ITEMS.register("prismarine_bricks_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> PUMPKIN_SIDE_HOE = ModItems.ITEMS.register("pumpkin_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> PUMPKIN_TOP_HOE = ModItems.ITEMS.register("pumpkin_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_CONCRETE_HOE = ModItems.ITEMS.register("purple_concrete_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_CONCRETE_POWDER_HOE = ModItems.ITEMS.register("purple_concrete_powder_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_GLAZED_TERRACOTTA_HOE = ModItems.ITEMS.register("purple_glazed_terracotta_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_SHULKER_BOX_HOE = ModItems.ITEMS.register("purple_shulker_box_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_STAINED_GLASS_HOE = ModItems.ITEMS.register("purple_stained_glass_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_TERRACOTTA_HOE = ModItems.ITEMS.register("purple_terracotta_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_WOOL_HOE = ModItems.ITEMS.register("purple_wool_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> PURPUR_BLOCK_HOE = ModItems.ITEMS.register("purpur_block_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> PURPUR_PILLAR_HOE = ModItems.ITEMS.register("purpur_pillar_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> PURPUR_PILLAR_TOP_HOE = ModItems.ITEMS.register("purpur_pillar_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_BLOCK_BOTTOM_HOE = ModItems.ITEMS.register("quartz_block_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_BLOCK_SIDE_HOE = ModItems.ITEMS.register("quartz_block_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_BLOCK_TOP_HOE = ModItems.ITEMS.register("quartz_block_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_BRICKS_HOE = ModItems.ITEMS.register("quartz_bricks_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_PILLAR_HOE = ModItems.ITEMS.register("quartz_pillar_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_PILLAR_TOP_HOE = ModItems.ITEMS.register("quartz_pillar_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> RAW_COPPER_BLOCK_HOE = ModItems.ITEMS.register("raw_copper_block_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> RAW_GOLD_BLOCK_HOE = ModItems.ITEMS.register("raw_gold_block_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> RAW_IRON_BLOCK_HOE = ModItems.ITEMS.register("raw_iron_block_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> RED_CONCRETE_HOE = ModItems.ITEMS.register("red_concrete_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> RED_CONCRETE_POWDER_HOE = ModItems.ITEMS.register("red_concrete_powder_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> RED_GLAZED_TERRACOTTA_HOE = ModItems.ITEMS.register("red_glazed_terracotta_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> RED_MUSHROOM_BLOCK_HOE = ModItems.ITEMS.register("red_mushroom_block_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> RED_NETHER_BRICKS_HOE = ModItems.ITEMS.register("red_nether_bricks_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> RED_SAND_HOE = ModItems.ITEMS.register("red_sand_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> RED_SANDSTONE_HOE = ModItems.ITEMS.register("red_sandstone_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> RED_SANDSTONE_BOTTOM_HOE = ModItems.ITEMS.register("red_sandstone_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> RED_SANDSTONE_TOP_HOE = ModItems.ITEMS.register("red_sandstone_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> RED_SHULKER_BOX_HOE = ModItems.ITEMS.register("red_shulker_box_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> RED_STAINED_GLASS_HOE = ModItems.ITEMS.register("red_stained_glass_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> RED_TERRACOTTA_HOE = ModItems.ITEMS.register("red_terracotta_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> RED_WOOL_HOE = ModItems.ITEMS.register("red_wool_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_BLOCK_HOE = ModItems.ITEMS.register("redstone_block_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_LAMP_HOE = ModItems.ITEMS.register("redstone_lamp_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_LAMP_ON_HOE = ModItems.ITEMS.register("redstone_lamp_on_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_ORE_HOE = ModItems.ITEMS.register("redstone_ore_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> REINFORCED_DEEPSLATE_BOTTOM_HOE = ModItems.ITEMS.register("reinforced_deepslate_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> REINFORCED_DEEPSLATE_SIDE_HOE = ModItems.ITEMS.register("reinforced_deepslate_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> REINFORCED_DEEPSLATE_TOP_HOE = ModItems.ITEMS.register("reinforced_deepslate_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> REPEATER_HOE = ModItems.ITEMS.register("repeater_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> REPEATER_ON_HOE = ModItems.ITEMS.register("repeater_on_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> RESPAWN_ANCHOR_BOTTOM_HOE = ModItems.ITEMS.register("respawn_anchor_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> RESPAWN_ANCHOR_SIDE0_HOE = ModItems.ITEMS.register("respawn_anchor_side0_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> RESPAWN_ANCHOR_SIDE1_HOE = ModItems.ITEMS.register("respawn_anchor_side1_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> RESPAWN_ANCHOR_SIDE2_HOE = ModItems.ITEMS.register("respawn_anchor_side2_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> RESPAWN_ANCHOR_SIDE3_HOE = ModItems.ITEMS.register("respawn_anchor_side3_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> RESPAWN_ANCHOR_SIDE4_HOE = ModItems.ITEMS.register("respawn_anchor_side4_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> RESPAWN_ANCHOR_TOP_OFF_HOE = ModItems.ITEMS.register("respawn_anchor_top_off_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> ROOTED_DIRT_HOE = ModItems.ITEMS.register("rooted_dirt_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SAND_HOE = ModItems.ITEMS.register("sand_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SANDSTONE_HOE = ModItems.ITEMS.register("sandstone_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SANDSTONE_BOTTOM_HOE = ModItems.ITEMS.register("sandstone_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SANDSTONE_TOP_HOE = ModItems.ITEMS.register("sandstone_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SCULK_CATALYST_BOTTOM_HOE = ModItems.ITEMS.register("sculk_catalyst_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SCULK_CATALYST_SIDE_HOE = ModItems.ITEMS.register("sculk_catalyst_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SCULK_CATALYST_TOP_HOE = ModItems.ITEMS.register("sculk_catalyst_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SCULK_SENSOR_BOTTOM_HOE = ModItems.ITEMS.register("sculk_sensor_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SCULK_SENSOR_TOP_HOE = ModItems.ITEMS.register("sculk_sensor_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SCULK_SHRIEKER_BOTTOM_HOE = ModItems.ITEMS.register("sculk_shrieker_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SHROOMLIGHT_HOE = ModItems.ITEMS.register("shroomlight_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SHULKER_BOX_HOE = ModItems.ITEMS.register("shulker_box_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SLIME_BLOCK_HOE = ModItems.ITEMS.register("slime_block_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SMITHING_TABLE_BOTTOM_HOE = ModItems.ITEMS.register("smithing_table_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SMITHING_TABLE_FRONT_HOE = ModItems.ITEMS.register("smithing_table_front_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SMITHING_TABLE_SIDE_HOE = ModItems.ITEMS.register("smithing_table_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SMITHING_TABLE_TOP_HOE = ModItems.ITEMS.register("smithing_table_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SMOKER_BOTTOM_HOE = ModItems.ITEMS.register("smoker_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SMOKER_FRONT_HOE = ModItems.ITEMS.register("smoker_front_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SMOKER_SIDE_HOE = ModItems.ITEMS.register("smoker_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SMOKER_TOP_HOE = ModItems.ITEMS.register("smoker_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SMOOTH_BASALT_HOE = ModItems.ITEMS.register("smooth_basalt_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SMOOTH_STONE_HOE = ModItems.ITEMS.register("smooth_stone_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SMOOTH_STONE_SLAB_SIDE_HOE = ModItems.ITEMS.register("smooth_stone_slab_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SNOW_HOE = ModItems.ITEMS.register("snow_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SOUL_SAND_HOE = ModItems.ITEMS.register("soul_sand_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SOUL_SOIL_HOE = ModItems.ITEMS.register("soul_soil_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SPONGE_HOE = ModItems.ITEMS.register("sponge_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_DOOR_BOTTOM_HOE = ModItems.ITEMS.register("spruce_door_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_DOOR_TOP_HOE = ModItems.ITEMS.register("spruce_door_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_LOG_HOE = ModItems.ITEMS.register("spruce_log_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_LOG_TOP_HOE = ModItems.ITEMS.register("spruce_log_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_PLANKS_HOE = ModItems.ITEMS.register("spruce_planks_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_TRAPDOOR_HOE = ModItems.ITEMS.register("spruce_trapdoor_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> STONE_HOE = ModItems.ITEMS.register("stone_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> STONE_BRICKS_HOE = ModItems.ITEMS.register("stone_bricks_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> STONECUTTER_BOTTOM_HOE = ModItems.ITEMS.register("stonecutter_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> STONECUTTER_SIDE_HOE = ModItems.ITEMS.register("stonecutter_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> STONECUTTER_TOP_HOE = ModItems.ITEMS.register("stonecutter_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_LOG_HOE = ModItems.ITEMS.register("stripped_acacia_log_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_LOG_TOP_HOE = ModItems.ITEMS.register("stripped_acacia_log_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BAMBOO_BLOCK_HOE = ModItems.ITEMS.register("stripped_bamboo_block_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BAMBOO_BLOCK_TOP_HOE = ModItems.ITEMS.register("stripped_bamboo_block_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_LOG_HOE = ModItems.ITEMS.register("stripped_birch_log_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_LOG_TOP_HOE = ModItems.ITEMS.register("stripped_birch_log_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_CHERRY_LOG_HOE = ModItems.ITEMS.register("stripped_cherry_log_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_CHERRY_LOG_TOP_HOE = ModItems.ITEMS.register("stripped_cherry_log_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_CRIMSON_STEM_HOE = ModItems.ITEMS.register("stripped_crimson_stem_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_CRIMSON_STEM_TOP_HOE = ModItems.ITEMS.register("stripped_crimson_stem_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_DARK_OAK_LOG_HOE = ModItems.ITEMS.register("stripped_dark_oak_log_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_DARK_OAK_LOG_TOP_HOE = ModItems.ITEMS.register("stripped_dark_oak_log_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_JUNGLE_LOG_HOE = ModItems.ITEMS.register("stripped_jungle_log_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_JUNGLE_LOG_TOP_HOE = ModItems.ITEMS.register("stripped_jungle_log_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_LOG_HOE = ModItems.ITEMS.register("stripped_mangrove_log_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_LOG_TOP_HOE = ModItems.ITEMS.register("stripped_mangrove_log_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_OAK_LOG_HOE = ModItems.ITEMS.register("stripped_oak_log_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_OAK_LOG_TOP_HOE = ModItems.ITEMS.register("stripped_oak_log_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_LOG_HOE = ModItems.ITEMS.register("stripped_spruce_log_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_LOG_TOP_HOE = ModItems.ITEMS.register("stripped_spruce_log_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WARPED_STEM_HOE = ModItems.ITEMS.register("stripped_warped_stem_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WARPED_STEM_TOP_HOE = ModItems.ITEMS.register("stripped_warped_stem_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> STRUCTURE_BLOCK_HOE = ModItems.ITEMS.register("structure_block_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> STRUCTURE_BLOCK_CORNER_HOE = ModItems.ITEMS.register("structure_block_corner_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> STRUCTURE_BLOCK_DATA_HOE = ModItems.ITEMS.register("structure_block_data_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> STRUCTURE_BLOCK_LOAD_HOE = ModItems.ITEMS.register("structure_block_load_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> STRUCTURE_BLOCK_SAVE_HOE = ModItems.ITEMS.register("structure_block_save_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SUSPICIOUS_GRAVEL_0_HOE = ModItems.ITEMS.register("suspicious_gravel_0_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SUSPICIOUS_GRAVEL_1_HOE = ModItems.ITEMS.register("suspicious_gravel_1_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SUSPICIOUS_GRAVEL_2_HOE = ModItems.ITEMS.register("suspicious_gravel_2_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SUSPICIOUS_GRAVEL_3_HOE = ModItems.ITEMS.register("suspicious_gravel_3_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SUSPICIOUS_SAND_0_HOE = ModItems.ITEMS.register("suspicious_sand_0_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SUSPICIOUS_SAND_1_HOE = ModItems.ITEMS.register("suspicious_sand_1_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SUSPICIOUS_SAND_2_HOE = ModItems.ITEMS.register("suspicious_sand_2_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> SUSPICIOUS_SAND_3_HOE = ModItems.ITEMS.register("suspicious_sand_3_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> TARGET_SIDE_HOE = ModItems.ITEMS.register("target_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> TARGET_TOP_HOE = ModItems.ITEMS.register("target_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> TERRACOTTA_HOE = ModItems.ITEMS.register("terracotta_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> TINTED_GLASS_HOE = ModItems.ITEMS.register("tinted_glass_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> TNT_BOTTOM_HOE = ModItems.ITEMS.register("tnt_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> TNT_SIDE_HOE = ModItems.ITEMS.register("tnt_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> TNT_TOP_HOE = ModItems.ITEMS.register("tnt_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> TRIAL_SPAWNER_TOP_ACTIVE_HOE = ModItems.ITEMS.register("trial_spawner_top_active_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> TRIAL_SPAWNER_TOP_EJECTING_REWARD_HOE = ModItems.ITEMS.register("trial_spawner_top_ejecting_reward_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> TRIAL_SPAWNER_TOP_INACTIVE_HOE = ModItems.ITEMS.register("trial_spawner_top_inactive_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> TUBE_CORAL_BLOCK_HOE = ModItems.ITEMS.register("tube_coral_block_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> TUFF_HOE = ModItems.ITEMS.register("tuff_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> TUFF_BRICKS_HOE = ModItems.ITEMS.register("tuff_bricks_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> VERDANT_FROGLIGHT_SIDE_HOE = ModItems.ITEMS.register("verdant_froglight_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> VERDANT_FROGLIGHT_TOP_HOE = ModItems.ITEMS.register("verdant_froglight_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> WARPED_DOOR_BOTTOM_HOE = ModItems.ITEMS.register("warped_door_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> WARPED_DOOR_TOP_HOE = ModItems.ITEMS.register("warped_door_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> WARPED_NYLIUM_HOE = ModItems.ITEMS.register("warped_nylium_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> WARPED_NYLIUM_SIDE_HOE = ModItems.ITEMS.register("warped_nylium_side_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> WARPED_PLANKS_HOE = ModItems.ITEMS.register("warped_planks_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> WARPED_STEM_TOP_HOE = ModItems.ITEMS.register("warped_stem_top_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> WARPED_WART_BLOCK_HOE = ModItems.ITEMS.register("warped_wart_block_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> WATER_OVERLAY_HOE = ModItems.ITEMS.register("water_overlay_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> WEATHERED_CHISELED_COPPER_HOE = ModItems.ITEMS.register("weathered_chiseled_copper_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> WEATHERED_COPPER_HOE = ModItems.ITEMS.register("weathered_copper_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> WEATHERED_COPPER_BULB_HOE = ModItems.ITEMS.register("weathered_copper_bulb_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> WEATHERED_COPPER_BULB_LIT_HOE = ModItems.ITEMS.register("weathered_copper_bulb_lit_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> WEATHERED_COPPER_BULB_LIT_POWERED_HOE = ModItems.ITEMS.register("weathered_copper_bulb_lit_powered_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> WEATHERED_COPPER_BULB_POWERED_HOE = ModItems.ITEMS.register("weathered_copper_bulb_powered_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> WEATHERED_COPPER_DOOR_BOTTOM_HOE = ModItems.ITEMS.register("weathered_copper_door_bottom_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> WEATHERED_CUT_COPPER_HOE = ModItems.ITEMS.register("weathered_cut_copper_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> WET_SPONGE_HOE = ModItems.ITEMS.register("wet_sponge_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CONCRETE_HOE = ModItems.ITEMS.register("white_concrete_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CONCRETE_POWDER_HOE = ModItems.ITEMS.register("white_concrete_powder_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> WHITE_GLAZED_TERRACOTTA_HOE = ModItems.ITEMS.register("white_glazed_terracotta_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> WHITE_SHULKER_BOX_HOE = ModItems.ITEMS.register("white_shulker_box_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> WHITE_STAINED_GLASS_HOE = ModItems.ITEMS.register("white_stained_glass_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> WHITE_TERRACOTTA_HOE = ModItems.ITEMS.register("white_terracotta_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> WHITE_WOOL_HOE = ModItems.ITEMS.register("white_wool_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_CONCRETE_HOE = ModItems.ITEMS.register("yellow_concrete_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_CONCRETE_POWDER_HOE = ModItems.ITEMS.register("yellow_concrete_powder_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_GLAZED_TERRACOTTA_HOE = ModItems.ITEMS.register("yellow_glazed_terracotta_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_SHULKER_BOX_HOE = ModItems.ITEMS.register("yellow_shulker_box_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_STAINED_GLASS_HOE = ModItems.ITEMS.register("yellow_stained_glass_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_TERRACOTTA_HOE = ModItems.ITEMS.register("yellow_terracotta_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_WOOL_HOE = ModItems.ITEMS.register("yellow_wool_hoe",
            () -> new HoeItem(CustomTiers.WOOD, new Item.Properties()));

}
