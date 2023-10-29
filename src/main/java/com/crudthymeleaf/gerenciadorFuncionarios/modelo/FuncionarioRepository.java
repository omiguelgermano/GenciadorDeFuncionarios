package com.crudthymeleaf.gerenciadorFuncionarios.modelo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
    List<Funcionario> findBySetor(FuncionarioSetor funcionarioSetor);
}