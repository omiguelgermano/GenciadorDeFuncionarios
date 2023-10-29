package com.crudthymeleaf.gerenciadorFuncionarios.controller;

import com.crudthymeleaf.gerenciadorFuncionarios.modelo.Funcionario;
import com.crudthymeleaf.gerenciadorFuncionarios.modelo.FuncionarioRepository;
import com.crudthymeleaf.gerenciadorFuncionarios.modelo.FuncionarioSetor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

//    @GetMapping("/home")
//    public String home(){
//        return "home";
//    }

    @GetMapping("/home")
    public String home(Model model) {
        List<Funcionario> funcionarios = funcionarioRepository.findAll();

        model.addAttribute("funcionarios", funcionarios);
        return "home";
    }

    @GetMapping
    public String setor(@RequestParam String setor, Model model) {
        FuncionarioSetor funcionarioSetor = FuncionarioSetor.valueOf(setor.toUpperCase());
        List<Funcionario> funcionarios = funcionarioRepository.findBySetor(funcionarioSetor);

        model.addAttribute("funcionarios", funcionarios);
        return "home";
    }

}
