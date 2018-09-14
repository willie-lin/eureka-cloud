package com.eureka.cloud.eurekahi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("books")
    public List<Book> getBooks(){
        return Arrays.asList(
                new Book(1, "Spring Cloud Eureka Service Registry Server", new BigDecimal(0)),
                new Book(2, "Spring Cloud Eureka Service Discovery", new BigDecimal(0)),
                new Book(3, "Spring Cloud Eureka Client", new BigDecimal(0))
        );
    }

}
