package com.wenda.service;

import com.wenda.Utils.StringUtils;
import com.wenda.dao.UserDao;
import com.wenda.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 49540 on 2017/6/26.
 */
@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User getUser(int id)
    {
        return userDao.selectById(id);
    }

    public Map register(String name,String password)
    {
        Map<String,String> map = new HashMap<>();

        return map;
    }
}
