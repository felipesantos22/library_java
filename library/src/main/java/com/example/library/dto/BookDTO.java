package com.example.library.dto;
import com.example.library.entity.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {
    private int id;
    private String name;

    public BookDTO(Book book) {
        this.id = book.getId();
        this.name = book.getName();
    }
}
