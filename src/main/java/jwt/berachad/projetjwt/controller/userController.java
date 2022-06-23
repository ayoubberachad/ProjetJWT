package jwt.berachad.projetjwt.controller;

import jwt.berachad.projetjwt.entity.Users;
import jwt.berachad.projetjwt.repository.repositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class userController {
@Autowired
    repositoryUser repositoryUser;


    @RequestMapping({"/getUsers"})
    public List<Users> getFisrtMessage(){
        return repositoryUser.findAll();
    }


}
