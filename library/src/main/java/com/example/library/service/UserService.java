package com.example.library.service;

import com.example.library.dto.UsuarioDTO;
import com.example.library.entity.Usuario;
import com.example.library.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UsuarioDTO createUserService(Usuario usuario) {
        Usuario user = userRepository.save(usuario);
        return user.obterUsuarioDto();
    }

    public List<Usuario> readUserService() {
        return userRepository.findAll();

    }
}
