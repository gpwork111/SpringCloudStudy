package com.crcc.ribbon.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by dell on 2019/7/11.
 */
@Service
public class UserService implements IUserService{

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String getUserByName(String userName){
        return restTemplate.getForObject("http://crcc-study-ribbon/user/getById?id="+userName,String.class);
    }

    @Override
    public String getUserById(String id) {
        return "id:"+id;
    }
}
