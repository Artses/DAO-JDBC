package program;


import db.DB;
import model.entities.Departament;

public class Main {
    public static void main(String[] args) {

        DB.getConnection();
        DB.closeConnection();

        Departament obj = new Departament(1,"books");

        System.out.println(obj);

    }
}