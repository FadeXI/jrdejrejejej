
package net.mcreator.extraequipment.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.extraequipment.itemgroup.ExtraequipmentItemGroup;
import net.mcreator.extraequipment.ExtraEquipmentModElements;

@ExtraEquipmentModElements.ModElement.Tag
public class TitaniumpickaxeItem extends ExtraEquipmentModElements.ModElement {
	@ObjectHolder("extra_equipment:titaniumpickaxe")
	public static final Item block = null;
	public TitaniumpickaxeItem(ExtraEquipmentModElements instance) {
		super(instance, 30);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 11f;
			}

			public float getAttackDamage() {
				return 5f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 7;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(TitaniumingotItem.block, (int) (1)));
			}
		}, 1, -3.2f, new Item.Properties().group(ExtraequipmentItemGroup.tab)) {
		}.setRegistryName("titaniumpickaxe"));
	}
}
