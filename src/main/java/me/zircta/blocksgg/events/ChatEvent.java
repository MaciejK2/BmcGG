package me.zircta.blocksgg.events;

import club.maxstats.weave.loader.api.event.ChatReceivedEvent;
import club.maxstats.weave.loader.api.event.SubscribeEvent;
import net.minecraft.client.Minecraft;
public class ChatEvent {
    @SubscribeEvent
    public void onChatReceived(ChatReceivedEvent event) {
        String message = event.getMessage().getUnformattedText();
        if (message.startsWith("? BlocksMC ? You earned 15 tokens!")) {
            Minecraft.getMinecraft().thePlayer.sendChatMessage("gg");
        }
    }
}
