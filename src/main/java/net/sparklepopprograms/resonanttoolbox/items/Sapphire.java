package net.sparklepopprograms.resonanttoolbox.items;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.sparklepopprograms.resonanttoolbox.ResonantToolbox;
import net.sparklepopprograms.resonanttoolbox.util.ResonantToolboxTab;

public class Sapphire extends Item {
	
	public Sapphire() {
		super();
		this.setTextureName(ResonantToolbox.modid + ":Sapphire");
		this.setUnlocalizedName("Sapphire");
		this.setCreativeTab(ResonantToolboxTab.tab);
		this.setHasSubtypes(true);
	}

	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
	    for (int i = 0; i < 2; i ++) {
	        list.add(new ItemStack(item, 1, i));
	    }
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
	    return this.getUnlocalizedName() + "_" + stack.getItemDamage();
	}

	@Override
	public boolean hasEffect(ItemStack item, int meta) {
		if (item.getItemDamage() == 1) {
			return true;
		} else {
			return false;
		}
	}

}