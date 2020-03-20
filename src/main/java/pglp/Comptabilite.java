package pglp;

import java.util.ArrayList;

/**
 *
 */
public class Comptabilite {
    //ensemble des salarié
    public ArrayList<Salarie> salarie;

    /**
     *
      */
    Comptabilite(){
        salarie=new ArrayList<Salarie>();
    }


    /**
     *
     * @return Total de salaire des salariés recensés
     */
    public double totalSalaire(){
        return salarie.stream().mapToDouble(Salarie::calculSalaire).sum();
    }
}
