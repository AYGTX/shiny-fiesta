package com.gameamq.jms.producer;

import com.gameamq.dto.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class JmsProducer {
    @Autowired
    JmsTemplate jmsTemplate;

    @Value("${activemq.queue}")
    String queue;

    public void send(Question question) {
        jmsTemplate.convertAndSend(queue, question);
    }
}
