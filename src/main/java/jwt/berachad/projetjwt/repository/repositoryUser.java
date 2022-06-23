package jwt.berachad.projetjwt.repository;

import jwt.berachad.projetjwt.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  repositoryUser extends JpaRepository<Users, Long> {
}
