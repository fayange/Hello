package com.webproject.fete;

import javax.swing.*;

/**
 * Created by stephanie on 14/02/2017.
 * Importation des classes que je vais utiliser
 */

public class Anniversaire extends Fete {

    /*
    * @var type string par défaut un anniversaire...
    * */
    private String type = "Fête d'Anniversaire";


    /*
  * Retourne la valeur de l'attribut privé 'type" de la classe Anniversaire
  * */
    public String type(){
        return this.type;
    }


    /*
  * methode Void = ne retourne rien elle va juste afficher
  * */
    public void avertir(){

        String message;

        message = this.type + " ! \n ";
        message+= "Elle aura lieu " + this.jourSemaine + "\n";
        message+= "Organisateur : " + this.organisateur;


//   Ajoutons les invités à notre anniversiare
        message+="\n Les invités sont : ";

//        on boucle sur le ArrayList personnes
        for (int i=0; i < this.personnes.size(); i++){
            message+= this.personnes.get(i).getNom() + " " + this.personnes.get(i).getPrenom() + " " ;
        }

        JOptionPane.showMessageDialog(null, message);
        System.out.println(message);

    }




}
