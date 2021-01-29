package com.gameamq.jms.producer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.gameamq.dto.MessageStorage;
import com.gameamq.dto.Question;

@Component
public class JmsConsumer {
    @Autowired
    private MessageStorage questionStorage;

    @JmsListener(destination = "${activemq.queue}", containerFactory="jsaFactory")
    public void receive(Question question){
        questionStorage.add(question);
    }
}