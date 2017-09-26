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
public class CreerAnimal {
    
    static public Animal creerAnimal(String nom, String prenom, int age, Boolean chien, Boolean chat, String etat) throws ChienChatException{
        Animal animal = new Animal();
        animal.setNom(nom);
        animal.setPrenom(prenom);
        animal.setAge(age);
        animal.setChien(chien);
        animal.setChat(chat);
        animal.setEtat(etat);
    }
    
     static public Animal creerAnimal(String nom, String prenom, int age, Boolean chien, Boolean chat, String etat, Boolean vivant) throws ChienChatException{
        Animal animal = new Animal();
        animal.setNom(nom);
        animal.setPrenom(prenom);
        animal.setAge(age);
        animal.setChien(chien);
        animal.setChat(chat);
        animal.setEtat(etat);
        animal.setVivant(vivant);
    }
}
