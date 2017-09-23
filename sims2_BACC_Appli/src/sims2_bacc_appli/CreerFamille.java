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
public class CreerFamille {
    
    static public Famille creerFamille(String nom){
        Famille famille = new Famille();
        famille.setNom(nom);
        return(famille);        
    }
    
    static public Famille creerFamille(String nom, int fond){
        Famille famille = new Famille();
        famille.setNom(nom);
        famille.setFond(fond);
        return(famille);        
    }
    
    static public Famille creerFamille(String nom, int fond, Strinf adresse){
        Famille famille = new Famille();
        famille.setNom(nom);
        famille.setFond(fond);
        famille.setAdresse(adresse);
        return(famille);        
    }
}
