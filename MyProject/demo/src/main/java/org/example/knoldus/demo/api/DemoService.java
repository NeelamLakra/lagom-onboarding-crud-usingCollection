package org.example.knoldus.demo.api;

import akka.NotUsed;
import com.lightbend.lagom.javadsl.api.Descriptor;
import com.lightbend.lagom.javadsl.api.Service;
import com.lightbend.lagom.javadsl.api.ServiceCall;

import java.util.List;

import static com.lightbend.lagom.javadsl.api.Service.named;
import static com.lightbend.lagom.javadsl.api.transport.Method.DELETE;
import static com.lightbend.lagom.javadsl.api.transport.Method.GET;
import static com.lightbend.lagom.javadsl.api.transport.Method.POST;

public interface DemoService extends Service {

    ServiceCall<Student, List<Student>> postStudent();
    ServiceCall<NotUsed,List<Student>> getStudent(int id);
    ServiceCall<NotUsed,List<Student>> removeStudent(int id);



    @Override
    default Descriptor descriptor() {
        return named("demo")
                .withCalls(
                Service.restCall(POST, "/api/addStudent", this::postStudent),
                        Service.restCall(GET,"/api/getStudent/:id",this::getStudent),
                        Service.restCall(DELETE,"/api/removeStudent/:id",this::removeStudent)
        ).withAutoAcl(true);
    }
}
