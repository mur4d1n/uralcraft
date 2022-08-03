package com.mur4d1n.uralcraft.init;

import com.mur4d1n.uralcraft.util.ModItemTier;
import com.mur4d1n.uralcraft.util.ModSound;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.mur4d1n.uralcraft.UralCraft.MODID;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final UralCraftCreativeTab instance = new UralCraftCreativeTab(CreativeModeTab.TABS.length, MODID);
    public static final RegistryObject<Item> DRAGON_SLAYER = ITEMS.register("dragon_slayer", () -> new SwordItem(ModItemTier.GATTSU, 3, -2.4F, new Item.Properties().rarity(Rarity.EPIC).fireResistant().tab(instance)));

    public static final RegistryObject<Item> SPORT_GLASSES_DISC = ITEMS.register("sport_glasses_disc",
            () -> new RecordItem(4, ModSound.SPORT_GLASSES,
                    new Item.Properties().tab(instance).stacksTo(1)));
    public static class UralCraftCreativeTab extends CreativeModeTab {
        private UralCraftCreativeTab(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(DRAGON_SLAYER.get());
        }
    }


}