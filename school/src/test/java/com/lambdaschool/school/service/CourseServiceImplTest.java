package com.lambdaschool.school.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lambdaschool.school.SchoolApplication;
import com.lambdaschool.school.controller.CourseController;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SchoolApplication.class)
class CourseServiceImplTest {
    @Autowired
    private CourseService courseService;

    @Autowired
    private ObjectMapper mapper;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findAll() {
    }

    @Test
    void getCountStudentsInCourse() {
    }

    @Test
    void delete() {

    }

    @Test
    public void findCourseById() {
        assertEquals("Data Science", courseService.findCourseById(1).getCoursename());
    }
}