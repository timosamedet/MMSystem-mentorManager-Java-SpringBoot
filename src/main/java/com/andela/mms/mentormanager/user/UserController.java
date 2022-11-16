package com.andela.mms.mentormanager.user;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Timosamedet
 * @since Nov 16, 2022 4:55:34 AM
 */
@RestController
@RequestMapping("/mentors-manager/user")
public class UserController
{

    @Autowired
    private UserService userService;

    @RequestMapping("/create-user")
    public User createUser(@RequestBody User user)
    {
        return userService.createUser(user);
    }

    @RequestMapping("/users-list")
    public List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }

    @RequestMapping("/{id}")
    public User getUserById(@PathVariable("id") Integer id)
    {
        return userService.getUserById(id);
    }

}
