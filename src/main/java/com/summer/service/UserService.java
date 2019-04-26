package com.summer.service;


import com.summer.pojo.User;

import java.util.List;

public interface UserService {
    List<User> getUser(String id);
}
