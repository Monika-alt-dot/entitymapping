package com.soprasteria.entitymapping.Repository;

import com.soprasteria.entitymapping.entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface LibraryRepository extends JpaRepository<Library, Long> {}
