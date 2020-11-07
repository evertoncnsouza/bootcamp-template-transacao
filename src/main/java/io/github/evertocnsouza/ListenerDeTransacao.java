package io.github.evertocnsouza;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerDeTransacao {

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void ouvir(EventoDeTransacaoCartao eventoDeTransacaoCartao) {
        System.out.println(eventoDeTransacaoCartao);
    }

}