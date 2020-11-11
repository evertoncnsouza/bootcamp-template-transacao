package io.github.evertocnsouza.listener;

import io.github.evertocnsouza.entity.Transacao;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class EventoDeTransacao {

    private UUID id;
    private BigDecimal valor;
    private EstabelecimentoListener estabelecimentoListener;
    private CartaoListener cartaoListener;
    private LocalDateTime efetivadaEm;


    public Transacao toTransacao(){
        return new Transacao(id, valor, estabelecimentoListener.toEstabelecimento(), cartaoListener.toCartao(), efetivadaEm);
    }

    public UUID getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public EstabelecimentoListener getEstabelecimentoListener() {
        return estabelecimentoListener;
    }

    public CartaoListener getCartaoListener() {
        return cartaoListener;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public void setEstabelecimentoListener(EstabelecimentoListener estabelecimentoListener) {
        this.estabelecimentoListener = estabelecimentoListener;
    }

    public void setCartaoListener(CartaoListener cartaoListener) {
        this.cartaoListener = cartaoListener;
    }

    public void setEfetivadaEm(LocalDateTime efetivadaEm) {
        this.efetivadaEm = efetivadaEm;
    }
}
