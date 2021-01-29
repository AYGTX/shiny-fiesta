package com.gameamq.dto;

import java.util.ArrayList;
import java.util.List;

public class MessageStorage {
    private List<Question> questions = new ArrayList<Question>();

    public void add(Question question) {
        questions.add(question);
    }
    public void clear() {
        questions.clear();
    }

    public List<Question> getAll() {
        return questions;
    }
}
