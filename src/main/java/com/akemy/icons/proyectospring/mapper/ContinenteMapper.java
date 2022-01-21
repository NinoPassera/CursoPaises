package com.akemy.icons.proyectospring.mapper;

import com.akemy.icons.proyectospring.dto.ContinenteDTO;
import com.akemy.icons.proyectospring.entity.ContinenteEntity;
import com.akemy.icons.proyectospring.service.ContinenteService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ContinenteMapper {

    public ContinenteEntity continenteDtoToEntity(ContinenteDTO continenteDTO){

        ContinenteEntity continente= new ContinenteEntity();
        continente.setImage(continenteDTO.getImagen());
        continente.setDenomination(continenteDTO.getDenominacion());

        return continente;

    }

    public ContinenteDTO continenteEntityToDto(ContinenteEntity entity){
        ContinenteDTO dto = new ContinenteDTO();
        dto.setId(entity.getId());
        dto.setDenominacion(entity.getDenomination());
        dto.setImagen(entity.getImage());

        return dto;

    }

    public List<ContinenteDTO> continenteListEntity2DTO(List<ContinenteEntity> continenteEntityList){

        List<ContinenteDTO> continentesDTO = new ArrayList<>();
        for(ContinenteEntity entity : continenteEntityList){
            continentesDTO.add(continenteEntityToDto(entity));

        }
        return continentesDTO;
    }

}
