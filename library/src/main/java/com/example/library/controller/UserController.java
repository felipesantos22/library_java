package com.example.library.controller;
import com.example.library.entity.Usuario;
import com.example.library.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
   @PostMapping
    public Usuario createUserController(@RequestBody Usuario usuario) {
        return userService.createUserService(usuario);
    }
    @GetMapping
    public List<Usuario> readUserController(){
        return userService.readUserService();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> findById(@PathVariable int id){
        return userService.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
    @PutMapping("/{id}")
    public Optional<Usuario> updateController(@PathVariable int id, @RequestBody Usuario usuario){
        return userService.updateService(id, usuario);
    }
    @DeleteMapping("/{id}")
    public Optional<Usuario> deleteController(@PathVariable int id){
        return userService.deleteService(id);
    }
}
