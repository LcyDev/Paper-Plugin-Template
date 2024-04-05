package io.lcydev.template;

import io.lcydev.template.command.PingCommand
import io.lcydev.template.listener.JoinListener
import gg.flyte.twilight.twilight
import org.bukkit.plugin.java.JavaPlugin
import revxrsal.commands.bukkit.BukkitCommandHandler

class PluginTemplate : JavaPlugin() {

    companion object {
        lateinit var instance: PluginTemplate
    }

    override fun onLoad() {
        instance = this
    }


    override fun onEnable() {
        twilight(this) { }

        BukkitCommandHandler.create(this).apply {
            enableAdventure()
            register(PingCommand())
            registerBrigadier()
        }

        JoinListener()
    }
}