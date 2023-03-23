package dao;

public class ImplDao2 implements IDao{
    @Override
    public int getData() {
        System.out.println("version web services");
        int data=18;
        return data;
    }
}
