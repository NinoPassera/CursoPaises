package com.akemy.icons.proyectospring.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "pais")
@Getter
@Setter
public class PaisEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String imagen;

    private String denomination;

    @Column(name = "cantidad_habitantes")
    private Long cantidadDeHabitantes;

    private Long superficieM2;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "continente_id",insertable = false,updatable = false)
    private ContinenteEntity continente;

    @Column(name = "continente_id",nullable = false)
    private Long continenteId;

    @ManyToMany(
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(
            name = "icon_pais",
            joinColumns =  @JoinColumn(name = "pais_id"),
            inverseJoinColumns = @JoinColumn (name = "icon_id"))
    private Set<IconEntity> icons = new HashSet<>();








}
