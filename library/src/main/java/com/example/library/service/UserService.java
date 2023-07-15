package com.example.library.service;
import com.example.library.entity.Usuario;
import com.example.library.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public Usuario createUserService(Usuario usuario) {
    return userRepository.save(usuario);
  }

  public List<Usuario> readUserService() {
    return userRepository.findAll();
  }

  public Optional<Usuario> findById(int id) {
    return userRepository.findById(id);
  }

  public Optional<Usuario> updateService(int id, Usuario usuario) {
    return userRepository.findById(id)
        .map(record -> {
          record.setName(usuario.getName());
          record.setEmail(usuario.getEmail());
          return userRepository.save(record);
        });
  }

  public Optional<Usuario> deleteService(int id) {
    return userRepository.findById(id)
        .map(record -> {
          userRepository.deleteById(id);
          return record;
        });
  }
}
