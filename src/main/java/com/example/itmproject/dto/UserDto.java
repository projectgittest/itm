package com.example.itmproject.dto;

//import com.example.itmproject.entities.Type;
import com.example.itmproject.entities.User;

public class UserDto {

    private String username;

   // private String first_name;
   // private String last_name;
    //private String email;
    private String password;

    private boolean enabled;

   // private String type;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }




   /* public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    */

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /*public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

     */

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public static UserDto toDto(User user){
        UserDto dto=new UserDto();
        dto.setUsername(user.getUsername());
        //dto.setFirst_name(user.getFirst_name());
        //dto.setLast_name(user.getLast_name());
        //dto.setEmail(user.getEmail());
        dto.setPassword(user.getPassword());
      //  dto.setType(user.getType().name());
        dto.setEnabled(user.isEnabled());

        return dto;
    }


    public static User toEntity(UserDto userDto){
        User entity=new User();
        entity.setUsername(userDto.getUsername());
     //   entity.setFirst_name(userDto.getFirst_name());
     //   entity.setLast_name(userDto.getLast_name());
     //   entity.setEmail(userDto.getEmail());
        entity.setPassword(userDto.getPassword());
      // entity.setType(Type.toEnum(userDto.getType()));
        entity.setEnabled(userDto.isEnabled());

        return entity;
    }
}
