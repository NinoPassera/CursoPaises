package com.akemy.icons.proyectospring.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "icon")
@Getter
@Setter
@SQLDelete(sql = "UPDATE icon SET delete = true WHERE id=?")
@Where(clause = "delete=false")
public class IconEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String imagen;
    private String denominacion;

    private boolean delete = Boolean.FALSE;


    @Column(name = "fecha_creacion")
    @DateTimeFormat (pattern = "yyyy/mm/dd")
    private LocalDate fechaCreacion;

    private Long altura;

    private String historia;



    @ManyToMany(mappedBy = "icons",cascade = CascadeType.ALL)
    private List<PaisEntity> paises = new ArrayList<>();

    public void addPaises(PaisEntity pais){
        this.paises.add(pais);
    };

    public void removePais(PaisEntity pais){
        this.paises.remove(pais);
    }





}
