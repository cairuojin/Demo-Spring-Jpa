package com.eugene.springJpa.controller;

import com.eugene.springJpa.domain.Book;
import com.eugene.springJpa.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    TestService testService;

    @RequestMapping("/saveBook")
    public String saveBook() {
        Book book = new Book();
        book.setName("上下五千年");
        book.setWriter("cai");
        testService.saveBook(book);
        System.out.println("saveBook");
        return "test";
    }

    @RequestMapping("/queryBook")
    public String queryBook() {
        List<Book> books = testService.queryBook();
        System.out.println("queryBook");
        return books.size() + "";
    }

    @RequestMapping("/deleteBook")
    public String deleteBook() {
        List<Book> books = testService.queryBook();
        if (books.size() != 0)
            testService.deleteBook(books.get(0));
        System.out.println("deleteBook");
        return "test";
    }
}
