package metier;

import dao.IDao;
import dao.ImplDao;

public class MetierImpl implements IMetier{
    private IDao dao;//Couplsge faible
    @Override
    public double calcul() {
        int data= dao.getData();
        double res=data*12.5;
        return res;
    }

    public IDao getDao() {
        return dao;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
