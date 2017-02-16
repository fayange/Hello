package com.webproject.fete;

import java.util.ArrayList;

/**
 * Created by stephanie on 14/02/2017.
 */
public class Fete {


    /*
    * @var organisateur string Nom de l'organisateur
    * */
    protected String organisateur;


    /*
   * @var organisateur string jour de la semaine
   * */
    protected String jourSemaine;

    /*
  * @array Tableau des personnes invitées à l'instance courante de la fête
  * */
    public ArrayList<Personne> personnes;


    public Fete(){
        this.personnes = new ArrayList<Personne>();
    }


    /*
    * Getter et setter méthode chaînable
    *
    * Retour le nom de l'organisateur
    * @return
    * */

    public Fete organisateur(String organisateur) {
        this.organisateur = organisateur;
        return this;
    }

    public String organisateur() {
        return this.organisateur;
    }

     /*
    * Retour le jour de la semaine
    * @param jourSemaine
    * @return com.webproject.fete.Fete
    * */
    public Fete jourSemaine(String jourSemaine) {
        this.jourSemaine = jourSemaine;
        return this;
    }

    public String jourSemaine() {
        return this.jourSemaine;
    }

    public void inviter(Personne invite) {
        this.personnes.add(invite);
    }



}


