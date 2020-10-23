
package net.mcreator.extraequipment.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.extraequipment.itemgroup.ExtraequipmentItemGroup;
import net.mcreator.extraequipment.ExtraEquipmentModElements;

import java.util.List;

import com.google.common.collect.Multimap;

@ExtraEquipmentModElements.ModElement.Tag
public class TitaniumwaraxeItem extends ExtraEquipmentModElements.ModElement {
	@ObjectHolder("extra_equipment:titaniumwaraxe")
	public static final Item block = null;
	public TitaniumwaraxeItem(ExtraEquipmentModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemToolCustom() {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("The axe of the ancient kingdoms of Azshura"));
			}
		}.setRegistryName("titaniumwaraxe"));
	}
	private static class ItemToolCustom extends Item {
		protected ItemToolCustom() {
			super(new Item.Properties().group(ExtraequipmentItemGroup.tab).maxDamage(4565));
		}

		@Override
		public float getDestroySpeed(ItemStack itemstack, BlockState blockstate) {
			if (blockstate.getBlock() == Blocks.OAK_LOG.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.OAK_LOG.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.SPRUCE_LOG.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.BIRCH_LOG.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.JUNGLE_LOG.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.ACACIA_LOG.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.ACACIA_LOG.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.DARK_OAK_LOG.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.STRIPPED_OAK_LOG.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.STRIPPED_SPRUCE_LOG.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.STRIPPED_BIRCH_LOG.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.STRIPPED_BIRCH_LOG.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.STRIPPED_JUNGLE_LOG.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.STRIPPED_BIRCH_WOOD.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.STRIPPED_DARK_OAK_LOG.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.OAK_WOOD.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.SPRUCE_WOOD.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.BIRCH_WOOD.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.JUNGLE_WOOD.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.ACACIA_WOOD.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.DARK_OAK_WOOD.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.STRIPPED_OAK_WOOD.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.STRIPPED_SPRUCE_WOOD.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.STRIPPED_BIRCH_WOOD.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.STRIPPED_JUNGLE_WOOD.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.OAK_WOOD.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.STRIPPED_ACACIA_WOOD.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.STRIPPED_DARK_OAK_WOOD.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.CHEST.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.TRAPPED_CHEST.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.PISTON.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.STICKY_PISTON.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.PISTON_HEAD.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.MOVING_PISTON.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.CRAFTING_TABLE.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.OAK_SIGN.getDefaultState().getBlock())
				return 20f;
			if (blockstate.getBlock() == Blocks.BIRCH_SIGN.getDefaultState().getBlock())
				return 20f;
			return 1;
		}

		@Override
		public boolean onBlockDestroyed(ItemStack stack, World worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving) {
			stack.damageItem(1, entityLiving, i -> i.sendBreakAnimation(EquipmentSlotType.MAINHAND));
			return true;
		}

		@Override
		public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
			stack.damageItem(2, attacker, i -> i.sendBreakAnimation(EquipmentSlotType.MAINHAND));
			return true;
		}

		@Override
		public int getItemEnchantability() {
			return 8;
		}

		@Override
		public Multimap<String, AttributeModifier> getAttributeModifiers(EquipmentSlotType equipmentSlot) {
			Multimap<String, AttributeModifier> multimap = super.getAttributeModifiers(equipmentSlot);
			if (equipmentSlot == EquipmentSlotType.MAINHAND) {
				multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(),
						new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Tool modifier", 7.1f, AttributeModifier.Operation.ADDITION));
				multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(),
						new AttributeModifier(ATTACK_SPEED_MODIFIER, "Tool modifier", -3.2, AttributeModifier.Operation.ADDITION));
			}
			return multimap;
		}
	}
}
