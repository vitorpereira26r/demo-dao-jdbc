import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Department dep1 = new Department(1, "Books");

        Seller seller1 = new Seller(21, "Bob", "bob@gmail.com", new Date(), 2000.0, dep1);


        System.out.println(seller1);
    }
}