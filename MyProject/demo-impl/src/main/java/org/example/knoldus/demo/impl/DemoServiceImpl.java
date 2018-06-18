package org.example.knoldus.demo.impl;
import akka.NotUsed;
import com.lightbend.lagom.javadsl.api.ServiceCall;
import org.example.knoldus.demo.api.DemoService;
import org.example.knoldus.demo.api.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class DemoServiceImpl implements DemoService {

    List<Student> user = new ArrayList<>();
    @Override
    public ServiceCall<Student,Student> postStudent(){
        return request-> {
            Student student = Student.builder()
                    .sid(request.getSid())
                    .name(request.getName())
                    .rollno(request.getRollno())
                    .build();

            user.add(student);
            return CompletableFuture.completedFuture(student);
        };
    }

    @Override
    public ServiceCall<NotUsed,List<Student>> getStudent(int id){
        return request -> {
            List<Student> student =user.stream().filter(x->x.getSid()==id).collect(Collectors.toList());
            return CompletableFuture.completedFuture(student);

        };
    }

    @Override
    public ServiceCall<NotUsed,List<Student>> removeStudent(int id){
        return request ->{
            List<Student> student = user.stream().filter(x->x.getSid()==id).collect(Collectors.toList());
            user.remove(student);
        return CompletableFuture.completedFuture(user);
        };

    }
}
