package program;


import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Departament;
import model.entities.Seller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DB.getConnection();


        SellerDao sd = DaoFactory.createSellerDao();

        System.out.print("Digite um id:");
        int idById = sc.nextInt();
        Seller obj = sd.findById(idById);
        System.out.println("findById: "+ obj);

        System.out.println("====================================================================================================");

        System.out.print("Digite um id de departamento que você deseja selecionar: ");
        int idByDep = sc.nextInt();
        Departament dep = new Departament(idByDep,null);
        List<Seller> list = sd.findByDepartament(dep);
        for (Seller sl : list){
            System.out.println(sl);
        }

        System.out.println("====================================================================================================");



        DB.closeConnection();
    }
}