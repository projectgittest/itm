package com.example.itmproject.controller;

import com.example.itmproject.dto.UserDto;
//import com.example.itmproject.entities.Type;
import com.example.itmproject.entities.User;
import com.example.itmproject.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/registration")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService=userService;
    }

    @GetMapping("/users/findAll")
    public ResponseEntity<List<User>>findAll(){
        return ResponseEntity.ok(userService.findAll());
    }


    @GetMapping("/users/id")
    public ResponseEntity<User>findAllById(@RequestParam Long  user_id){
        return ResponseEntity.ok(userService.findAllById(user_id));
    }

    /*@GetMapping("/users/allusers")
    public ResponseEntity<List<User>>findAllByType(@RequestParam Type type){
        return ResponseEntity.ok(userService.findAllByType(type));
    }

     */

    @PostMapping("create")
    public ResponseEntity<UserDto>addItem(@RequestBody UserDto userDto){
        return ResponseEntity.ok(userService.save(userDto));
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUserById(@PathVariable Long user_id){
        userService.deleteUserById(user_id);
    }
}