package org.example.knoldus.demo.api;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Student {
    public int sid;
    public String name;
    public int rollno;
}
