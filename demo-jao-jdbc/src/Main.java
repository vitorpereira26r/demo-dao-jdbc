import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Main {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1 : seller findById =====");
        Seller seller1 = sellerDao.findById(3);

        System.out.println(seller1);
    }
}