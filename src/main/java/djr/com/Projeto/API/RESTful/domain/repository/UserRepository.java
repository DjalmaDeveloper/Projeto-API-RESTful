package djr.com.Projeto.API.RESTful.domain.repository;

import djr.com.Projeto.API.RESTful.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
