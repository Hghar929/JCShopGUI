package me.jericraft;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.Arrays;

import static me.jericraft.main_menu.createGuiItem;

public class category_BuildingBlocks implements Listener {
    public static Inventory buildingBlocks_1 = org.bukkit.Bukkit.createInventory(null, 54, ChatColor.RED + "Building Blocks (page 1)");
    public static void addItems_BuildingBlocks_1() {
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.STONE));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.GRANITE));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.POLISHED_GRANITE));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.DIORITE));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.POLISHED_DIORITE));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.ANDESITE));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.POLISHED_ANDESITE));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.GRASS_BLOCK));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.DIRT));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.COARSE_DIRT));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.PODZOL));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.COBBLESTONE));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.OAK_PLANKS));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.SPRUCE_PLANKS));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.BIRCH_PLANKS));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.JUNGLE_PLANKS));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.ACACIA_PLANKS));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.DARK_OAK_PLANKS));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.BEDROCK));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.SAND));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.RED_SAND));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.GRAVEL));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.GOLD_ORE));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.IRON_ORE));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.COAL_ORE));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.OAK_LOG));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.SPRUCE_LOG));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.BIRCH_LOG));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.JUNGLE_LOG));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.ACACIA_LOG));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.DARK_OAK_LOG));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.STRIPPED_OAK_LOG));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.STRIPPED_SPRUCE_LOG));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.STRIPPED_BIRCH_LOG));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.STRIPPED_JUNGLE_LOG));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.STRIPPED_ACACIA_LOG));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.STRIPPED_DARK_OAK_LOG));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.STRIPPED_OAK_WOOD));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.STRIPPED_SPRUCE_WOOD));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.STRIPPED_BIRCH_WOOD));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.STRIPPED_JUNGLE_WOOD));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.STRIPPED_ACACIA_WOOD));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.STRIPPED_DARK_OAK_WOOD));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.OAK_WOOD));
        buildingBlocks_1.addItem(createGuiItem("item_name", Material.SPRUCE_WOOD));
        ItemStack previousPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta previousPageMeta = previousPage.getItemMeta();
        previousPageMeta.setDisplayName("previous_page");
        previousPageMeta.setLore(Arrays.asList("<<-- (menu) Previous Page"));
        previousPage.setItemMeta(previousPageMeta);
        buildingBlocks_1.setItem(45, new ItemStack(previousPage));
        ItemStack nextPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta nextPageMeta = nextPage.getItemMeta();
        nextPageMeta.setDisplayName("next_page");
        nextPageMeta.setLore(Arrays.asList("Next Page (2) -->>"));
        nextPage.setItemMeta(nextPageMeta);
        buildingBlocks_1.setItem(53, new ItemStack(nextPage));
    }

    public static Inventory buildingBlocks_2 = org.bukkit.Bukkit.createInventory(null, 54, ChatColor.RED + "Building Blocks (page 2)");

    public static void addItems_BuildingBlocks_2() {
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.BIRCH_WOOD));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.JUNGLE_WOOD));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.ACACIA_WOOD));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.DARK_OAK_WOOD));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.SPONGE));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.WET_SPONGE));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.GLASS));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.LAPIS_ORE));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.LAPIS_BLOCK));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.SANDSTONE));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.CHISELED_SANDSTONE));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.CUT_SANDSTONE));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.WHITE_WOOL));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.ORANGE_WOOL));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.MAGENTA_WOOL));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.LIGHT_BLUE_WOOL));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.YELLOW_WOOL));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.LIME_WOOL));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.PINK_WOOL));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.GRAY_WOOL));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.LIGHT_GRAY_WOOL));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.CYAN_WOOL));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.PURPLE_WOOL));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.BLUE_WOOL));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.BROWN_WOOL));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.GREEN_WOOL));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.RED_WOOL));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.BLACK_WOOL));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.GOLD_BLOCK));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.IRON_BLOCK));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.OAK_SLAB));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.SPRUCE_SLAB));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.BIRCH_SLAB));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.JUNGLE_SLAB));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.ACACIA_SLAB));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.DARK_OAK_SLAB));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.STONE_SLAB));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.SANDSTONE_SLAB));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.PETRIFIED_OAK_SLAB));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.COBBLESTONE_SLAB));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.BRICK_SLAB));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.NETHER_BRICK_SLAB));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.QUARTZ_SLAB));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.RED_SANDSTONE_SLAB));
        buildingBlocks_2.addItem(createGuiItem("item_name", Material.PURPUR_SLAB));
        ItemStack previousPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta previousPageMeta = previousPage.getItemMeta();
        previousPageMeta.setDisplayName("previous_page");
        previousPageMeta.setLore(Arrays.asList("<<-- (1) Previous Page"));
        previousPage.setItemMeta(previousPageMeta);
        buildingBlocks_2.setItem(45, new ItemStack(previousPage));

        ItemStack nextPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta nextPageMeta = nextPage.getItemMeta();
        nextPageMeta.setDisplayName("next_page");
        nextPageMeta.setLore(Arrays.asList("Next Page (3) -->>"));
        nextPage.setItemMeta(nextPageMeta);
        buildingBlocks_2.setItem(53, new ItemStack(nextPage));
    }

    public static Inventory buildingBlocks_3 = org.bukkit.Bukkit.createInventory(null, 54, ChatColor.RED + "Building Blocks (page 3)");

    public static void addItems_BuildingBlocks_3() {
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.PRISMARINE_SLAB));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.PRISMARINE_BRICK_SLAB));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.DARK_PRISMARINE_SLAB));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.SMOOTH_QUARTZ));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.SMOOTH_RED_SANDSTONE));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.SMOOTH_SANDSTONE));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.SMOOTH_STONE));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.BRICKS));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.BOOKSHELF));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.MOSSY_COBBLESTONE));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.OBSIDIAN));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.PURPUR_BLOCK));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.PURPUR_PILLAR));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.PURPUR_STAIRS));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.OAK_STAIRS));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.DIAMOND_ORE));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.DIAMOND_BLOCK));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.COBBLESTONE_STAIRS));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.REDSTONE_ORE));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.ICE));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.SNOW_BLOCK));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.CLAY));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.PUMPKIN));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.CARVED_PUMPKIN));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.NETHERRACK));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.SOUL_SAND));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.GLOWSTONE));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.JACK_O_LANTERN));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.STONE_BRICKS));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.MOSSY_STONE_BRICKS));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.CRACKED_STONE_BRICKS));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.CHISELED_STONE_BRICKS));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.MELON));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.BRICK_STAIRS));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.STONE_BRICK_STAIRS));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.MYCELIUM));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.NETHER_BRICKS));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.NETHER_BRICK_STAIRS));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.END_STONE));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.END_STONE_BRICKS));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.EMERALD_ORE));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.EMERALD_BLOCK));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.SPRUCE_STAIRS));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.BIRCH_STAIRS));
        buildingBlocks_3.addItem(createGuiItem("item_name", Material.JUNGLE_STAIRS));
        ItemStack previousPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta previousPageMeta = previousPage.getItemMeta();
        previousPageMeta.setDisplayName("previous_page");
        previousPageMeta.setLore(Arrays.asList("<<-- (2) Previous Page"));
        previousPage.setItemMeta(previousPageMeta);
        buildingBlocks_3.setItem(45, new ItemStack(previousPage));

        ItemStack nextPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta nextPageMeta = nextPage.getItemMeta();
        nextPageMeta.setDisplayName("next_page");
        nextPageMeta.setLore(Arrays.asList("Next Page (4) -->>"));
        nextPage.setItemMeta(nextPageMeta);
        buildingBlocks_3.setItem(53, new ItemStack(nextPage));
    }

    public static Inventory buildingBlocks_4 = org.bukkit.Bukkit.createInventory(null, 54, ChatColor.RED + "Building Blocks (page 4)");

    public static void addItems_BuildingBlocks_4() {
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.CHISELED_QUARTZ_BLOCK));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.QUARTZ_BLOCK));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.QUARTZ_PILLAR));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.QUARTZ_STAIRS));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.WHITE_TERRACOTTA));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.ORANGE_TERRACOTTA));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.MAGENTA_TERRACOTTA));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.LIGHT_BLUE_TERRACOTTA));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.YELLOW_TERRACOTTA));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.PINK_TERRACOTTA));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.GRAY_TERRACOTTA));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.LIGHT_GRAY_TERRACOTTA));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.CYAN_TERRACOTTA));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.PURPLE_TERRACOTTA));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.BLUE_TERRACOTTA));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.BROWN_TERRACOTTA));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.GREEN_TERRACOTTA));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.RED_TERRACOTTA));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.BLACK_TERRACOTTA));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.HAY_BLOCK));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.TERRACOTTA));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.COAL_BLOCK));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.PACKED_ICE));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.ACACIA_STAIRS));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.DARK_OAK_STAIRS));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.WHITE_STAINED_GLASS));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.ORANGE_STAINED_GLASS));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.MAGENTA_STAINED_GLASS));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.LIGHT_BLUE_STAINED_GLASS));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.YELLOW_STAINED_GLASS));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.LIME_STAINED_GLASS));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.PINK_STAINED_GLASS));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.GRAY_STAINED_GLASS));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.LIGHT_GRAY_STAINED_GLASS));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.CYAN_STAINED_GLASS));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.PURPLE_STAINED_GLASS));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.BLUE_STAINED_GLASS));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.BROWN_STAINED_GLASS));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.GREEN_STAINED_GLASS));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.RED_STAINED_GLASS));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.BLACK_STAINED_GLASS));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.PRISMARINE));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.PRISMARINE_BRICKS));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.DARK_PRISMARINE));
        buildingBlocks_4.addItem(createGuiItem("item_name", Material.PRISMARINE_STAIRS));
        ItemStack previousPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta previousPageMeta = previousPage.getItemMeta();
        previousPageMeta.setDisplayName("previous_page");
        previousPageMeta.setLore(Arrays.asList("<<-- (4) Previous Page"));
        previousPage.setItemMeta(previousPageMeta);
        buildingBlocks_4.setItem(45, new ItemStack(previousPage));

        ItemStack nextPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta nextPageMeta = nextPage.getItemMeta();
        nextPageMeta.setDisplayName("next_page");
        nextPageMeta.setLore(Arrays.asList("Next Page (5) -->>"));
        nextPage.setItemMeta(nextPageMeta);
        buildingBlocks_4.setItem(53, new ItemStack(nextPage));
    }

    public static Inventory buildingBlocks_5 = org.bukkit.Bukkit.createInventory(null, 54, ChatColor.RED + "Building Blocks (page 5)");

    public static void addItems_BuildingBlocks_5() {
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.PRISMARINE_BRICK_STAIRS));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.DARK_PRISMARINE_STAIRS));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.SEA_LANTERN));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.RED_SANDSTONE));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.CHISELED_RED_SANDSTONE));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.CUT_RED_SANDSTONE));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.RED_SANDSTONE_STAIRS));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.MAGMA_BLOCK));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.NETHER_WART_BLOCK));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.RED_NETHER_BRICKS));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.BONE_BLOCK));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.WHITE_CONCRETE));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.ORANGE_CONCRETE));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.MAGENTA_CONCRETE));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.LIGHT_BLUE_CONCRETE));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.YELLOW_CONCRETE));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.LIME_CONCRETE));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.PINK_CONCRETE));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.GRAY_CONCRETE));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.LIGHT_GRAY_CONCRETE));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.CYAN_CONCRETE));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.PURPLE_CONCRETE));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.BLUE_CONCRETE));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.BROWN_CONCRETE));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.GREEN_CONCRETE));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.RED_CONCRETE));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.BLACK_CONCRETE));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.WHITE_CONCRETE_POWDER));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.ORANGE_CONCRETE_POWDER));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.MAGENTA_CONCRETE_POWDER));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.LIGHT_BLUE_CONCRETE_POWDER));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.YELLOW_CONCRETE_POWDER));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.LIME_CONCRETE_POWDER));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.PINK_CONCRETE_POWDER));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.GRAY_CONCRETE_POWDER));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.LIGHT_GRAY_CONCRETE_POWDER));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.CYAN_CONCRETE_POWDER));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.PURPLE_CONCRETE_POWDER));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.BLUE_CONCRETE_POWDER));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.BROWN_CONCRETE_POWDER));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.GREEN_CONCRETE_POWDER));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.RED_CONCRETE_POWDER));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.BLACK_CONCRETE_POWDER));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.DEAD_TUBE_CORAL_BLOCK));
        buildingBlocks_5.addItem(createGuiItem("item_name", Material.DEAD_BRAIN_CORAL_BLOCK));
        ItemStack previousPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta previousPageMeta = previousPage.getItemMeta();
        previousPageMeta.setDisplayName("previous_page");
        previousPageMeta.setLore(Arrays.asList("<<-- (5) Previous Page"));
        previousPage.setItemMeta(previousPageMeta);
        buildingBlocks_5.setItem(45, new ItemStack(previousPage));

        ItemStack nextPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta nextPageMeta = nextPage.getItemMeta();
        nextPageMeta.setDisplayName("next_page");
        nextPageMeta.setLore(Arrays.asList("Next Page (6) -->>"));
        nextPage.setItemMeta(nextPageMeta);
        buildingBlocks_5.setItem(53, new ItemStack(nextPage));
    }

    public static Inventory buildingBlocks_6 = org.bukkit.Bukkit.createInventory(null, 27, ChatColor.RED + "Building Blocks (page 6)");

    public static void addItems_BuildingBlocks_6() {
        buildingBlocks_6.addItem(createGuiItem("item_name", Material.DEAD_BUBBLE_CORAL_BLOCK));
        buildingBlocks_6.addItem(createGuiItem("item_name", Material.DEAD_FIRE_CORAL_BLOCK));
        buildingBlocks_6.addItem(createGuiItem("item_name", Material.DEAD_HORN_CORAL_BLOCK));
        buildingBlocks_6.addItem(createGuiItem("item_name", Material.TUBE_CORAL_BLOCK));
        buildingBlocks_6.addItem(createGuiItem("item_name", Material.BRAIN_CORAL_BLOCK));
        buildingBlocks_6.addItem(createGuiItem("item_name", Material.BUBBLE_CORAL_BLOCK));
        buildingBlocks_6.addItem(createGuiItem("item_name", Material.FIRE_CORAL_BLOCK));
        buildingBlocks_6.addItem(createGuiItem("item_name", Material.HORN_CORAL_BLOCK));
        buildingBlocks_6.addItem(createGuiItem("item_name", Material.BLUE_ICE));
        buildingBlocks_6.addItem(createGuiItem("item_name", Material.DRIED_KELP_BLOCK));
        ItemStack previousPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta previousPageMeta = previousPage.getItemMeta();
        previousPageMeta.setDisplayName("previous_page");
        previousPageMeta.setLore(Arrays.asList("<<-- (5) Previous Page"));
        previousPage.setItemMeta(previousPageMeta);
        buildingBlocks_6.setItem(18, new ItemStack(previousPage));
    }
}
