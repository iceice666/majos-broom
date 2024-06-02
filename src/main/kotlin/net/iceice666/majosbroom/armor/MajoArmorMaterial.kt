package net.iceice666.majosbroom.armor

import net.minecraft.item.ArmorItem
import net.minecraft.item.ArmorMaterial
import net.minecraft.item.Items
import net.minecraft.recipe.Ingredient
import net.minecraft.sound.SoundEvent
import net.minecraft.sound.SoundEvents

object MajoArmorMaterial : ArmorMaterial {

    @JvmStatic
    val BASE_DURABILITY: IntArray = intArrayOf(13, 15, 16, 11)

    @JvmStatic
    val PROTECTION_VALUES: IntArray = intArrayOf(1, 2, 3, 1)

    override fun getDurability(type: ArmorItem.Type?): Int {
        if (type == null) return 10

        return BASE_DURABILITY[type.equipmentSlot.entitySlotId] * 10
    }

    override fun getProtection(type: ArmorItem.Type?): Int {
        if (type == null) return 1

        return PROTECTION_VALUES[type.equipmentSlot.entitySlotId]
    }

    override fun getEnchantability(): Int {
       return 15
    }

    override fun getEquipSound(): SoundEvent {
        return SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    }

    override fun getRepairIngredient(): Ingredient {
        return Ingredient.ofItems(Items.LEATHER)
    }

    override fun getName(): String {
        return "majo_armor"
    }

    override fun getToughness(): Float {
        return 0.0f
    }

    override fun getKnockbackResistance(): Float {
        return 0.0f
    }
}