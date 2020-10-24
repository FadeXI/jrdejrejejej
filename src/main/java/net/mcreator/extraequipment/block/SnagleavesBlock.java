
package net.mcreator.extraequipment.block;

import net.minecraft.block.material.Material;

@ExtraEquipmentModElements.ModElement.Tag
public class SnagleavesBlock extends ExtraEquipmentModElements.ModElement {

	@ObjectHolder("extra_equipment:snagleaves")
	public static final Block block = null;

	public SnagleavesBlock(ExtraEquipmentModElements instance) {
		super(instance, 34);

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

					Block.Properties.create(Material.LEAVES).sound(SoundType.PLANT).hardnessAndResistance(0f, 3f).lightValue(0));

			setRegistryName("snagleaves");
		}

		@Override
		public boolean propagatesSkylightDown(BlockState state, IBlockReader reader, BlockPos pos) {
			return true;
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
