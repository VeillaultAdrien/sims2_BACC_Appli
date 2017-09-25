/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sims2_bacc_appli;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adrie
 */
public class Famille {
    String nom;
    Boolean active;
    int fond;
    String adresse;
    List<Sim> listeDesMembres = new ArrayList<>();
    List<Terrain> listeDesTerrains = new ArrayList<>();
    
    
    //Constructors
    public void Famille(String nom){
        this.nom = nom;
        active = false;
    }
    
    public void Famille(String nom, int fond){
        this.nom = nom;
        this.fond = fond;
    }
    
    public void Famille(String nom, int fond, String adresse){
        this.nom = nom;
        this.fond = fond;
        this.adresse = adresse;
    }
    
    //setter
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setFond(int fond) {
        this.fond = fond;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setListeDesMembres(List<Sim> listeDesMembres) {
        this.listeDesMembres = listeDesMembres;
    }

    public void setListeDesTerrains(List<Terrain> listeDesTerrains) {
        this.listeDesTerrains = listeDesTerrains;
    }
    
    
    //methods
    
    public int calculImpot(int pourcentage){
        int impot = this.fond*pourcentage;
        return(impot);
    }
    
    public void ajouterMembre(...){
        ...
    }
    
    public List listeDesMembres(){
        ...
    }
    
    public List listeDesTerrainsDeLaFamille(){
        ...
    }
    
    
}
