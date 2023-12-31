package com.example.library;

import com.example.library.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class TestServiceBook {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void insertBook() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/book"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

}
