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

    public void setId(UUID id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public EstabelecimentoListener getEstabelecimento() {
        return estabelecimentoListener;
    }

    public void setEstabelecimento(EstabelecimentoListener estabelecimentoListener) {
        this.estabelecimentoListener = estabelecimentoListener;
    }

    public CartaoListener getCartao() {
        return cartaoListener;
    }

    public void setCartao(CartaoListener cartaoListener) {
        this.cartaoListener = cartaoListener;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    public void setEfetivadaEm(LocalDateTime efetivadaEm) {
        this.efetivadaEm = efetivadaEm;
    }

}
