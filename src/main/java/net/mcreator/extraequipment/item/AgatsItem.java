
package net.mcreator.extraequipment.item;

@ExtraEquipmentModElements.ModElement.Tag
public class AgatsItem extends ExtraEquipmentModElements.ModElement {

	@ObjectHolder("extra_equipment:agats")
	public static final Item block = null;

	public AgatsItem(ExtraEquipmentModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {

		public MusicDiscItemCustom() {
			super(0, ExtraEquipmentModElements.sounds.get(new ResourceLocation("extra_equipment:secret")),
					new Item.Properties().group(ExtraequipmentItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("agats");
		}

	}

}
