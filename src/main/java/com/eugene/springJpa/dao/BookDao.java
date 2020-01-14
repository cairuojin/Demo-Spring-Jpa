package com.eugene.springJpa.dao;

import com.eugene.springJpa.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<Book, String> {
}
