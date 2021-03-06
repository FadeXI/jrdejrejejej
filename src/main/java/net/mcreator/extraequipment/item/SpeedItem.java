
package net.mcreator.extraequipment.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.mcreator.extraequipment.itemgroup.ExtraequipmentItemGroup;
import net.mcreator.extraequipment.ExtraEquipmentModElements;

@ExtraEquipmentModElements.ModElement.Tag
public class SpeedItem extends ExtraEquipmentModElements.ModElement {
	@ObjectHolder("extra_equipment:speed")
	public static final Item block = null;
	public SpeedItem(ExtraEquipmentModElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, ExtraEquipmentModElements.sounds.get(new ResourceLocation("extra_equipment:music")),
					new Item.Properties().group(ExtraequipmentItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("speed");
		}
	}
}
