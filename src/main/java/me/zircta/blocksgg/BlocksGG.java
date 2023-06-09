package me.zircta.blocksgg;

import net.weavemc.loader.api.ModInitializer;
import net.weavemc.loader.api.event.EventBus;
import me.zircta.blocksgg.events.ChatEvent;

public class BlocksGG implements ModInitializer {
    @Override
    public void preInit() {
        System.out.println("BlocksGG | Initializing");

        EventBus.subscribe(new ChatEvent());
    }
}
