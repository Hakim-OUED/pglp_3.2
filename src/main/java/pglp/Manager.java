package pglp;

import java.util.ArrayList;
import java.util.Calendar;

public class Manager extends Salarie {

    public ArrayList<Salarie> subalterne;
    public Manager(String nom, String adresse, double base, int dateEmbauche) {
        super(nom, adresse, base, dateEmbauche);
        subalterne = new ArrayList<Salarie>();
    }

    @Override
    public double calculSalaire() {
        Calendar c = Calendar.getInstance();
        int anneeNow = c.get(Calendar.YEAR);
        return base+(anneeNow-anneeEmbauche)*20 + (100*subalterne.size());
    }
}
