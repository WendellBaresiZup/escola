package com.zup.escola.service;

import com.zup.escola.dtos.AlunoRequestDTO;
import com.zup.escola.dtos.AlunoResponseDTO;
import com.zup.escola.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlunoServiceImpl implements AlunoService{

    @Autowired
    private AlunoRepository repository;

    @Override
    public List<AlunoResponseDTO> listarAlunos(AlunoRequestDTO alunoRequestDTO){
        return repository.findAll().stream().map(aluno -> new AlunoResponseDTO(aluno.getId(), aluno.getNome(), aluno.getIdade()))
                .collect(Collectors.toList());
    }
}
