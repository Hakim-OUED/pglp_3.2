package pglp;

import org.junit.Test;
import pglp.Employe;
import pglp.Manager;
import pglp.Vendeur;

import static org.junit.Assert.*;

public class ManagerTest {

    @Test
    public void calculSalaire() {
        Employe emp1 = new Employe("nom1","add1",1500,2019);
        Vendeur v1=new Vendeur("v1","add3",1500,2019,200);
        Employe emp2 = new Employe("nom1","add1",1500,2020);
        Manager man = new Manager("managa","add",1500,2019);
        man.subalterne.add(emp1);
        man.subalterne.add(emp2);
        man.subalterne.add(v1);
        Assert.assertEquals(1820.0,man.calculSalaire(),0);
    }
}