package presentation;

import dao.IDao;
import dao.ImplDao;
import dao.ImplDao2;
import metier.IMetier;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        ImplDao2 dao=new ImplDao2();//Instanciation Statique
        MetierImpl metier=new MetierImpl();
        metier.setDao(dao);//Injection des dependances
        System.out.println(metier.calcul());

    }
}
