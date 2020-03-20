package pglp;

import java.util.Calendar;

/**
 *
 */
public class Employe extends Salarie {
    /**
     *
      * @param nom
     * @param adresse
     * @param base
     * @param dateEmbauche
     */
    public Employe(String nom, String adresse, double base, int dateEmbauche) {
        super(nom, adresse, base, dateEmbauche);
    }

    @Override
    public double calculSalaire() {
        Calendar c = Calendar.getInstance();
        int anneeNow = c.get(Calendar.YEAR);
        return base+(anneeNow-anneeEmbauche)*20;

    }
}
