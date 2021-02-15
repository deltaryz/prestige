package com.deltaryz.prestige

import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import org.apache.logging.log4j.Level
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

class Prestige : ModInitializer {

    private val logger: Logger = LogManager.getLogger()

    // while minecraft/fabric is starting
    override fun onInitialize() {
        log(Level.INFO, "* * * Prestige is initializing... * * *")

        val testItem = TestItem(FabricItemSettings().group(ItemGroup.MISC).maxCount(1024))
        Registry.register(Registry.ITEM, Identifier("prestige", "test_item"), testItem)

    }

    // output log message to console
    @Suppress("SameParameterValue")
    private fun log(
        level: Level,
        message: String
    ) {
        logger.log(level, "[Prestige] $message")
    }

}