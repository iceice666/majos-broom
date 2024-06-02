package net.iceice666.majosbroom

import net.iceice666.majosbroom.MajosBroom.MODID
import net.minecraft.text.Text
import net.minecraft.util.Identifier

object Utils {

    fun getTranslatableKey(identifier: String): Text {
        return Text.translatable("$MODID.$identifier")
    }

    fun getIdentifier (identifier: String) : Identifier {
        return Identifier(MODID , identifier)
    }
}