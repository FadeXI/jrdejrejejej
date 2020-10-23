
package net.mcreator.extraequipment.block;

import net.minecraft.block.material.Material;

@ExtraEquipmentModElements.ModElement.Tag
public class TungstenoreBlock extends ExtraEquipmentModElements.ModElement {

	@ObjectHolder("extra_equipment:tungstenore")
	public static final Block block = null;

	public TungstenoreBlock(ExtraEquipmentModElements instance) {
		super(instance, 9);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ExtraequipmentItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(5f, 1000f).lightValue(0).harvestLevel(3)
							.harvestTool(ToolType.PICKAXE));

			setRegistryName("tungstenore");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
