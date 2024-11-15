package in.pavanreddy.samplespringpro.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import in.pavanreddy.samplespringpro.entity.User;

@Service
public class UserService {
    
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            User user = new User();
            long userID = i;
            user.setUserID(userID);
            user.setUserName("User" + i);
            user.setEmail("user" + i + "@example.com");
            users.add(user);
        }
        
        return users;
    }
}
