package com.soprasteria.entitymapping.Repository;

import com.soprasteria.entitymapping.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface AuthorRepository extends JpaRepository<Author, Long> {}