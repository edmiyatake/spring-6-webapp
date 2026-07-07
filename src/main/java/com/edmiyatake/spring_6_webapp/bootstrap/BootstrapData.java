package com.edmiyatake.spring_6_webapp.bootstrap;

import com.edmiyatake.spring_6_webapp.domain.Author;
import com.edmiyatake.spring_6_webapp.domain.Book;
import com.edmiyatake.spring_6_webapp.repositories.AuthorRepository;
import com.edmiyatake.spring_6_webapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Author rod = new Author();
        eric.setFirstName("Rod");
        eric.setLastName("Johnson");

        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("123456");

        Book noEJB = new Book();
        noEJB.setTitle("J2EEE Development without EJB");
        noEJB.setIsbn("654321");

        Author ericSaved = authorRepository.save(eric);
        Author rodSaved = authorRepository.save(rod);
        Book dddSaved = bookRepository.save(ddd);
        Book noEJBSaved = bookRepository.save(noEJB);

    }

}
