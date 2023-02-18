package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    List<User> list = List.of(
            new User(1311L, "Dharm Kakadiya", "647 894 2798"),
            new User(1312L, "kevin Barvaliya", "647 989 6562"),
            new User(1314L, "Vishal Barvaliya", "647 893 2797")
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }


}
