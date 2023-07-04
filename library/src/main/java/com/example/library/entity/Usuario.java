package com.example.library.entity;
import com.example.library.dto.UsuarioDTO;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "usuario")
    @JsonIgnore
    private List<Book> books = new ArrayList<>();
    public UsuarioDTO obterUsuarioDto(){
        return new UsuarioDTO(this.id,this.name, this.email, this.books);
    }
}

