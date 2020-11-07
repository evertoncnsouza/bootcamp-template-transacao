package io.github.evertocnsouza.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class CartaoResponse {

    private String id;

    @NotBlank
    @Email
    private String email;

    public CartaoResponse(String id, @NotBlank @Email String email) {
        super();
        this.id = id;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
