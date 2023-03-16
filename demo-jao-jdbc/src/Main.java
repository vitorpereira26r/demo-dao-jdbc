import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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

        System.out.println("\n=== TEST 4 : seller insert =====");
        Seller seller2 = new Seller(null, "Dave", "dave@gmail.com", new Date(), 2800.0, new Department(2, null));
        sellerDao.insert(seller2);
        System.out.println("Inserted! New Id = " + seller2.getId());

        System.out.println("\n=== TEST 5 : seller update =====");
        Seller seller3 = sellerDao.findById(1);
        seller3.setName("Martha Wayne");
        sellerDao.update(seller3);
        System.out.println("Update completed!");

        System.out.println("\n=== TEST 6 : seller delete =====");
        System.out.print("Enter the id for delete test: ");
        int idForDelete = sc.nextInt();
        sellerDao.deleteById(idForDelete);
        System.out.println("Delete completed!");

        sc.close();
    }
}