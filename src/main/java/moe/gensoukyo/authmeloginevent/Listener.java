package moe.gensoukyo.authmeloginevent;

import fr.xephi.authme.events.LoginEvent;
import org.bukkit.event.EventHandler;
import noppes.npcs.controllers.ScriptController;

public class Listener implements org.bukkit.event.Listener {
    @EventHandler
    public void onPlayerJoin(LoginEvent e){
        AuthLoginEvent event = new AuthLoginEvent(e.getPlayer());
        ScriptController.Instance.forgeScripts.runScript(
            "authMeLogin",event
        );
    }
}
