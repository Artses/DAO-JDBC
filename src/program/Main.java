package program;


import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Departament;
import model.entities.Seller;

public class Main {
    public static void main(String[] args) {

        DB.getConnection();


        SellerDao sd = DaoFactory.createSellerDao();
        Seller obj = sd.findById(3);

        System.out.println(obj);

        DB.closeConnection();
    }
}