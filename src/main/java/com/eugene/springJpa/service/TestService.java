package com.eugene.springJpa.service;

import com.eugene.springJpa.dao.BookDao;
import com.eugene.springJpa.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    BookDao bookDao;

    public void saveBook(Book book){
        bookDao.save(book);
    }

    public List<Book> queryBook(){
        return bookDao.findAll();
    }

    public void deleteBook(Book book){
        bookDao.delete(book);
    }

}
