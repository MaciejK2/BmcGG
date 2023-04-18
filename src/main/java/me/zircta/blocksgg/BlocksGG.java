package me.zircta.blocksgg;

import club.maxstats.weave.loader.api.ModInitializer;
import club.maxstats.weave.loader.api.event.EventBus;
import me.zircta.blocksgg.events.ChatEvent;

public class BlocksGG implements ModInitializer {
    @Override
    public void init() {
        System.out.println("BlocksGG | Initializing");

        EventBus.subscribe(new ChatEvent());
    }
}