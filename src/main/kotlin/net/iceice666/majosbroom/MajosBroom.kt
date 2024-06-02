package net.iceice666.majosbroom

import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.iceice666.majosbroom.ItemRegistry.MAJO_CLOTH
import net.iceice666.majosbroom.ItemRegistry.MAJO_HAT
import net.iceice666.majosbroom.ItemRegistry.MAJO_SHOES
import net.iceice666.majosbroom.ItemRegistry.MAJO_STOCKING
import net.iceice666.majosbroom.Utils.getIdentifier
import net.iceice666.majosbroom.Utils.getTranslatableKey
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import org.slf4j.LoggerFactory


object MajosBroom : ModInitializer {

    const val MODID = "majos-broom"

    private val logger = LoggerFactory.getLogger(MODID)


    @JvmStatic
    private val ITEM_GROUP: RegistryKey<ItemGroup> = RegistryKey.of(
        RegistryKeys.ITEM_GROUP,
        getIdentifier("item_group")
    )

    override fun onInitialize() {
        Registry.register(
            Registries.ITEM_GROUP,
            ITEM_GROUP,
            FabricItemGroup.builder()
                .displayName(getTranslatableKey("item_group"))
                .icon { ItemStack(MAJO_HAT) }
                .entries { _, entries ->
                    entries.add(MAJO_HAT)
                    entries.add(MAJO_CLOTH)
                    entries.add(MAJO_STOCKING)
                    entries.add(MAJO_SHOES)
                }
                .build()
        )

        ItemRegistry.register()



    }
}