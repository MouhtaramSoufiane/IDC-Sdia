package presentation;

import dao.IDao;
import dao.ImplDao2;
import metier.IMetier;
import metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
         //ImplDao2 dao=new ImplDao2();
//        Scanner scanner=new Scanner(new File("configue.txt"));
        System.out.println("Donner moi la clase dao :");
        Scanner scanner=new Scanner(System.in);
        String daoClasseName=scanner.nextLine();
        Class cdao=Class.forName(daoClasseName);//charger la classe cdao dans la memmoire
        IDao dao=(IDao)cdao.getConstructor().newInstance();//creation un objet de la classe cdao ==> new ImplDao()






         //MetierImpl metier=new MetierImpl();

        System.out.println("Donner moi la clase metier :");
//        String metierClasseName=scanner.nextLine();
        String metierClasseName=scanner.nextLine();
        Class cmetier=Class.forName(metierClasseName);
        IMetier metier=(IMetier) cmetier.getConstructor().newInstance();

         //metier.setDao(dao);
        Method setDao=cmetier.getDeclaredMethod("setDao",IDao.class);
        setDao.invoke(metier,dao);//Injection des dependances dynamiquement //invoke : executer

        System.out.println("Resu:"+metier.calcul());
    }


}
