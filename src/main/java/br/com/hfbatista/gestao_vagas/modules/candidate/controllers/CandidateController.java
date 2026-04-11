package br.com.hfbatista.gestao_vagas.modules.candidate.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hfbatista.gestao_vagas.modules.candidate.CandidateEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/candidate")
public class CandidateController {
    
    
    @PostMapping("/create")
    public void createCandidate(@RequestBody CandidateEntity candidateEntity) {
        // Lógica para criar um candidato
        System.out.println("Creating candidate: " + candidateEntity);
    }
}
