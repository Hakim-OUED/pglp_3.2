package pglp_3;

import java.util.ArrayList;

public class Comptabilite {
    public ArrayList<Salarie> salarie;
    Comptabilite(){
        salarie=new ArrayList<Salarie>();
    }



    public double totalSalaire(){
        return salarie.stream().mapToDouble(Salarie::calculSalaire).sum();
    }
}
