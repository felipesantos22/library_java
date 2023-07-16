package com.example.library.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDto {
    private String name;
    private List<BookDto> books = new ArrayList<>();
}
