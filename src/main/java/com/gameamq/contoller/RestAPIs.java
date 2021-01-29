package com.gameamq.contoller;

import java.util.ArrayList;
import java.util.List;

import com.gameamq.jms.producer.JmsProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gameamq.dto.MessageStorage;
import com.gameamq.dto.Question;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class RestAPIs {

    @Autowired
    JmsProducer jmsProducer;

    @Autowired
    private MessageStorage questionStorage;

    @RequestMapping(value = "/api/question", method = RequestMethod.POST)
    public Question postQuestion(@RequestBody Question question){
        questionStorage.clear();
        question.setCorrect("Pending");
        question.setAnswerBy("Unknown");
        jmsProducer.send(question);
        return question;
    }

    @RequestMapping(value = "/api/questions", method = RequestMethod.GET)
    public List<Question> getAll(){
        List<Question> questions = new ArrayList<Question>(questionStorage.getAll());
//        questionStorage.clear();
        return questions;
    }
    @RequestMapping(value = "/api/questions", method = RequestMethod.DELETE)
    public String clearAll(){
        questionStorage.clear();
        return "success clear";
    }
    @PutMapping(value="/api/questions")
    public Question putQuestion(@RequestBody Question question){
    if (question.getQuestionId()==null){
    }
    else
        question.setCorrect("true");
        questionStorage.clear();
        jmsProducer.send(question);

        return question;
    }
}