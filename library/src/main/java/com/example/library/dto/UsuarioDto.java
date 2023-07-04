package com.example.library.dto;
import com.example.library.entity.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDto {
    private int id;
    private String name;
    private String email;
    private List<Book> books = new ArrayList<>();
}
