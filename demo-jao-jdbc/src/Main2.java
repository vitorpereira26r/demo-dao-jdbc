import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1 : department findById =====");
        Department department1 = departmentDao.findById(3);
        System.out.println(department1);


        System.out.println("\n=== TEST 2 : seller findAll =====");
        List<Department> list2 = departmentDao.findAll();
        for(Department d : list2){
            System.out.println(d);
        }

        System.out.println("\n=== TEST 3 : department insert =====");
        Department department2 = new Department(null, "dp2");
        departmentDao.insert(department2);
        System.out.println("Inserted! New Id = " + department2.getId());

        System.out.println("\n=== TEST 4 : department update =====");
        Department department3 = departmentDao.findById(1);
        department3.setName("Martha Wayne");
        departmentDao.update(department3);
        System.out.println("Update completed!");

        System.out.println("\n=== TEST 5 : department delete =====");
        System.out.print("Enter the id for delete test: ");
        int idForDelete = sc.nextInt();
        departmentDao.deleteById(idForDelete);
        System.out.println("Delete completed!");

        sc.close();
    }
}
