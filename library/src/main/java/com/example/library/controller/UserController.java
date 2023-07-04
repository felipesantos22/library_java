package com.example.library.controller;
import com.example.library.dto.UsuarioDto;
import com.example.library.entity.Usuario;
import com.example.library.service.UserService;
import org.springframework.http.ResponseEntity;
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
    public UsuarioDto createUserController(@RequestBody Usuario usuario) {
        return userService.createUserService(usuario);
    }

    @GetMapping
    public List<UsuarioDto> readUserController(){
        return userService.readUserService();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> findById(@PathVariable int id){
        return userService.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }



}
