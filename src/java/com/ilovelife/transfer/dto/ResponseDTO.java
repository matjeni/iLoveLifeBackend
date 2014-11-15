/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ilovelife.transfer.dto;

import com.ilovelife.dto.LeaderboardDTO;
import com.ilovelife.dto.QuestionDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CodeTribe1
 */
public class ResponseDTO {
    
    private Integer statusCode;
    private String message, sessionID, GCMRegistrationID;
    
    private List<QuestionDTO> questionList = new ArrayList<>();
    private List<LeaderboardDTO> leaderboardList = new ArrayList<>();

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public String getGCMRegistrationID() {
        return GCMRegistrationID;
    }

    public void setGCMRegistrationID(String GCMRegistrationID) {
        this.GCMRegistrationID = GCMRegistrationID;
    }

    public List<QuestionDTO> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<QuestionDTO> questionList) {
        this.questionList = questionList;
    }

    public List<LeaderboardDTO> getLeaderboardList() {
        return leaderboardList;
    }

    public void setLeaderboardList(List<LeaderboardDTO> leaderboardList) {
        this.leaderboardList = leaderboardList;
    }
    
    
    
}
