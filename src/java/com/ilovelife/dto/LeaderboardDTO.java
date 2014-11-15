/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ilovelife.dto;

import com.ilovelife.data.Leaderboard;
import com.ilovelife.data.User;

/**
 *
 * @author CodeTribe1
 */
public class LeaderboardDTO {
    private Integer leaderID;
    private int point;
    private String reward;
    private User user;
    
    public LeaderboardDTO(){
        
    }
     public LeaderboardDTO(Leaderboard lb){
         this.leaderID = lb.getLeaderID();
         this.point = lb.getLeaderID();
         this.reward = lb.getReward();
         this.user = new User();
        
    }

    public Integer getLeaderID() {
        return leaderID;
    }

    public void setLeaderID(Integer leaderID) {
        this.leaderID = leaderID;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
     
     
}
