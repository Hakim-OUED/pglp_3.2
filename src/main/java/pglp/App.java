package pglp;

public class App {
    public static void main(String args[]){
        Employe emp1 = new Employe("nom1","add1",1500,2019);
        Vendeur v1=new Vendeur("v1","add3",1500,2019,200);
        Employe emp2 = new Employe("nom1","add1",1500,2020);
        System.out.println(emp1.calculSalaire());
        System.out.println(emp2.calculSalaire());
        System.out.println(v1.calculSalaire());
        Comptabilite compta = new Comptabilite();
        compta.salarie.add(emp1);
        compta.salarie.add(v1);
        compta.salarie.add(emp2);


        Manager man = new Manager("managa","add",1500,2019);
        man.subalterne.add(emp1);
        man.subalterne.add(emp2);
        man.subalterne.add(v1);
        System.out.println(man.calculSalaire());

        compta.salarie.add(man);

        System.out.println(compta.totalSalaire());
    }
}
