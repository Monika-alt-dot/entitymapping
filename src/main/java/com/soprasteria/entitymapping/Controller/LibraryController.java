package com.soprasteria.entitymapping.Controller;

import com.soprasteria.entitymapping.Repository.LibraryRepository;
import com.soprasteria.entitymapping.entity.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libraries")
public class LibraryController {

    @Autowired
    private LibraryRepository libraryRepository;

    @GetMapping
    public List<Library> getAllLibraries() {
        return libraryRepository.findAll();
    }

    @GetMapping("/{id}")
    public Library getLibraryById(@PathVariable Long id) {
        return libraryRepository.findById(id).orElseThrow(() -> new RuntimeException("Library not found"));
    }

    @PostMapping
    public Library createLibrary(@RequestBody Library library) {
        return libraryRepository.save(library);
    }

    @PutMapping("/{id}")
    public Library updateLibrary(@PathVariable Long id, @RequestBody Library libraryDetails) {
        Library library = libraryRepository.findById(id).orElseThrow(() -> new RuntimeException("Library not found"));
        library.setName(libraryDetails.getName());
        library.setAddress(libraryDetails.getAddress());
        return libraryRepository.save(library);
    }

    @DeleteMapping("/{id}")
    public void deleteLibrary(@PathVariable Long id) {
        libraryRepository.deleteById(id);
    }
}

