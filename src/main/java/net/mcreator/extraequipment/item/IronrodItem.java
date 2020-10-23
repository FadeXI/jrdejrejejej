
package net.mcreator.extraequipment.item;

@ExtraEquipmentModElements.ModElement.Tag
public class IronrodItem extends ExtraEquipmentModElements.ModElement {

	@ObjectHolder("extra_equipment:ironrod")
	public static final Item block = null;

	public IronrodItem(ExtraEquipmentModElements instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ExtraequipmentItemGroup.tab).maxStackSize(64));
			setRegistryName("ironrod");
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
