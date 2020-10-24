
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
				return 2000;
			}

			public float getEfficiency() {
				return 8.5f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(TitaniumingotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ExtraequipmentItemGroup.tab)) {
		}.setRegistryName("titaniumpickaxe"));
	}
}
