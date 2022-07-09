package com.example.hospital.rest;

import com.example.hospital.model.User;
import com.example.hospital.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping(path = "/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(path = "/create")
    public User create(@RequestBody User user) {
        user.setAccountValid(true);
        return this.userService.save(user);
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable String id) {
        this.userService.delete(id);
    }

    @GetMapping("")
    public List<User> getAll() {
        return this.userService.findAll();
    }

    @GetMapping("/details")
    public Principal getPrincipal(Principal principal){
        return principal;
    }
}
