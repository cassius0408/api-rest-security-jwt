package br.com.estudo.rest_springboot_application.security;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Classe que representara um objeto para gerar o token.
 */
public class JWTObject {

    private String subject;      // nome do usuario
    private Date issuedAt;       // data da criacao do token
    private Date expiration;     // data da expiracao do token
    private List<String> roles;  // perfis de acesso

    public void setRoles(String... roles){
        this.roles = Arrays.asList(roles);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(Date issuedAt) {
        this.issuedAt = issuedAt;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
