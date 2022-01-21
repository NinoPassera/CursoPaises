package com.akemy.icons.proyectospring.repository;

import com.akemy.icons.proyectospring.entity.ContinenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContinenteRepository extends JpaRepository<ContinenteEntity,Long> {



}
