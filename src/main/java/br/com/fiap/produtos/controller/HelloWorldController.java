package br.com.fiap.produtos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping
    public String helloworld() {
        return"Hello word";
    }

    @GetMapping("/feitico")
    public String quebrarFeitiço() {
        return"Quem não conjura o feitiço Hello, World! não domina a linguagem.";
    }

}
