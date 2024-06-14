package com.example.springapi.Service;


import com.example.springapi.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

      User user1 = new User(1,"Anna",22,"Male","anana@gmail.com","098753534");
      User user2 = new User(2,"Lili",23,"female","lili@gmail.com","09898654");
      User user3 = new User(3,"kaka",29,"female","kaka@gmail.com","09698609");

      userList.addAll(Arrays.asList(user1,user2,user3));
    }
    public Optional getUser(Integer id){
        Optional optional= Optional.empty();
        for(User user : userList){
            if(user.getId() == id){
                optional= Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
