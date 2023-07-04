package com.example.library.service;

import com.example.library.dto.BookDto;
import com.example.library.entity.Book;
import com.example.library.repository.BookRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    private final BookRepository bookRepository;
    private final ModelMapper modelMapper;

    public BookService(BookRepository bookRepository, ModelMapper modelMapper) {
        this.bookRepository = bookRepository;
        this.modelMapper = modelMapper;
    }

    public BookDto createBookService(Book book) {
        Book booking = bookRepository.save(book);
        return booking.getBookDto();
    }

    public List<BookDto> readBookService() {
        return bookRepository.findAll().stream().map(book -> modelMapper.map(book, BookDto.class)).collect(Collectors.toList());
    }
}
