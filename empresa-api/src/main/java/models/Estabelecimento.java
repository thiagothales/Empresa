package models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Tb_Estabelecimento")
public class Estabelecimento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    private String Nome;

    private String Endereco;

    private int Telefone;

    private String Funcao;
}
