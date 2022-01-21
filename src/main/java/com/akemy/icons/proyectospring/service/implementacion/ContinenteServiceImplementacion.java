package com.akemy.icons.proyectospring.service.implementacion;

import com.akemy.icons.proyectospring.dto.ContinenteDTO;
import com.akemy.icons.proyectospring.entity.ContinenteEntity;
import com.akemy.icons.proyectospring.mapper.ContinenteMapper;
import com.akemy.icons.proyectospring.repository.ContinenteRepository;
import com.akemy.icons.proyectospring.service.ContinenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContinenteServiceImplementacion implements ContinenteService {

    @Autowired
    private ContinenteMapper continenteMapper;
    @Autowired
    private ContinenteRepository continenteRepository;

    public ContinenteDTO save(ContinenteDTO continenteDTO){
        ContinenteEntity entity= continenteMapper.continenteDtoToEntity(continenteDTO);
        ContinenteEntity entitySave= continenteRepository.save(entity);

        System.out.println("El continente se guardo correctamente");
        return continenteMapper.continenteEntityToDto(entitySave);
    }

    @Override
    public List<ContinenteDTO> listAll() {
        List<ContinenteEntity> continentesEtity= continenteRepository.findAll();
        return continenteMapper.continenteListEntity2DTO(continentesEtity);
    }

}
