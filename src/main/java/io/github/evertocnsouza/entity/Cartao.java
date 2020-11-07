package io.github.evertocnsouza.entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
public class Cartao {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @NotBlank
    @Email
    private String email;

    @Deprecated
    public Cartao() {
    }

    public Cartao(String id, @NotBlank @Email String email) {
        this.id = id;
        this.email = email;
    }
}


