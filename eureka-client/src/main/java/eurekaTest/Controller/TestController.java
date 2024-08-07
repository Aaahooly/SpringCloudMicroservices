package eurekaTest.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class TestController {

    @GetMapping("/test")
    public String test(@Value("${eureka.instance.instance-id}") String port){
        return "Instance" + " " + port;
    }



    @GetMapping("/request")
    public String test2(){
        return "Connect";
    }
}
