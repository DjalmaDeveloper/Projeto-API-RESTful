package djr.com.Projeto.API.RESTful.service;

import djr.com.Projeto.API.RESTful.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
