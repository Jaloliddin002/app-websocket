package com.dev.appwebsocket.conponent;

import lombok.RequiredArgsConstructor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@RequiredArgsConstructor
public class TestComponent {

    private final SimpMessagingTemplate messagingTemplate;

    @Scheduled(fixedRate = 5000L)
    public void getDate() {
        Date date = new Date();
        messagingTemplate.convertAndSend("/topic/date", date);


    }

}
