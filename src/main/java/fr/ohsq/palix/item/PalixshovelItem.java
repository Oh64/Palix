
package fr.ohsq.palix.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import fr.ohsq.palix.itemgroup.PalixongletItemGroup;
import fr.ohsq.palix.PalixModElements;

@PalixModElements.ModElement.Tag
public class PalixshovelItem extends PalixModElements.ModElement {
	@ObjectHolder("palix:palix_shovel")
	public static final Item block = null;

	public PalixshovelItem(PalixModElements instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 2550;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -2f, new Item.Properties().group(PalixongletItemGroup.tab)) {
		}.setRegistryName("palix_shovel"));
	}
}
