package com.tourOfHero.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by yeo-sglo on 19/03/17.
 */
@Entity
@Data
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String nomSuperHero;
    private int puissance;
    private String attaquePreferee;

   public Hero(){}

    public Hero(String nom, String nomSuperHero, int puissance, String attaquePreferee) {
        this.nom = nom;
        this.nomSuperHero = nomSuperHero;
        this.puissance = puissance;
        this.attaquePreferee = attaquePreferee;
    }


}
