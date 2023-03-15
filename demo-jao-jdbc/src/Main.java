import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1 : seller findById =====");
        Seller seller1 = sellerDao.findById(3);
        System.out.println(seller1);

        System.out.println("\n=== TEST 2 : seller findByDepartment =====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for(Seller s : list){
            System.out.println(s);
        }

        System.out.println("\n=== TEST 3 : seller findAll =====");
        List<Seller> list2 = sellerDao.findAll();
        for(Seller s : list2){
            System.out.println(s);
        }
    }
}