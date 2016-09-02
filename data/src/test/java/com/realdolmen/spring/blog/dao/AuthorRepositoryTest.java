package com.realdolmen.spring.blog.dao;

import com.realdolmen.spring.blog.config.TestConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by cda5732 on 14/04/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestConfig.class)
// TODO Activate the test profile
// TODO Activate transactions

@ActiveProfiles("test")
@Transactional
public class AuthorRepositoryTest {

    // TODO wire in the repository
    @Autowired
    private AuthorRepository ar;

    // TODO add unit tests to test the repository

    @Test
    public void authorCanBeSaved(){
        Author a = new Author("Jimi", "Hendrix");
        ar.save(a);
        Assert.assertNotNull(a.getId());
    }

    @Test
    public void authorByName(){


    }



}
