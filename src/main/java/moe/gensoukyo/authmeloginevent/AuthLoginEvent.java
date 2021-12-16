package moe.gensoukyo.authmeloginevent;

import net.minecraftforge.fml.common.eventhandler.Event;
import noppes.npcs.api.NpcAPI;
import noppes.npcs.api.entity.IEntity;
import org.bukkit.entity.Entity;
import moe.gensoukyo.scriptap.EntityTransformer;

public class AuthLoginEvent extends Event{
    public final IEntity<?> player;
    public AuthLoginEvent(Entity player){
        this.player = transformEntity(player);
    }
    private IEntity<?> transformEntity(Entity entity) {
        return NpcAPI.Instance().getIEntity(EntityTransformer.transform(entity));
    }
}
