package net.iceice666.majosbroom

import net.iceice666.majosbroom.Utils.getIdentifier
import net.iceice666.majosbroom.armor.MajoArmorMaterial
import net.minecraft.item.ArmorItem
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry


object ItemRegistry {



    @JvmStatic
    val MAJO_HAT: Item = ArmorItem(MajoArmorMaterial, ArmorItem.Type.HELMET, Item.Settings())
    @JvmStatic
    val MAJO_CLOTH: Item = ArmorItem(MajoArmorMaterial, ArmorItem.Type.CHESTPLATE, Item.Settings())
    @JvmStatic
    val MAJO_STOCKING: Item = ArmorItem(MajoArmorMaterial, ArmorItem.Type.LEGGINGS, Item.Settings())
    @JvmStatic
    val MAJO_SHOES: Item = ArmorItem(MajoArmorMaterial, ArmorItem.Type.BOOTS, Item.Settings())


    fun register() {
        Registry.register(Registries.ITEM, getIdentifier("majo_hat"), MAJO_HAT )
        Registry.register(Registries.ITEM, getIdentifier("majo_cloth"), MAJO_CLOTH )
        Registry.register(Registries.ITEM, getIdentifier("majo_stocking"), MAJO_STOCKING )
        Registry.register(Registries.ITEM, getIdentifier("majo_shoes"), MAJO_SHOES )
    }
}
