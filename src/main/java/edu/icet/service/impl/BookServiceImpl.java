package edu.icet.service.impl;

import edu.icet.dto.Book;
import edu.icet.entity.BookEntity;
import edu.icet.repository.BookRepository;
import edu.icet.service.BookService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    final BookRepository bookRepository;

    ModelMapper mapper;
    @Bean
    public void setup(){
        this.mapper=new ModelMapper();
    }
    @Override
    public void addBook(Book book) {
        BookEntity bookEntity = mapper.map(book, BookEntity.class);
        bookRepository.save(bookEntity);
    }

    @Override
    public List<BookEntity> getBooks() {
        return (List<BookEntity>) bookRepository.findAll();
    }
}
