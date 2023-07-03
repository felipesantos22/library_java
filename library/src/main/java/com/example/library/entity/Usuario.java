package com.example.library.entity;
import com.example.library.dto.UsuarioDTO;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;
@Entity
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @OneToMany(mappedBy = "usuario")
    private List<Book> books;
    public Usuario() {
    }
    public Usuario(String name, String email) {
    }
    public Usuario(int id, String name, String email, List<Book> books) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.books = books;
    }
    public UsuarioDTO obterUsuarioDto(){
        return new UsuarioDTO(this.id,this.name, this.email);
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}

