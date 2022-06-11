package me.jieningyu.cabrically;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

//import static net.fabricmc.fabric.api.resource.ResourceManagerHelper.registerBuiltinResourcePack;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
//import net.fabricmc.fabric.api.resource.ResourcePackActivationType;

public class Cabrically implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Cabrically");
	public static final String NAMESPACE = "cabrically";
//	public static final ResourcePackActivationType PACK_TYPE = ResourcePackActivationType.DEFAULT_ENABLED;

	public static ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(new Identifier(NAMESPACE, "item_group")).icon(() -> new ItemStack(DefaultStuff.ANDESITE_MECHANISM)).build();

	@Override
	public void onInitialize() {
		DefaultStuff.register();
	}
}
