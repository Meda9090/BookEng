package com.example.Book.Controller;


import com.example.Book.Entity.Book;
import com.example.Book.Entity.EngCourse;
import com.example.Book.Repository.BookRepository;
import com.example.Book.Repository.EngRepository;
import com.example.Book.Service.BookService;
import com.example.Book.Service.EngService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/product")

public class ProductController {


    @Autowired
    private BookService bookService;

    @Autowired
    private EngService engService;
//======================ADD========================================

    @PostMapping("/add/ENG")
    public EngCourse addEng(@RequestBody EngCourse engCourse) {
        return engService.addENG(engCourse);
    }

//----------------------------------------------------------------
    @PostMapping("/add/books")
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }
//====================GET====================================================

    @GetMapping("/get/ENG")
    public List<EngCourse> getAllEng() {
        return engService.getAllENG();
    }
//---------------------------------------------------------------------------

    @GetMapping("/get/books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
//=====================UPDATE=============================================

    @PutMapping("/update/ENG/{id}")
        public ResponseEntity<?> updateEng(@PathVariable long id) {
        engService.updateENG(id);
        return ResponseEntity.ok().build();
    }
//--------------------------------------------------------------------
    @PutMapping("/update/books/{id}")
    public ResponseEntity<BookRepository> updateBook(@PathVariable long id,
                                                     @RequestBody Book bookDetails) {
        bookService.updateBook(id, bookDetails);
        return ResponseEntity.ok().build();
    }

//===========================DELETE===========================================

    @DeleteMapping("/delete/ENG/{id}")
    public ResponseEntity<EngCourse> sellEng(@PathVariable long id) {
        engService.sellENG(id);
        return ResponseEntity.ok().build();
    }
//--------------------------------------------------------------------

    @DeleteMapping("/delete/books/{id}")
    public ResponseEntity<Book> sellBook(@PathVariable long id) {
        bookService.sellBook(id);
        return ResponseEntity.ok().build();
    }
//-----------------------------------------------------------------






}