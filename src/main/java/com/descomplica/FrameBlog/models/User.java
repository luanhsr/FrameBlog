package com.descomplica.FrameBlog.models;

import com.descomplica.FrameBlog.enums.RoleEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "User")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String nome;
    private String email;
    private String password;
    private RoleEnum role;

    // use Genarator > Constructor
    // por boa pratica coloque os parametros como final, por boa pratica.

    public User(final Long id, final RoleEnum role, final String password, final String email, final String nome) {
        this.id = id;
        this.role = role;
        this.password = password;
        this.email = email;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    public User() {

    }
}
