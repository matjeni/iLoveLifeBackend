/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ilovelife.dto;

import com.ilovelife.data.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author CodeTribe1
 */
public class UserDTO {
    private Integer userID;
    private String userName;
    private String email;
    private int phone;
    private String image;
    private String gender;
    private int age;
    private Date registeredDate;
    private String password;
    private String status;
    private List<LeaderboardDTO> leaderboardList = new ArrayList<>();
    
    public UserDTO()
    {
        
    }
    
    public UserDTO(User u)
    {
        this.age = u.getAge();
        this.email = u.getEmail();
        this.gender = u.getGender();
        this.password = u.getPassword();
        this.phone = u.getPhone();
        this.registeredDate = u.getRegisteredDate();
        this.status = u.getStatus();
        this.userName = u.getUserName();
        this.userID = u.getUserID();
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<LeaderboardDTO> getLeaderboardList() {
        return leaderboardList;
    }

    public void setLeaderboardList(List<LeaderboardDTO> leaderboardList) {
        this.leaderboardList = leaderboardList;
    }


    
}
