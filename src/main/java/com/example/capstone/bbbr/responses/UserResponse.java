package com.example.capstone.bbbr.responses;

import com.example.capstone.bbbr.entities.Favorites;
import com.example.capstone.bbbr.entities.User;
import com.example.capstone.bbbr.requests.UserRequest;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class UserResponse {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private List<Favorites> favorites;

    public UserResponse(User user){
        if (user.getFirstName()!=null)this.firstName = user.getFirstName();
        if (user.getLastName()!=null)this.lastName = user.getLastName();
        if (user.getEmail()!=null)this.email = user.getEmail();
        if (user.getFavorites()!=null)this.favorites = user.getFavorites();
    }

    public UserResponse(UserRequest user){
        if (user.getFirstName()!=null)this.firstName = user.getFirstName();
        if (user.getLastName()!=null)this.lastName = user.getLastName();
        if (user.getEmail()!=null)this.email = user.getEmail();
    }
}