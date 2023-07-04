package com.example.library.controller;
import com.example.library.dto.UsuarioDTO;
import com.example.library.entity.Usuario;
import com.example.library.service.UserService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public UsuarioDTO createUserController(@RequestBody Usuario usuario) {
        return userService.createUserService(usuario);
    }

    @GetMapping
    public List<UsuarioDTO> readUserController(){
        return userService.readUserService();
    }



}
