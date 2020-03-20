package pglp;


import java.util.*;
import java.text.SimpleDateFormat;

abstract class Salarie {
    private final String nom;
    private final String adresse;
    protected double base;
    protected int anneeEmbauche;

    public Salarie(String nom, String adresse, double base, int dateEmbauche) {
        this.nom = nom;
        this.adresse= adresse;
        this.base=base;
        this.anneeEmbauche=dateEmbauche;
    }

    /*Date d=new Date();

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
    String s = sdf.format(d);
    java.sql.Date.*/

    public abstract double calculSalaire();
}
