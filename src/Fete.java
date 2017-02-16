/**
 *
 * Created by stephanie on 14/02/2017.
 */


public class Fete {



    public static void main(String[] args){


        /*
         * On définit deux variables de type Personne (@see Personne.java)
         * invite_[n] sont des références de type Personne et sont une instance d'un objet Personne
         */
        Personne invite_1 = new Personne();
        Personne invite_2 = new Personne();
        Personne invite_3 = new Personne();
        Personne invite_4 = new Personne();

        /**
         * Définit les attributs pour invite_1
         * Casting de variable : Permet de convertir un type en un autre type compatible.
         * Par ex. : 48 est considéré par défaut comme étant un entier, la méthode setAge() attend un byte,
         * on doit donc "caster" la valeur en (byte) pour qu'elle soit acceptée dans la méthode.
         */

        invite_1.setAge((byte) 45);
        invite_1.setNom("CAUMONT");
        invite_1.setPrenom("Stéphanie");


        invite_2.setAge((byte) 35);
        invite_2.setNom("AUBERT");
        invite_2.setPrenom("Jean-Luc");

        invite_3.age((byte) 25);
        invite_3.nom("DOE");
        invite_3.prenom("John");

        invite_4
                .age(25)
                .nom("DASH")
                .prenom("Marie");

        // avec un constructeur
        Personne casper  = new Personne();

        // avec un autre constructeur
        Personne bond  = new Personne(77, "Bond","James");
        // on surcharge
        bond.nom("Zorro Bond");

        // Utilisons les getters pour afficher une belle boite de dialogue
        String messageFinal;

        messageFinal = "Bienvenue à ma fête ! \n Les invités sont : ";

        messageFinal+=invite_1.getPrenom() + " " + invite_1.getNom() + ", " ;
        messageFinal+=invite_2.getPrenom() + " " + invite_2.getNom() + ", ";
        messageFinal+=invite_3.prenom() + " " + invite_3.nom() + ", ";
        messageFinal+=invite_4.prenom() + " " + invite_4.nom() + ", ";
        messageFinal+=casper.prenom() + " " + casper.nom() + ", ";
        messageFinal+=bond.prenom() + " " + bond.nom();

        javax.swing.JOptionPane.showMessageDialog(null, messageFinal);
        System.out.println( messageFinal);

    }



}
