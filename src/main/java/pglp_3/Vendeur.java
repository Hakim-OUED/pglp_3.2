package pglp_3;

import java.util.Calendar;

public class Vendeur extends Salarie {

    private double commission;
    public Vendeur(String nom, String adresse, double base, int dateEmbauche, double commission) {
        super(nom, adresse, base, dateEmbauche);
        this.commission=commission;
    }

    public double getCommission() {
        return commission;
    }
    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public double calculSalaire() {
        Calendar c = Calendar.getInstance();
        int anneeNow = c.get(Calendar.YEAR);
        return base+(anneeNow-anneeEmbauche)*20 + this.getCommission();
    }
}
