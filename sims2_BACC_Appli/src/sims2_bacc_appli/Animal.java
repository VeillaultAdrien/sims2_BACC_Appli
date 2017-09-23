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
public class Animal extends Sim {
    Boolean chien;
    Boolean chat;
    
    //constructor
    public void Animal(String nom, String prenom, int age, Boolean chien, Boolean chat, String etat){
        super.nom = nom;
        super.prenom = prenom;
        super.age = age;
        this.chien = chien;
        this.chat = chat;
        super.etat = etat;
    }
    
    public void Animal(String nom, String prenom, int age, Boolean chien, Boolean chat, String etat, Boolean vivant){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.chien = chien;
        this.chat = chat;
        this.etat = etat;
        this.vivant = vivant;
    }
    
    //setter

    public void setChien(Boolean chien) {
        this.chien = chien;
    }

    public void setChat(Boolean chat) {
        this.chat = chat;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setVivant(Boolean vivant) {
        this.vivant = vivant;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
    
    
    @Override
    public String faireVieillir(){
        
    }
}
