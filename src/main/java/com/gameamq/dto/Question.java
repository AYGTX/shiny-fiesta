package com.gameamq.dto;

import java.io.Serializable;

public class Question implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String text;
    private String reply1;
    private String reply2;
    private String reply3;
    private String correctAnswer;
    private String answerBy;
    private String correct;

    public String getAnswerBy() {
        return answerBy;
    }

    public void setAnswerBy(String answerBy) {
        this.answerBy = answerBy;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }



    public String getQuestionId() {
        return id;
    }
    public void setQuestionId(String questionId) {
        this.id = questionId;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getReply1() {
        return reply1;
    }
    public void setReply1(String reply1) {
        this.reply1 = reply1;
    }
    public String getReply2() {
        return reply2;
    }
    public void setReply2(String reply2) {
        this.reply2 = reply2;
    }
    public String getReply3() {
        return reply3;
    }
    public void setReply3(String reply3) {
        this.reply3 = reply3;
    }
    public String getCorrectAnswer() {
        return correctAnswer;
    }
    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
