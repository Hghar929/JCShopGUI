package me.jericraft;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;

import static me.jericraft.main_menu.createGuiItem;

public class category_DecorationBlocks implements Listener {
    public static Inventory decorationBlocks_1 = org.bukkit.Bukkit.createInventory(null, 54, ChatColor.RED + "Decoration Blocks (page 1)");

    public static void addItems_decorationBlocks_1() {
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.OAK_SAPLING));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.SPRUCE_SAPLING));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.BIRCH_SAPLING));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.JUNGLE_SAPLING));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.ACACIA_SAPLING));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.DARK_OAK_SAPLING));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.OAK_LEAVES));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.SPRUCE_LEAVES));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.BIRCH_LEAVES));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.JUNGLE_LEAVES));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.ACACIA_LEAVES));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.DARK_OAK_LEAVES));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.COBWEB));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.GRASS));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.FERN));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.DEAD_BUSH));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.SEAGRASS));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.SEA_PICKLE));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.DANDELION));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.POPPY));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.BLUE_ORCHID));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.ALLIUM));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.AZURE_BLUET));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.RED_TULIP));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.ORANGE_TULIP));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.WHITE_TULIP));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.PINK_TULIP));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.OXEYE_DAISY));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.BROWN_MUSHROOM));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.RED_MUSHROOM));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.TORCH));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.END_ROD));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.CHORUS_PLANT));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.CHORUS_FLOWER));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.CHEST));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.CRAFTING_TABLE));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.FARMLAND));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.FURNACE));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.LADDER));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.SNOW));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.CACTUS));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.JUKEBOX));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.OAK_FENCE));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.SPRUCE_FENCE));
        decorationBlocks_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.BIRCH_FENCE));
        ItemStack previousPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta previousPageMeta = previousPage.getItemMeta();
        previousPageMeta.setDisplayName("previous_page");
        previousPageMeta.setLore(Arrays.asList("<<-- (menu) Previous Page"));
        previousPage.setItemMeta(previousPageMeta);
        decorationBlocks_1.setItem(45, new ItemStack(previousPage));
        ItemStack nextPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta nextPageMeta = nextPage.getItemMeta();
        nextPageMeta.setDisplayName("next_page");
        nextPageMeta.setLore(Arrays.asList("Next Page (2) -->>"));
        nextPage.setItemMeta(nextPageMeta);
        decorationBlocks_1.setItem(53, new ItemStack(nextPage));
    }

    public static Inventory decorationBlocks_2 = org.bukkit.Bukkit.createInventory(null, 54, ChatColor.RED + "Decoration Blocks (page 2)");

    public static void addItems_decorationBlocks_2() {
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.JUNGLE_FENCE));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.ACACIA_FENCE));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.DARK_OAK_FENCE));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.INFESTED_STONE));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.INFESTED_COBBLESTONE));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.INFESTED_STONE_BRICKS));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.INFESTED_MOSSY_STONE_BRICKS));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.INFESTED_CRACKED_STONE_BRICKS));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.INFESTED_CHISELED_STONE_BRICKS));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.BROWN_MUSHROOM_BLOCK));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.RED_MUSHROOM_BLOCK));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.MUSHROOM_STEM));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.IRON_BARS));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.GLASS_PANE));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.VINE));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.LILY_PAD));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.NETHER_BRICK_FENCE));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.ENCHANTING_TABLE));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.END_PORTAL_FRAME));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.ENDER_CHEST));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.COBBLESTONE_WALL));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.MOSSY_COBBLESTONE_WALL));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.ANVIL));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.CHIPPED_ANVIL));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.DAMAGED_ANVIL));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.WHITE_CARPET));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.ORANGE_CARPET));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.MAGENTA_CARPET));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.LIGHT_BLUE_CARPET));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.YELLOW_CARPET));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.LIME_CARPET));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.PINK_CARPET));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.GRAY_CARPET));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.LIGHT_GRAY_CARPET));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.CYAN_CARPET));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.PURPLE_CARPET));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.BLUE_CARPET));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.BROWN_CARPET));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.GREEN_CARPET));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.RED_CARPET));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.BLACK_CARPET));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.SLIME_BLOCK));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.GRASS_PATH));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.SUNFLOWER));
        decorationBlocks_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.LILAC));
        ItemStack previousPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta previousPageMeta = previousPage.getItemMeta();
        previousPageMeta.setDisplayName("previous_page");
        previousPageMeta.setLore(Arrays.asList("<<-- (1) Previous Page"));
        previousPage.setItemMeta(previousPageMeta);
        decorationBlocks_2.setItem(45, new ItemStack(previousPage));
        ItemStack nextPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta nextPageMeta = nextPage.getItemMeta();
        nextPageMeta.setDisplayName("next_page");
        nextPageMeta.setLore(Arrays.asList("Next Page (3) -->>"));
        nextPage.setItemMeta(nextPageMeta);
        decorationBlocks_2.setItem(53, new ItemStack(nextPage));
    }

    public static Inventory decorationBlocks_3 = org.bukkit.Bukkit.createInventory(null, 54, ChatColor.RED + "Decoration Blocks (page 3)");
    public static void addItems_decorationBlocks_3() {
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.ROSE_BUSH));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.PEONY));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.TALL_GRASS));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.LARGE_FERN));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.WHITE_STAINED_GLASS_PANE));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.ORANGE_STAINED_GLASS_PANE));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.MAGENTA_STAINED_GLASS_PANE));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.LIGHT_BLUE_STAINED_GLASS_PANE));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.YELLOW_STAINED_GLASS_PANE));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.LIME_STAINED_GLASS_PANE));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.PINK_STAINED_GLASS_PANE));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.GRAY_STAINED_GLASS_PANE));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.LIGHT_GRAY_STAINED_GLASS_PANE));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.CYAN_STAINED_GLASS_PANE));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.PURPLE_STAINED_GLASS_PANE));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.BLUE_STAINED_GLASS_PANE));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.BROWN_STAINED_GLASS_PANE));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.GREEN_STAINED_GLASS_PANE));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.RED_STAINED_GLASS_PANE));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.BLACK_STAINED_GLASS_PANE));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.SHULKER_BOX));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.WHITE_SHULKER_BOX));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.ORANGE_SHULKER_BOX));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.MAGENTA_SHULKER_BOX));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.LIGHT_BLUE_SHULKER_BOX));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.YELLOW_SHULKER_BOX));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.LIME_SHULKER_BOX));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.PINK_SHULKER_BOX));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.GRAY_SHULKER_BOX));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.LIGHT_GRAY_SHULKER_BOX));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.CYAN_SHULKER_BOX));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.PURPLE_SHULKER_BOX));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.BLUE_SHULKER_BOX));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.BROWN_SHULKER_BOX));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.GREEN_SHULKER_BOX));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.RED_SHULKER_BOX));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.BLACK_SHULKER_BOX));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.WHITE_GLAZED_TERRACOTTA));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.ORANGE_GLAZED_TERRACOTTA));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.MAGENTA_GLAZED_TERRACOTTA));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.LIGHT_BLUE_GLAZED_TERRACOTTA));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.YELLOW_GLAZED_TERRACOTTA));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.LIME_GLAZED_TERRACOTTA));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.PINK_GLAZED_TERRACOTTA));
        decorationBlocks_3.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.GRAY_GLAZED_TERRACOTTA));
        ItemStack previousPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta previousPageMeta = previousPage.getItemMeta();
        previousPageMeta.setDisplayName("previous_page");
        previousPageMeta.setLore(Arrays.asList("<<-- (2) Previous Page"));
        previousPage.setItemMeta(previousPageMeta);
        decorationBlocks_3.setItem(45, new ItemStack(previousPage));
        ItemStack nextPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta nextPageMeta = nextPage.getItemMeta();
        nextPageMeta.setDisplayName("next_page");
        nextPageMeta.setLore(Arrays.asList("Next Page (4) -->>"));
        nextPage.setItemMeta(nextPageMeta);
        decorationBlocks_3.setItem(53, new ItemStack(nextPage));
    }

    public static Inventory decorationBlocks_4 = org.bukkit.Bukkit.createInventory(null, 54, ChatColor.RED + "Decoration Blocks (page 4)");
    public static void addItems_decorationBlocks_4() {
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.LIGHT_GRAY_GLAZED_TERRACOTTA));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.CYAN_GLAZED_TERRACOTTA));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.PURPLE_GLAZED_TERRACOTTA));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.BLUE_GLAZED_TERRACOTTA));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.BROWN_GLAZED_TERRACOTTA));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.GREEN_GLAZED_TERRACOTTA));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.RED_GLAZED_TERRACOTTA));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.BLACK_GLAZED_TERRACOTTA));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.TUBE_CORAL));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.BRAIN_CORAL));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.BUBBLE_CORAL));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.FIRE_CORAL));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.HORN_CORAL));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.DEAD_BRAIN_CORAL));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.DEAD_BUBBLE_CORAL));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.DEAD_FIRE_CORAL));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.DEAD_HORN_CORAL));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.DEAD_TUBE_CORAL));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.TUBE_CORAL_FAN));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.BRAIN_CORAL_FAN));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.BUBBLE_CORAL_FAN));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.FIRE_CORAL_FAN));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.HORN_CORAL_FAN));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.DEAD_TUBE_CORAL_FAN));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.DEAD_BRAIN_CORAL_FAN));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.DEAD_FIRE_CORAL_FAN));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.DEAD_HORN_CORAL_FAN));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.PAINTING));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.SIGN));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.WHITE_BED));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.ORANGE_BED));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.MAGENTA_BED));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.LIGHT_BLUE_BED));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.YELLOW_BED));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.LIME_BED));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.PINK_BED));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.GRAY_BED));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.LIGHT_GRAY_BED));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.CYAN_BED));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.PURPLE_BED));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.BLUE_BED));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.BROWN_BED));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.GREEN_BED));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.RED_BED));
        decorationBlocks_4.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.BLACK_BED));
        ItemStack previousPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta previousPageMeta = previousPage.getItemMeta();
        previousPageMeta.setDisplayName("previous_page");
        previousPageMeta.setLore(Arrays.asList("<<-- (3) Previous Page"));
        previousPage.setItemMeta(previousPageMeta);
        decorationBlocks_4.setItem(45, new ItemStack(previousPage));
        ItemStack nextPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta nextPageMeta = nextPage.getItemMeta();
        nextPageMeta.setDisplayName("next_page");
        nextPageMeta.setLore(Arrays.asList("Next Page (5) -->>"));
        nextPage.setItemMeta(nextPageMeta);
        decorationBlocks_4.setItem(53, new ItemStack(nextPage));
    }
    public static Inventory decorationBlocks_5 = org.bukkit.Bukkit.createInventory(null, 36, ChatColor.RED + "Decoration Blocks (page 5)");
    public static void addItems_decorationBlocks_5() {
        decorationBlocks_5.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.ITEM_FRAME));
        decorationBlocks_5.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.FLOWER_POT));
        decorationBlocks_5.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.SKELETON_SKULL));
        decorationBlocks_5.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.WITHER_SKELETON_SKULL));
        decorationBlocks_5.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.PLAYER_HEAD));
        decorationBlocks_5.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.ZOMBIE_HEAD));
        decorationBlocks_5.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.CREEPER_HEAD));
        decorationBlocks_5.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.DRAGON_HEAD));
        decorationBlocks_5.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.ARMOR_STAND));
        decorationBlocks_5.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.WHITE_BANNER));
        decorationBlocks_5.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.ORANGE_BANNER));
        decorationBlocks_5.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.MAGENTA_BANNER));
        decorationBlocks_5.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.LIGHT_BLUE_BANNER));
        decorationBlocks_5.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.YELLOW_BANNER));
        decorationBlocks_5.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.LIME_BANNER));
        decorationBlocks_5.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.PINK_BANNER));
        decorationBlocks_5.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.GRAY_BANNER));
        decorationBlocks_5.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.LIGHT_GRAY_BANNER));
        decorationBlocks_5.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.CYAN_BANNER));
        decorationBlocks_5.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.PURPLE_BANNER));
        decorationBlocks_5.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.BLUE_BANNER));
        decorationBlocks_5.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.BROWN_BANNER));
        decorationBlocks_5.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.GREEN_BANNER));
        decorationBlocks_5.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.RED_BANNER));
        decorationBlocks_5.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.BLACK_BANNER));
        decorationBlocks_5.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.END_CRYSTAL));
        ItemStack previousPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta previousPageMeta = previousPage.getItemMeta();
        previousPageMeta.setDisplayName("previous_page");
        previousPageMeta.setLore(Arrays.asList("<<-- (4) Previous Page"));
        previousPage.setItemMeta(previousPageMeta);
        decorationBlocks_5.setItem(27, new ItemStack(previousPage));
    }
}
