/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ilovelife.data;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author CodeTribe1
 */
@Entity
@Table(name = "leaderboard")
@NamedQueries({
    @NamedQuery(name = "Leaderboard.findAll", query = "SELECT l FROM Leaderboard l"),
    @NamedQuery(name = "Leaderboard.findByLeaderID", query = "SELECT l FROM Leaderboard l WHERE l.leaderID = :leaderID"),
    @NamedQuery(name = "Leaderboard.findByPoint", query = "SELECT l FROM Leaderboard l WHERE l.point = :point"),
    @NamedQuery(name = "Leaderboard.findByReward", query = "SELECT l FROM Leaderboard l WHERE l.reward = :reward")})
public class Leaderboard implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "leaderID")
    private Integer leaderID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "point")
    private int point;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "reward")
    private String reward;
    @JoinColumn(name = "userID", referencedColumnName = "userID")
    @ManyToOne(optional = false)
    private User user;

    public Leaderboard() {
    }

    public Leaderboard(Integer leaderID) {
        this.leaderID = leaderID;
    }

    public Leaderboard(Integer leaderID, int point, String reward) {
        this.leaderID = leaderID;
        this.point = point;
        this.reward = reward;
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


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (leaderID != null ? leaderID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Leaderboard)) {
            return false;
        }
        Leaderboard other = (Leaderboard) object;
        if ((this.leaderID == null && other.leaderID != null) || (this.leaderID != null && !this.leaderID.equals(other.leaderID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ilovelife.data.Leaderboard[ leaderID=" + leaderID + " ]";
    }
    
}
