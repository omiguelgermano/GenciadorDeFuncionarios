package com.crudthymeleaf.gerenciadorFuncionarios.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Funcionario {

    @Id //javax.persistence.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private String email;
    private String cargo;
    private BigDecimal salario;


    @Enumerated(EnumType.STRING)
    private FuncionarioSetor setor;


    public void setSetor(FuncionarioSetor setor) {
        this.setor = setor;
    }

}