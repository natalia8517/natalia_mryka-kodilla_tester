package com.kodilla.rest.controller;

import com.kodilla.rest.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(BookController.class)                   // [1]
public class BookControllerMvcTest {

    @Autowired
    private MockMvc mockMvc;                         // [2]

    @MockBean
    private BookService bookService;                 // [3]

    @Test
    public void shouldFetchBooks() throws Exception {
    }

}