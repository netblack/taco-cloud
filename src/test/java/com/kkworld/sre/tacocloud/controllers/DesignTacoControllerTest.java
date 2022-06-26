package com.kkworld.sre.tacocloud.controllers;

import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest()
public class DesignTacoControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testDesignPage() throws Exception {
        this.mockMvc.perform(get("/design"))
                .andExpect(status().isOk())
                .andExpect(view().name("design"))
                .andExpect(content().string(containsString("Design your taco")));

    }
    @Test
    public void testCreateDesign() throws Exception{
        UrlEncodedFormEntity form = new UrlEncodedFormEntity(Arrays.asList(
                new BasicNameValuePair("ingredients", "COTO"),
                new BasicNameValuePair("ingredients", "JACK"),
                new BasicNameValuePair("ingredients", "TMTO"),
                new BasicNameValuePair("ingredients", "SRCR"),
                new BasicNameValuePair("name", "test-junit")
                ), "utf-8");

        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/design")
                .content(EntityUtils.toString(form))
                .contentType(MediaType.APPLICATION_FORM_URLENCODED))
                .andExpect(status().is3xxRedirection())
                .andReturn();
    }
}
