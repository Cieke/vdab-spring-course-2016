package com.realdolmen.spring.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by tywinlannister on 01/09/16.
 */
public interface AuthorRepository extends JpaRepository<Author, Integer>{
    List<Author>findByName(String firstName);

}
