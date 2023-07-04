package com.example.library.controller;
import com.example.library.dto.BookDto;
import com.example.library.entity.Book;
import com.example.library.service.BookService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/book")
public class BookController {
    private final BookService bookService;
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @PostMapping
    public BookDto createBookController(@RequestBody Book book) {
        return bookService.createBookService(book);
    }

    @GetMapping
    public List<BookDto> readBookService(){
        return bookService.readBookService();
    }

}
