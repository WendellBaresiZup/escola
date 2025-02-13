package com.zup.escola.service;

import com.zup.escola.model.Aluno;
import com.zup.escola.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;

    public List<Aluno> listarAlunos(){
        return repository.findAll();
    }
}
