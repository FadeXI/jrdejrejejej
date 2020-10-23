
package net.mcreator.extraequipment.block;

import net.minecraft.block.material.Material;

@ExtraEquipmentModElements.ModElement.Tag
public class TungstenblockBlock extends ExtraEquipmentModElements.ModElement {

	@ObjectHolder("extra_equipment:tungstenblock")
	public static final Block block = null;

	public TungstenblockBlock(ExtraEquipmentModElements instance) {
		super(instance, 13);

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

					Block.Properties.create(Material.ROCK).sound(SoundType.METAL).hardnessAndResistance(2.5f, 1000f).lightValue(0));

			setRegistryName("tungstenblock");
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
