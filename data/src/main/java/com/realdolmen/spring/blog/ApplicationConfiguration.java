package com.realdolmen.spring.blog;

import com.realdolmen.spring.blog.dao.Author;
import com.realdolmen.spring.blog.dao.AuthorRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

/**
 * Created by cda5732 on 14/04/2015.
 */
@SpringBootApplication
public class ApplicationConfiguration {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new SpringApplicationBuilder(ApplicationConfiguration.class).profiles("production").run();
        // TODO load repositories and test by inserting data into the production database

        AuthorRepository authorRepository = context.getBean(AuthorRepository.class);
        Author author = new Author("Jimi", "Hendrix");
        authorRepository.save(author);

        Author author2 = new Author("tes", "tes");
        authorRepository.save(author2);

        System.out.println(authorRepository.count());

        List<Author> authors = authorRepository.findByName("Jimi");
        for (Author author3 : authors){
            System.out.println(author3);
        }
    }
}
