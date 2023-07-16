package com.example.library.controller;

import com.example.library.dto.BookDto;
import com.example.library.entity.Book;
import com.example.library.service.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/book")
public class BookController {
    private final BookService bookService;
    private final ModelMapper modelMapper;

    public BookController(BookService bookService, ModelMapper modelMapper) {
        this.bookService = bookService;
        this.modelMapper = modelMapper;
    }

    @PostMapping
    public Book createBookController(@RequestBody Book book) {
        return bookService.createBookService(book);
    }

   /* @GetMapping
    public List<BookDto> readBookService(){
        List<Book> book = bookService.readBookService();
        return book.stream().map(record -> modelMapper.map(record, BookDto.class)).collect(Collectors.toList());
    }*/

    @GetMapping
    public List<Book> readBookService() {
        try{
            return bookService.readBookService();
        }catch (Exception e){
            return null;
        }
    }

}
