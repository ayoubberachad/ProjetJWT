package jwt.berachad.projetjwt;

import jwt.berachad.projetjwt.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjetJwtApplication {
@Autowired
jwt.berachad.projetjwt.repository.repositoryUser repositoryUser;
    public static void main(String[] args) {
        SpringApplication.run(ProjetJwtApplication.class, args);
    }

    @Bean
    CommandLineRunner start() {
        return args -> {
             //   repositoryUser.save(new Users(2l,"mohamed","bader","BERACHAD","BER123",30));
            };
        }
}
