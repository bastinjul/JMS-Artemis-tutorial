package be.bastinjul.jms_tuto.api;

import be.bastinjul.jms_tuto.services.ConsumerService;
import be.bastinjul.jms_tuto.services.ProducerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;


@Controller
@Tag(name = "TestController")
public class TestController {

    private final ProducerService producerService;
    private final ConsumerService consumerService;

    public TestController(ProducerService producerService, ConsumerService consumerService) {
        this.producerService = producerService;
        this.consumerService = consumerService;
    }

    @Operation
    @GetMapping(value="/test")
    @ResponseBody
    public String test() {
        return "Hello";
    }

    @Operation
    @GetMapping(value="/test/send")
    @ResponseBody
    public String testSend(@RequestParam(value = "message", defaultValue = "Hello") String message) {
        producerService.sendMessage(message);
        return "Message sent";
    }

    @Operation
    @GetMapping(value="/test/receive")
    @ResponseBody
    public String receive() {
        return consumerService.synchronousReceive();
    }
}
