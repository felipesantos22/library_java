package com.example.library.dto;

import com.example.library.entity.Usuario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {

    private String name;
    private Usuario usuario;

}
