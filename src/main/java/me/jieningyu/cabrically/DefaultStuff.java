package me.jieningyu.cabrically;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DefaultStuff {
	public static Item ANDESITE_MECHANISM = new Item(new Item.Settings().group(Cabrically.ITEM_GROUP));
	public static final Block ANDESITE_MACHINE = new MachineBlock(FabricBlockSettings.of(Material.STONE).strength(1.7f));

	public static Item BRASS_MECHANISM = new Item(new Item.Settings().group(Cabrically.ITEM_GROUP));
	public static final Block BRASS_MACHINE = new MachineBlock(FabricBlockSettings.of(Material.METAL).strength(1.7f));

	public static Item COPPER_MECHANISM = new Item(new Item.Settings().group(Cabrically.ITEM_GROUP));
	public static final Block COPPER_MACHINE = new MachineBlock(FabricBlockSettings.of(Material.METAL).strength(1.7f));

	public static void registerMachineType(String type, Item item, Block block){
		Registry.register(Registry.ITEM, new Identifier(Cabrically.NAMESPACE, type + "_mechanism"), item);
		Registry.register(Registry.BLOCK, new Identifier(Cabrically.NAMESPACE, type + "_machine"), block);
        Registry.register(Registry.ITEM, new Identifier(Cabrically.NAMESPACE, type + "_machine"), new BlockItem(block, new FabricItemSettings().group(Cabrically.ITEM_GROUP)));
	}
	public static void register() {
		registerMachineType("andesite", ANDESITE_MECHANISM, ANDESITE_MACHINE);
		registerMachineType("brass", BRASS_MECHANISM, BRASS_MACHINE);
		registerMachineType("copper", COPPER_MECHANISM, COPPER_MACHINE);
	}
}
