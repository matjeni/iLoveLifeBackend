/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ilovelife.transfer.dto;

import com.ilovelife.dto.CategoryDTO;
import com.ilovelife.dto.LeaderboardDTO;
import com.ilovelife.dto.QuestionDTO;
import com.ilovelife.dto.UserDTO;

/**
 *
 * @author CodeTribe1
 */
public class RequestDTO {
    private Integer catID,leaderID,questionID,userID,requestType;
    
    private LeaderboardDTO leaderboard;
    private CategoryDTO category;
    private QuestionDTO question;
    private UserDTO user;
    
    public static final int
            ADD_USER = 1,
            ADD_QUESTION = 2,
            ADD_CATEGORY = 3,
            ADD_LEADERBOARD = 4;
    
    public static final int
            GET_ALL_USERS = 10,
            GET_ALL_QUESTION = 11,
            GET_ALL_CATEGORIES = 12,
            GET_ALL_LEADERBOARD = 13;

    public Integer getRequestType() {
        return requestType;
    }

    public void setRequestType(Integer requestType) {
        this.requestType = requestType;
    }
    
    public Integer getCatID() {
        return catID;
    }

    public void setCatID(Integer catID) {
        this.catID = catID;
    }

    public Integer getLeaderID() {
        return leaderID;
    }

    public void setLeaderID(Integer leaderID) {
        this.leaderID = leaderID;
    }

    public Integer getQuestionID() {
        return questionID;
    }

    public void setQuestionID(Integer questionID) {
        this.questionID = questionID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public LeaderboardDTO getLeaderboard() {
        return leaderboard;
    }

    public void setLeaderboard(LeaderboardDTO leaderboard) {
        this.leaderboard = leaderboard;
    }

    public CategoryDTO getCategory() {
        return category;
    }

    public void setCategory(CategoryDTO category) {
        this.category = category;
    }

    public QuestionDTO getQuestion() {
        return question;
    }

    public void setQuestion(QuestionDTO question) {
        this.question = question;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }
    
    
}
