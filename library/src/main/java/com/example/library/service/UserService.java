package com.example.library.service;

import com.example.library.dto.UsuarioDto;
import com.example.library.entity.Usuario;
import com.example.library.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public UserService(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    public UsuarioDto createUserService(Usuario usuario) {
        Usuario user = userRepository.save(usuario);
        return user.obterUsuarioDto();
    }
    public List<UsuarioDto> readUserService() {
        return userRepository.findAll()
                .stream()
                .map(user -> modelMapper.map(user, UsuarioDto.class))
                .collect(Collectors.toList());
    }

    public Optional<Usuario> findById(int id){
        return userRepository.findById(id);
    }
}
