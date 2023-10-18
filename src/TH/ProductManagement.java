package TH;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    static Scanner scanner = new Scanner(System.in);

    public static List<Catalog> catalogs  = new ArrayList<>();
    public static List<Product> products = new ArrayList<>();
    static {
        catalogs.add(new Catalog("Quần áo nữ", 4, "Toàn hot mới nhập từ Taobao", true));
        catalogs.add(new Catalog("Quần áo nam", 3, "Toàn mới về nhiều mẫu", true));
        catalogs.add( new Catalog("Trang sức nữ", 4, "Được thiết kết từ những thợ thủ công hàng đầu", true));
    }
    static {
        products.add(new Product("Áo dài tay", "Hàng Taobao", "Đẹp khỏi chê", catalogs.get(0),40000, 49000, true));
        products.add(new Product("Vòng cổ hoa hồng", "Trang sức", "Wowww đẹp quá", catalogs.get(2),200000, 260000, true));
        products.add(new Product("Váy công chúa", "Hàng Taobao", "Vừa đẹp, vừa rẻ", catalogs.get(0),60000, 69000, false));
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("----------Danh mục------------");
            showAllCatalog();
            System.out.println("----------Danh mục sản phẩm------------");
            showAllProduct();
            System.out.println("-----------Product Management------------");
            System.out.println("-----------Danh mục------------");
            System.out.println("1. Thêm danh mục sản phẩm");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Sắp xếp sản phẩm theo giá tăng dần");
            System.out.println("4. Tìm kiếm sản phẩm theo danh mục sản phẩm ");
            System.out.println("5. Thoát");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    addCatalog();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    sortProduct();
                    break;
                case 4:
                    findProduct();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }while (true);
    }
    private static void showAllCatalog(){
        for (int i = 0; i < catalogs.size(); i++) {
            catalogs.get(i).displayData();
        }
        System.out.println("---------------------------------");
    }
    private static void showAllProduct(){
        for (int i = 0; i < products.size(); i++) {
            products.get(i).displayData();
        }
        System.out.println("---------------------------------");
    }
    private static void addCatalog() {
        Catalog catalog = new Catalog();
        catalog.inputData(catalogs);
        catalogs.add(catalog);
        System.out.println("----------Thêm mới thành công----------");
    }

    private static void addProduct() {

    }

    private static void sortProduct() {
    }

    private static void findProduct() {
    }

}
