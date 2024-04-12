package com.algaworks.algafoodapi.di.service;

import com.algaworks.algafoodapi.di.modelo.Cliente;
import com.algaworks.algafoodapi.di.notificacao.Notificador;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;
        System.out.printf("Ativacao clienteservice" + notificador);
    }

    public void ativar(Cliente cliente) {

         notificador.notificar(cliente, "Seu cadastro no sistema está ativo");
     }

}