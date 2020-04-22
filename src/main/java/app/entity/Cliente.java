package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela Cliente
* @generated
*/
@Entity
@Table(name = "\"Cliente\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Cliente")
public class Cliente implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
    private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "Nome", nullable = true, unique = false, insertable=true, updatable=true)
    
    private java.lang.String nome;

    /**
    * @generated
    */
    @Column(name = "Login", nullable = true, unique = false, insertable=true, updatable=true)
    
    private java.lang.String login;

    /**
    * @generated
    */
    @Column(name = "Senha", nullable = true, unique = false, insertable=true, updatable=true)
    
    private java.lang.String senha;

    /**
    * Construtor
    * @generated
    */
    public Cliente(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.String getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Cliente setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém nome
    * return nome
    * @generated
    */
    
    public java.lang.String getNome(){
        return this.nome;
    }

    /**
    * Define nome
    * @param nome nome
    * @generated
    */
    public Cliente setNome(java.lang.String nome){
        this.nome = nome;
        return this;
    }
    /**
    * Obtém login
    * return login
    * @generated
    */
    
    public java.lang.String getLogin(){
        return this.login;
    }

    /**
    * Define login
    * @param login login
    * @generated
    */
    public Cliente setLogin(java.lang.String login){
        this.login = login;
        return this;
    }
    /**
    * Obtém senha
    * return senha
    * @generated
    */
    
    public java.lang.String getSenha(){
        return this.senha;
    }

    /**
    * Define senha
    * @param senha senha
    * @generated
    */
    public Cliente setSenha(java.lang.String senha){
        this.senha = senha;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cliente object = (Cliente)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}