package com.avp.jdbc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="t_role")
public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Transient
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<User> users;

    public Role(Long l, String role_user) {
        this.id = l;
        this.name = role_user;
    }


    @Override
    public String getAuthority() {
        return getName();
    }
}
