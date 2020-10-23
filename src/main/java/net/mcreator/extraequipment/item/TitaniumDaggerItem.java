
package net.mcreator.extraequipment.item;

@ExtraEquipmentModElements.ModElement.Tag
public class TitaniumDaggerItem extends ExtraEquipmentModElements.ModElement {

	@ObjectHolder("extra_equipment:titanium_dagger")
	public static final Item block = null;

	public TitaniumDaggerItem(ExtraEquipmentModElements instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 20000;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 1.5f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(TitaniumingotItem.block, (int) (1)));
			}
		}, 3, 17.8f, new Item.Properties().group(ExtraequipmentItemGroup.tab)) {

		}.setRegistryName("titanium_dagger"));
	}

}
