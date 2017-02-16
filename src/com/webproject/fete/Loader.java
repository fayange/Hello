package com.webproject.fete;

/**
 * Created by stephanie on 14/02/2017.
 */
public class Loader {


    /*
    * @param args
    * */
    public static void main(String[] args) {
        /*
        * Instanciation de la classe Anniversaire
        *
        * */
        Anniversaire monAnniversaire = new Anniversaire();

        /*
        * Appelons qqus méthodes de la classe
        *
        * */
        monAnniversaire
                .organisateur("Stéphanie")
                .jourSemaine("Samedi");

        Personne invite_1 = new Personne();
        invite_1
                .age(45)
                .nom("CAUMONT")
                .prenom("Stéphanie, ");

        monAnniversaire.inviter(invite_1);

        Personne invite_2 = new Personne();
        invite_2
                .age(35)
                .nom("AUBERT")
                .prenom("Jean Luc, ");
        monAnniversaire.inviter(invite_2);

        Personne invite_3 = new Personne();
        invite_3
                .age(45)
                .nom("BOND")
                .prenom("James, ");
        monAnniversaire.inviter(invite_3);

        Personne invite_4 = new Personne();
        invite_4
                .age(55)
                .nom("CASPER")
                .prenom("Le Fantôme");
        monAnniversaire.inviter(invite_4);



         /*
        * Affichons donc le résultat
        * */
        monAnniversaire.avertir();



    }









}
