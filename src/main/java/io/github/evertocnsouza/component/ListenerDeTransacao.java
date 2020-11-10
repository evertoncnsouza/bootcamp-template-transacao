package io.github.evertocnsouza.component;

import io.github.evertocnsouza.listener.EventoDeTransacao;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Component
public class ListenerDeTransacao {

    private EntityManager manager;

    public ListenerDeTransacao(EntityManager manager) {
        this.manager = manager;
    }

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    @Transactional
    public void ouvir(EventoDeTransacao transacaoResponse) {
        manager.persist(transacaoResponse.toTransacao());
    }
}