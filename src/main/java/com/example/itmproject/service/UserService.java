package com.example.itmproject.service;


//import com.example.itmproject.entities.Type;
import org.springframework.web.bind.annotation.PutMapping;
import java.util.Optional;



import com.example.itmproject.dto.UserDto;
import com.example.itmproject.entities.User;
import com.example.itmproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class UserService{

    @Autowired
    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    List<User> users = new ArrayList<>();

    public List<User> findAll() {
        users = userRepository.findAll();
        return users;
    }


   // List<User> users3 = new ArrayList<>();

    public User findAllById(Long user_id) {
        return  userRepository.findAllById(user_id);
    }


    public UserDto save(UserDto dto) {
        User userDto = userRepository.save(UserDto.toEntity(dto));

        return UserDto.toDto(userDto);
    }

    public void deleteUserById(Long user_id) {
        userRepository.deleteById(user_id);
    }

   // List<User> users2 = new ArrayList<>();

    /*public List<User> findAllByType(Type type) {
        users2 = userRepository.findAllByType(type);
        return users2;
    }
     */


}

