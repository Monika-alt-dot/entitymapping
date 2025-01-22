package com.soprasteria.entitymapping.Repository;

import com.soprasteria.entitymapping.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface BookRepository extends JpaRepository<Book, Long> {}
