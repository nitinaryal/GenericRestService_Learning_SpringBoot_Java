package mynewservice.com;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import jdk.internal.instrumentation.TypeMapping;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by naryal on 11/14/15.
 */
@Controller
@EnableAutoConfiguration
public class MyService_Controller {
    @ResponseBody
    @RequestMapping("/request/v1")
    String returnResponse(){
        return "Hello Whatzup!";
    }
}
