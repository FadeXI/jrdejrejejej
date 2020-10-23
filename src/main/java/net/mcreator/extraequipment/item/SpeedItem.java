
package net.mcreator.extraequipment.item;

@ExtraEquipmentModElements.ModElement.Tag
public class SpeedItem extends ExtraEquipmentModElements.ModElement {

	@ObjectHolder("extra_equipment:speed")
	public static final Item block = null;

	public SpeedItem(ExtraEquipmentModElements instance) {
		super(instance, 17);
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
