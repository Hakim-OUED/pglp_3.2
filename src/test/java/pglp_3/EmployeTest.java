package pglp_3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pglp_3.Employe;

public class EmployeTest
{



    @Test
    public void calculSalaire() {
       Employe emp1 = new Employe("nom1","add1",1500,2019);
        assertTrue(1520.0==emp1.calculSalaire());


    }
}
