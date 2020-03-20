package pglp;

import org.junit.Test;
import pglp.Comptabilite;
import pglp.Employe;
import pglp.Vendeur;

import static org.junit.Assert.*;

public class ComptabiliteTest {

    @Test
    public void totalSalaire() {
        Employe emp1 = new Employe("nom1","add1",1500,2019);
        Vendeur v1=new Vendeur("v1","add3",1500,2019,200);
        Employe emp2 = new Employe("nom1","add1",1500,2020);
        Comptabilite compta = new Comptabilite();
        compta.salarie.add(emp1);
        compta.salarie.add(v1);
        compta.salarie.add(emp2);

        Assert.assertTrue(4740.0==compta.totalSalaire());
    }
}