package com.algaworks.algafoodapi.di.notificacao;

import com.algaworks.algafoodapi.di.modelo.Cliente;
import org.springframework.stereotype.Component;

@Component
public class NotificadorEmail implements Notificador {

     public NotificadorEmail() {
         System.out.printf("Notificador email");
     }
    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s atavés do e-mail %s: %s\n", cliente.getNome(),
                cliente.getEmail(), mensagem);
    }

}
