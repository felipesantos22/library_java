package com.example.library.dto;
import lombok.Data;

@Data
public class UsuarioDTO {
    private int id;
    private String name;
    private String email;

    public UsuarioDTO(int id, String name, String email) {
        this.name = name;
        this.email = email;
    }
}
