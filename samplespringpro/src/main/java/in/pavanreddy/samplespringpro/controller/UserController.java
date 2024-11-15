package in.pavanreddy.samplespringpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.pavanreddy.samplespringpro.entity.User;
import in.pavanreddy.samplespringpro.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService userService;
    @GetMapping("/users")
    public ResponseEntity<List<User>> fetchUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }
}