package me.zircta.blocksgg.events;

import club.maxstats.weave.loader.api.event.ChatReceivedEvent;
import club.maxstats.weave.loader.api.event.SubscribeEvent;
import net.minecraft.client.Minecraft;
public class ChatEvent {
    @SubscribeEvent
    public void onChatReceived(ChatReceivedEvent event) {
        String message = event.getMessage().getUnformattedText();
        if (message.contains("You earned") && message.contains("You now have")) {
            Minecraft.getMinecraft().thePlayer.sendChatMessage("gg");
        }
    }
}
