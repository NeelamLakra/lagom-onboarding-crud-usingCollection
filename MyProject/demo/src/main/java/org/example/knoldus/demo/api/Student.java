package org.example.knoldus.demo.api;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.lightbend.lagom.serialization.Jsonable;
import lombok.Builder;
import lombok.Getter;
import lombok.Value;

@Value
@Builder
@JsonDeserialize
@Getter
public class Student implements Jsonable {
    int sid;
    String name;
    int rollno;
}
