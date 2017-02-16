/**
 * Created by stephanie on 13/02/2017
 *
 *
 */

public class Hello {

    public static void main(String[] args){
        /**
         * Point d'entrée dans l'application Hello
         * @param args Tableau de chaîne de caractères String[]
         * @return void Pas de valeur de retour
         */

        /**
         *
         * PHP : $nom = $args[0]; echo substr($nom,0,1);
         */

        /**
         * System est une classe de la librairie standard Java
         * out est un attribut de la classe System
         * println() est une méthode de l'objet référencé par "out"
         */

//    String nom = args[0];
//
//    System.out.println("Hello Java, bonjour " + nom);

        String nom;

        if(args.length > 0)
            nom = args[0];


        /**
         * Types numériques :
         * byte : Entier signé compris entre -128 et +127
         * short : Entier signé compris entre -32 768 et + 32 767
         * int : Entier signé compris entre - 2 147 483 648 et + 2 147 483 647
         * float : Nombre à virgule flottante (32 bits)
         * double : Nombre à virgule flottant (64 bits)
         */
        byte age;
        age =35;

        /**
         * boolean
         *  peut prendre une valeur vraie ou fausse
         *
         * */

        boolean majeur = true;


        /**
         *
         *
         *
         */
//    String message = "Hello ";
//
//    if(age > 44){
//
//      System.out.println(message + "Grand Java vous avez " + age + " ans");
//
//    }else{
//
//      System.out.println(message + "Petit Java " + age + " ans");
//    }



      /*
      * C'est un caractère unique  ... qui peut être aussi un caractère Unicode
      * */

//      char euro = '\u20ac';
//      if(majeur){
//        System.out.println("Hello Grand Java ");
//      }else{
//        System.out.println("Hello Petit Java ");
//      }
//
//      System.out.println("Facile de définir le signe € avec un Unicode : " + euro);


        /**
         * Chaîne à afficher au final...
         * Boite modale
         * Package : java.swing. * (package "graphique" standard de java
         * Type : JOptionPane=> Classe spécifique de ce package
         *
         */
        String chaineFinale = "Hello "; // Parce que ça commencera toujours par Hello


        if(age > 18){
            majeur = true;
            chaineFinale += "Grand ";
        } else {
            majeur = false;
            chaineFinale += "Petit ";
        }

        chaineFinale += "Java. Vous avez : " + age + " ans";

        javax.swing.JOptionPane.showMessageDialog(null, chaineFinale);








    }





}


