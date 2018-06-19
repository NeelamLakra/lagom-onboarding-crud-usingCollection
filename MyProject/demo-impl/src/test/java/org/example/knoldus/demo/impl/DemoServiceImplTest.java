package org.example.knoldus.demo.impl;

import org.example.knoldus.demo.api.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class DemoServiceImplTest {
    
    private DemoServiceImpl demoService = new DemoServiceImpl();
    
    @Test
    public void postStudent() throws Exception {
        List<Student> studentList = demoService.postStudent()
                .invoke(Student.builder().sid(5).name("neel").rollno(2).build())
                .toCompletableFuture()
                .get(5, TimeUnit.SECONDS);
        assertEquals("neel", studentList.get(0).name);
    }
    
    @Test
    public void getStudent() throws Exception {
        List<Student> studentRecord = demoService.getStudent(5).invoke().toCompletableFuture().get(5, TimeUnit.SECONDS);
        assertEquals(studentRecord, new ArrayList<>());
    }
}
