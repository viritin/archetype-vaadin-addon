package ${package};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestServer {
    
    public static void main(String... args) throws Exception {
        SpringApplication.run(TestServer.class, args);
    }

}
