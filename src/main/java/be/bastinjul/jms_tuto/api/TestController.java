package be.bastinjul.jms_tuto.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;


@Controller
@Tag(name = "TestController")
public class TestController {
    
    @Operation
    @GetMapping(value="/test")
    @ResponseBody
    public String test() {
        return "Hello";
    }
    
}
