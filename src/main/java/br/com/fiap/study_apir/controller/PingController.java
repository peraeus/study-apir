package br.com.fiap.study_apir.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class PingController {
    @GetMapping("raiz")
    public String raiz() {
        return "raiz";
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong blz";
    }

    @GetMapping("/rota1")
    public String rota1() {
        return "rota1";
    }

    @GetMapping("/rota2")
    public String rota2() {
        return "rota2"; // resposta padrao
    }

    @GetMapping("/rota3")
    public String rota3() {
        return "rota3"; // resposta padrao
    }
}