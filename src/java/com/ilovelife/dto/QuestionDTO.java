/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ilovelife.dto;

import com.ilovelife.data.Category;
import com.ilovelife.data.Question;
import java.util.Date;

/**
 *
 * @author CodeTribe1
 */
public class QuestionDTO {
    private Integer questionID;
    private String question;
    private String correct;
    private int point;
    private Date date;
    private String status;
    private Category cat;
    
    public QuestionDTO(){
        
    }
    
    public QuestionDTO(Question q){
        this.cat = q.getCat();
        this.correct = q.getCorrect();
        this.date = q.getDate();
        this.question = q.getQuestion();
        this.questionID = q.getQuestionID();
        this.status = q.getStatus();
        Category cat = new Category();
        
    }

    public Integer getQuestionID() {
        return questionID;
    }

    public void setQuestionID(Integer questionID) {
        this.questionID = questionID;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Category getCat() {
        return cat;
    }

    public void setCat(Category cat) {
        this.cat = cat;
    }
    
    
    
}
