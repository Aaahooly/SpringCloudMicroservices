package eurekaTest.Controller;

import eurekaTest.feign.FeignBookService;
import eurekaTest.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/main")
public class TestController {


    private final FeignBookService feignBookService;

    public TestController(FeignBookService feignBookService) {
        this.feignBookService = feignBookService;
    }


    @GetMapping()
    public ResponseEntity<HttpStatus> getAllBooks(){
        for (Book book: feignBookService.getAllBooksFromBookService()) {
            System.out.println(book);
        }
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
