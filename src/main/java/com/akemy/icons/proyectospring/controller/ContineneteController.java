package com.akemy.icons.proyectospring.controller;


import com.akemy.icons.proyectospring.dto.ContinenteDTO;
import com.akemy.icons.proyectospring.entity.ContinenteEntity;
import com.akemy.icons.proyectospring.mapper.ContinenteMapper;
import com.akemy.icons.proyectospring.repository.ContinenteRepository;
import com.akemy.icons.proyectospring.service.ContinenteService;
import com.akemy.icons.proyectospring.service.implementacion.ContinenteServiceImplementacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/continentes")
public class ContineneteController {

    @Autowired
    private ContinenteService continenteService;



    @GetMapping
    public ResponseEntity<List<ContinenteDTO>> listAll(){
        List<ContinenteDTO> continentes = continenteService.listAll();
        return ResponseEntity.ok().body(continentes);

    }

    @PostMapping
    public ResponseEntity<ContinenteDTO> save(@RequestBody ContinenteDTO continenteDTO){


        ContinenteDTO continenteGuardado = continenteService.save(continenteDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body(continenteGuardado);

    }

}
