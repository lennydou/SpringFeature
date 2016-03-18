package com.lennydou.service;

import com.lennydou.dao.ScoreDao;
import com.lennydou.dao.UserDao;

public class SchoolService {
    private UserDao userDao;
    private ScoreDao scoreDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public ScoreDao getScoreDao() {
        return scoreDao;
    }

    public void setScoreDao(ScoreDao scoreDao) {
        this.scoreDao = scoreDao;
    }
}
