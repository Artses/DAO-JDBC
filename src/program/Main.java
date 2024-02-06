package program;


import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Departament;

public class Main {
    public static void main(String[] args) {

        DB.getConnection();
        DB.closeConnection();

        SellerDao sd = DaoFactory.createSellerDao();
        Departament obj = new Departament(1,"books");

        System.out.println(obj);

    }
}