package eurekaTest.feign;

import eurekaTest.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "book-service")
public interface FeignBookService {

    @GetMapping("/api/books")
    public List<Book> getAllBooksFromBookService();
}
