package com.example.library.service;

import com.example.library.dto.UsuarioDTO;
import com.example.library.entity.Usuario;
import com.example.library.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public UserService(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    public UsuarioDTO createUserService(Usuario usuario) {
        Usuario user = userRepository.save(usuario);
        return user.obterUsuarioDto();
    }

    public List<UsuarioDTO> readUserService() {
        return userRepository.findAll().stream().map(user -> modelMapper.map(user, UsuarioDTO.class)).collect(Collectors.toList());
    }
}
