package com.example.library.controller;
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
    public Book createBookController(@RequestBody Book book) {
        return bookService.createBookService(book);
    }

    @GetMapping
    public List<Book> readBookService(){
        return bookService.readBookService();
    }

}
