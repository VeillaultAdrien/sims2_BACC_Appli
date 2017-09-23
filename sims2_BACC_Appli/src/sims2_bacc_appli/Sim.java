/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sims2_bacc_appli;

/**
 *
 * @author adrie
 */
public abstract class Sim {
    String nom;
    String prenom;
    int age;
    Boolean vivant;
    String etat;
    
    public abstract String faireVieillir();
}
