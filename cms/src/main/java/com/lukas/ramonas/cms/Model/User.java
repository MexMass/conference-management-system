package com.lukas.ramonas.cms.Model;

import org.hibernate.annotations.Cascade;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import javax.swing.*;
import java.util.Collection;
import java.util.List;

/*******************************************
 * Defined entity model
 *******************************************/
@Entity(name = "User")
@Table(name = "user_table")
public class User implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer user_id;

    private String name;

    @Column(nullable = false, unique = true)
    private String username;

    private String password;

    private String email;

    private String role;

//    @OneToMany(orphanRemoval=true,  mappedBy="User", fetch = FetchType.EAGER)
//    @Cascade(org.hibernate.annotations.CascadeType.ALL)
//    private List<Role> roles;
//test
    private boolean confirmed;

    public Integer getId() {
        return user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return this.roles;
//    }
//
//    public void setAuthorities(List authorities) {
//        this.roles = authorities;
//    }

    public Boolean getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }


    @Override
    public String getAuthority() {
        return this.role;
    }
}