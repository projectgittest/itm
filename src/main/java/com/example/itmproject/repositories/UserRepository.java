package com.example.itmproject.repositories;


//import com.example.itmproject.entities.Type;
import com.example.itmproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Query("select u from User u ")
    List<User>findAll();

    @Query("select u from User u where u.user_id=?1")
    User findAllById(@Param("id")Long user_id);


    //@Query("select u from User u where u.type=?1")
    //List<User>findAllByType(@Param("type")Type type);

    //List<User> findAllByFirst_nameAndLast_name(String firstName, String lastName);

    @Query("select  u from User u where u.username=:username")
     User getUserByUsername(@Param("username")String username);
}
