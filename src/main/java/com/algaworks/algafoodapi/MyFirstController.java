package com.algaworks.algafoodapi;

import com.algaworks.algafoodapi.di.modelo.Cliente;
import com.algaworks.algafoodapi.di.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyFirstController {

    private AtivacaoClienteService ativacaoClienteService;

    public MyFirstController(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;

        System.out.printf("Meu primeiroController" + ativacaoClienteService);
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        Cliente joao = new Cliente("João", "joao@123.com", "169985560");
        ativacaoClienteService.ativar(joao);

        return "oi";
    }
}
