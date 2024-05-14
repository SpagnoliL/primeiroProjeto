package com.example.exemplospring.exemploController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class exemploController {

    @GetMapping("ping")
    public String ping(){
        return "pong";
    }
    @GetMapping("nome/{nome}")
    public String recebeNome(@PathVariable String nome){
        return "o nome enviado foi: "+nome;
    }
    @GetMapping("soma")
    public String receberSoma(@RequestParam int x, @RequestParam int y){
        return "A soma dos valores é: " +(x+y);
    }
}
