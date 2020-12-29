package com.spring.empresa.models;

import com.sun.istack.NotNull;

import javax.persistence.*;


@Entity
@Table(name="Tb_Estabelecimento")
public class Estabelecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    @NotNull
    private String Nome;

    @NotNull
    private String Endereco;

    @NotNull
    private int Telefone;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int telefone) {
        Telefone = telefone;
    }
}
