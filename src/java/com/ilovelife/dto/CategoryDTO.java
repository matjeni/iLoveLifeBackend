/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ilovelife.dto;

import com.ilovelife.data.Category;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author CodeTribe1
 */
public class CategoryDTO {
    private Integer catID;
    private String categoryName;
    private Date categoryDate;
    private int status;
    private List<QuestionDTO> questionList = new ArrayList<>();
    
    public CategoryDTO(){
        
    }
    public CategoryDTO(Category c){
        this.catID = c.getCatID();
        this.categoryDate = c.getCategoryDate();
        this.categoryName = c.getCategoryName();
        this.status = c.getStatus();
        
    }

    public Integer getCatID() {
        return catID;
    }

    public void setCatID(Integer catID) {
        this.catID = catID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Date getCategoryDate() {
        return categoryDate;
    }

    public void setCategoryDate(Date categoryDate) {
        this.categoryDate = categoryDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<QuestionDTO> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<QuestionDTO> questionList) {
        this.questionList = questionList;
    }
    
    
}
