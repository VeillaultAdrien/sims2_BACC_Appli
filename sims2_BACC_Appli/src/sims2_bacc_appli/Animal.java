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
public class Animal extends Sim {
    Boolean chien;
    Boolean chat;
    
    
    //constructor
    public void Animal(String nom, String prenom, int age, Boolean chien, Boolean chat, String etat) throws ChienChatException{
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.chien = chien;
        this.chat = chat;
        super.etat = etat;
        try{
            if (chien==true && chat==false){
                this.listeEtats.add("Chiot");
                this.listeEtats.add("Adulte");
                this.listeEtats.add("Senior");
            } else {
                if (chat==true && chien==false){
                    this.listeEtats.add("Chaton");
                    this.listeEtats.add("Adulte");
                    this.listeEtats.add("Senior");
                } else throw new ChienChatException("chien et chat à la fois");
            }
        } catch (ChienChatException e){
            System.out.println("Ne peut pas être un chien et un chat à la fois");
        
    }
       
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
