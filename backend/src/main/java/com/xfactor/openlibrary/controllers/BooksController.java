package com.xfactor.openlibrary.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xfactor.openlibrary.domain.Book;
import com.xfactor.openlibrary.repositories.BookRepository;

@RestController
@RequestMapping("books")
public class BooksController {

    private BookRepository bookRepository;

    public BooksController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostMapping("/saveBook")
    public Book saveBook(@RequestBody Book book) {
        bookRepository.save(book);
        return book;
    }

      @GetMapping("/getAll")
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

      @GetMapping("/getbooksbyisbn/{isbn}")
      public List<Book> findbyisbn (@PathVariable String isbn){
        List<Book> listbyisbn = bookRepository.findByIsbn(isbn);
        return listbyisbn;
      }
    @GetMapping("/getbooksbyisbnandtitle/{title}/{isbn}")
    public List<Book> findbyisbnandtitle (@PathVariable String title, @PathVariable String isbn){
        List<Book> listbyisbnandtitle = bookRepository.findBytitleAndIsbn(title,isbn);
        return listbyisbnandtitle;
      }
      @GetMapping("/getBookByPublicationDate/{publicationDate}")
    public List<Book> findByPublicationDate(@PathVariable String publicationDate){
        List<Book> listOfBooksByPublicationDate = bookRepository.findByPublicationDate(publicationDate);
        return listOfBooksByPublicationDate;
    }

    @GetMapping("/getBookByPublisher/{publisher}")
    public List<Book> findByPublisher(@PathVariable String publisher){
        List<Book> listOfBooksByPublisher = bookRepository.findByPublisher(publisher);
        return listOfBooksByPublisher;
    }

    @GetMapping("/getBookByCopies/{copies}")
    public List<Book> findByCopies(@PathVariable int copies){
        List<Book> listOfBooksByCopies = bookRepository.findByCopies(copies);
        return listOfBooksByCopies;
    }

    @GetMapping("/getBookByCategory/{category}")
    public List<Book> findByCategory(@PathVariable String category){
        List<Book> listOfBooksByCategory = bookRepository.findByCategory(category);
        return listOfBooksByCategory;
    }

    @GetMapping("/getBookByGenre/{genre}")
    public List<Book> findByGenre(@PathVariable String genre){
        List<Book> listOfBooksByGenre = bookRepository.findByGenre(genre);
        return listOfBooksByGenre;
    }

    @GetMapping("/getBookBySubgenre/{subgenre}")
    public List<Book> findBySubgenre(@PathVariable String subgenre){
        List<Book> listOfBooksBySubgenre = bookRepository.findBySubgenre(subgenre);
        return listOfBooksBySubgenre;
    }

@GetMapping("/getBookByTitle/{title}")
    public List<Book> findByTitle(@PathVariable String title){
        List<Book> listOfBooksByTitle = bookRepository.findByTitle(title);
        return listOfBooksByTitle;
    }

    @GetMapping("/getBookByAuthor/{author}")
    public List<Book> findByAuthor(@PathVariable String author){
        List<Book> listOfBooksByAuthor = bookRepository.findByAuthor(author);
        return listOfBooksByAuthor;
    }

    @PutMapping("/updateBook")
    public Book updateBook (@RequestBody Book book){
        if (book.getId()!= 0L)
        {Book updatedBook = bookRepository.save(book); 
            return updatedBook;
        } 
            
            return null;

    }

    @DeleteMapping("/delete/{id}")
    public void deletebook (@PathVariable long id ){
        bookRepository.deleteById(id);
    }
  

    

}
