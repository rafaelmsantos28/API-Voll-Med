package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello") //Indica a URL que o nosso Controller vai responder
public class HelloController {

    @GetMapping //Defini qual método do protocolo HTTP vai chamar esse método
    public String olaMundo(){
        return "Hello World";
    }
}
