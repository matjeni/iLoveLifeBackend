/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ilovelife.util;

import com.ilovelife.data.Category;
import com.ilovelife.data.Leaderboard;
import com.ilovelife.data.Question;
import com.ilovelife.data.User;
import com.ilovelife.dto.CategoryDTO;
import com.ilovelife.dto.LeaderboardDTO;
import com.ilovelife.dto.QuestionDTO;
import com.ilovelife.dto.UserDTO;
import com.ilovelife.transfer.dto.ResponseDTO;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author CodeTribe1
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class DataUtil {
    @PersistenceContext
    EntityManager em;
    
    public ResponseDTO addUser(UserDTO s) throws DataException{
        log.log(Level.OFF, "##########Attempting to register a user");
        ResponseDTO resp = new ResponseDTO();
       
     try {
          
           User us = new User();
           us.setUserID(s.getUserID());
           us.setEmail(s.getEmail());
           us.setAge(s.getAge());
           us.setGender(s.getGender());
           us.setImage(s.getImage());
           us.setUserName(s.getUserName());
           us.setStatus(s.getStatus());
           us.setRegisteredDate(s.getRegisteredDate());
           us.setPassword(s.getPassword());
           us.setPhone(s.getPhone());
           
           em.persist(us);
           em.flush();
           
           log.log(Level.OFF, "###########users added");

        } catch (Exception e) {
            log.log(Level.SEVERE, "##########Failed", e);
            
            resp.setStatusCode(301);
            resp.setMessage("Duplicate detected, request ignored./nPlease try again");
            
            throw new DataException("########Failed");
        }

        return resp;

    }
    
    public ResponseDTO addQuestion(QuestionDTO q)throws DataException{
        log.log(Level.OFF, "##########Attempting to add a question");
        ResponseDTO resp = new ResponseDTO();
        
           try {
               Question qs = new Question();
               qs.setCat(q.getCat());
               qs.setCorrect(q.getCorrect());
               qs.setDate(q.getDate());
               qs.setPoint(q.getPoint());
               qs.setQuestionID(q.getQuestionID());
               qs.setQuestion(q.getQuestion());
               
               em.persist(qs);
               em.flush();
           
           log.log(Level.OFF, "###########question added");

        } 
           catch (Exception e) {
           log.log(Level.SEVERE, "##########Failed", e);
            
           resp.setStatusCode(301);
           resp.setMessage("Duplicate detected, request ignored./nPlease try again");
            
            throw new DataException("########Failed");
        }

        return resp;
    }
    
    public ResponseDTO addCategory(CategoryDTO category)throws DataException{
        log.log(Level.OFF, "##########Attempting to add a category");
        ResponseDTO resp = new ResponseDTO();
        
        try{
             Category c = new Category();
             c.setCatID(category.getCatID());
             c.setCategoryDate(category.getCategoryDate());
             c.setCategoryName(category.getCategoryName());
             c.setStatus(category.getStatus());
             
             em.persist(c);
             em.flush();
           
           log.log(Level.OFF, "###########question category");

        } 
           catch (Exception e) {
           log.log(Level.SEVERE, "##########Failed", e);
            
           resp.setStatusCode(301);
           resp.setMessage("Duplicate detected, request ignored./nPlease try again");
            
            throw new DataException("########Failed");
        }

        return resp;
}
    public ResponseDTO addLeaderboard(LeaderboardDTO l)throws DataException{
         log.log(Level.OFF, "##########Attempting to add a category");
        ResponseDTO resp = new ResponseDTO();
        
        try{
            Leaderboard lb = new Leaderboard();
            lb.setLeaderID(l.getLeaderID());
            lb.setPoint(l.getPoint());
            lb.setReward(l.getReward());
            lb.setUser(l.getUser());
            
             em.persist(lb);
             em.flush();
           
           log.log(Level.OFF, "###########question category");

        } 
           catch (Exception e) {
           log.log(Level.SEVERE, "##########Failed", e);
            
           resp.setStatusCode(301);
           resp.setMessage("Duplicate detected, request ignored./nPlease try again");
            
            throw new DataException("########Failed");
        }

        return resp;
        
    }
    
        static final Logger log = Logger.getLogger(DataUtil.class.getSimpleName());
}
