package com.akemy.icons.proyectospring.service;

import com.akemy.icons.proyectospring.dto.ContinenteDTO;

import java.util.List;

public interface ContinenteService {

    ContinenteDTO save(ContinenteDTO dto);

    List<ContinenteDTO> listAll();

}
