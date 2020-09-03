package de.wernersbacher.webdemo.api;

import de.wernersbacher.webdemo.model.User;
import de.wernersbacher.webdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/user")
@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @GetMapping
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping(path = "{id}")
    public User getPersonById(@PathVariable("id") UUID id) {
        return userService.getUserById(id).orElse(null);
    }

}
