
package fr.ohsq.palix.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import java.util.List;

import fr.ohsq.palix.itemgroup.PalixongletItemGroup;
import fr.ohsq.palix.PalixModElements;

@PalixModElements.ModElement.Tag
public class PalixfragmentItem extends PalixModElements.ModElement {
	@ObjectHolder("palix:palix_fragment")
	public static final Item block = null;

	public PalixfragmentItem(PalixModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(PalixongletItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("palix_fragment");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
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

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Only the fragments are useful because otherwise how to have the best result ?"));
		}
	}
}
