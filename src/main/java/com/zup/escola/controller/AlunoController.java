package com.zup.escola.controller;

import com.zup.escola.service.AlunoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoController {

    private AlunoService service;
}
