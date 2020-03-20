package pglp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import pglp.Employe;

public class EmployeTest
{



    @Test
    public void calculSalaire() {
       Employe emp1 = new Employe("nom1","add1",1500,2019);
        Assert.assertTrue(1520.0==emp1.calculSalaire());


    }
}
