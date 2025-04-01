package com.uade.tpo.supermercado.entity;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 50,nullable = false )
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "parent_id", referencedColumnName = "id")
    private Categoria parentCategoria;

    @OneToMany(mappedBy = "parentCategoria",cascade = CascadeType.ALL)
    private List<Categoria> subcategorias;




    public Categoria(){

    }






    
}
