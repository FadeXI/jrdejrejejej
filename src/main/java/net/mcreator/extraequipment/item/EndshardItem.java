
package net.mcreator.extraequipment.item;

@ExtraEquipmentModElements.ModElement.Tag
public class EndshardItem extends ExtraEquipmentModElements.ModElement {

	@ObjectHolder("extra_equipment:endshard")
	public static final Item block = null;

	public EndshardItem(ExtraEquipmentModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ExtraequipmentItemGroup.tab).maxStackSize(64));
			setRegistryName("endshard");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

	}

}
