package com.example.library.controller;

;
import com.example.library.dto.UsuarioDto;
import com.example.library.entity.Usuario;
import com.example.library.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    private final ModelMapper modelMapper;

    public UserController(UserService userService, ModelMapper modelMapper) {
        this.userService = userService;
        this.modelMapper = modelMapper;
    }

    @PostMapping
    public UsuarioDto createUserController(@RequestBody Usuario user) {
        Usuario usuario = userService.createUserService(user);
        return modelMapper.map(usuario, UsuarioDto.class);
    }

 /* @GetMapping
  public List<UsuarioDto> readUserController() {
    List<Usuario> usuario = userService.readUserService();
    return usuario.stream().map(record -> modelMapper.map(record, UsuarioDto.class)).collect(Collectors.toList());
  }*/

    @GetMapping
    public List<Usuario> readUserController() {
        try {
            return userService.readUserService();
        } catch (Exception e) {
            return null;
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> findById(@PathVariable int id) {
        return userService.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public Optional<Usuario> updateController(@PathVariable int id, @RequestBody Usuario usuario) {
        return userService.updateService(id, usuario);
    }

    @DeleteMapping("/{id}")
    public Optional<Usuario> deleteController(@PathVariable int id) {
        return userService.deleteService(id);
    }
}
