package br.com.estudo.rest_springboot_application.service;

import br.com.estudo.rest_springboot_application.model.User;
import br.com.estudo.rest_springboot_application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder encoder;

    public void  createUser(User user){
        // obtem a senha
        String pass = user.getPassword();
        // criptografando antes de salvar no banco
        user.setPassword(encoder.encode(pass));
        repository.save(user);
    }

}
