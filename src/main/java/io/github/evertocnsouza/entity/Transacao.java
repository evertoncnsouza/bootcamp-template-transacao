package io.github.evertocnsouza.entity;


import io.github.evertocnsouza.embeddable.Estabelecimento;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Transacao {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @NotNull
    private BigDecimal valor;

    @NotBlank
    @Embedded
    private Estabelecimento estabelecimento;

    @NotBlank
    @ManyToOne
    private Cartao cartao;

    @PastOrPresent
    LocalDateTime efetivadaEm = LocalDateTime.now();

    @Deprecated
    public Transacao() {
    }

    public Transacao(@NotNull BigDecimal valor,
                     @NotBlank Estabelecimento estabelecimento,
                     @NotBlank Cartao cartao) {
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
    }
}
