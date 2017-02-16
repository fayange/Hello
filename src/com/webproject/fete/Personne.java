package com.webproject.fete;

/**
 *
 * Created by stephanie on 14/02/2017.
 */
public class Personne {

    /*
    @var byte age : Age de la personne courante
    * */
    private byte age;

    /*
    @var string nom : nom de la personne courante
    * */
    private String nom;

    /*
    @var string prénom : prénom de la personne courante
    * */
    private String prenom;

    /*
    @var contructeur
    * */
    public Personne(){
        this.age = 18;
        this.nom = "Le Fantôme";
        this.prenom = "Casper";
    }

    /*
  @var contructeur
  * */
    public Personne(int age, String nom, String prenom){
        this.age = (byte) age;
        this.nom = nom;
        this.prenom = prenom;

    }

    /*
    Définit l'age de la personne
    @param age
    * */
    public void setAge(byte age){
        this.age = age;

    }

    public byte getAge(){
        return this.age;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public String getNom(){
        return this.nom;
    }

    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public String getPrenom(){
        return this.prenom;
    }

    /*
    * Getter et setter plus simple comme méthode !
    * Permettant le chaînage de méthode
    * */


    public Personne nom(String nom){
        this.nom = nom;
        return this;
    }

    public String nom(){
        return this.nom;
    }

    public Personne prenom(String prenom){
        this.prenom = prenom;
        return this;
    }

    public String prenom(){
        return this.prenom;
    }

    public Personne age(int age){
        this.age = (byte) age;
        return this;

    }

    public byte age(){
        return this.age;
    }

    /*
       * Getter et setter plus simple comme méthode !
       * PAS de chaînage le chaînage de méthode
       * */

//    public void age(byte age){
//        this.age = age;
//
//    }
//
//    public byte age(){
//        return this.age;
//    }
//
//    public void nom(String nom){
//        this.nom = nom;
//    }
//
//    public String nom(){
//        return this.nom;
//    }
//
//    public void prenom(String prenom){
//        this.prenom = prenom;
//    }
//
//    public String prenom(){
//        return this.prenom;
//    }



}
