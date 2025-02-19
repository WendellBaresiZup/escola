package com.zup.escola.service;

import com.zup.escola.dtos.AlunoRequestDTO;
import com.zup.escola.dtos.AlunoResponseDTO;

import java.util.List;

public interface AlunoService{
    List<AlunoResponseDTO> listarAlunos(AlunoRequestDTO alunoRequestDTO);
}
