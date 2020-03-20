package pglp;

import org.junit.Test;
import pglp.Vendeur;

import static org.junit.Assert.*;

public class VendeurTest {

    @Test
    public void setCommission() {
        Vendeur v1=new Vendeur("v1","add3",1500,2019,0);
        v1.setCommission(500);
        Assert.assertTrue(500.0==v1.getCommission());
    }

    @Test
    public void calculSalaire() {
        Vendeur v1=new Vendeur("v1","add3",1500,2019,200);
        Assert.assertTrue(1720.0==v1.calculSalaire());
    }
}