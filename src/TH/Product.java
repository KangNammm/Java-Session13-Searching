package TH;

import java.util.List;
import java.util.Scanner;

public class Product implements IShop {
    private int productId;
    private String productName;
    private String title;
    private String descriptions;
    private Catalog catalog;
    private float importPrice;
    private float exportPrice;
    private boolean productStatus;
    static int count = 1;
    public Product(){
        this.productId = count++;
    }

    public Product(String productName, String title, String descriptions, Catalog catalog, float importPrice, float exportPrice, boolean productStatus) {
        this.productId = count++;
        this.productName = productName;
        this.title = title;
        this.descriptions = descriptions;
        this.catalog = catalog;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.productStatus = productStatus;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }

    @Override
    public void inputData(List<Catalog> catalogs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm : ");
        String name = scanner.nextLine().trim();
        while (name.isEmpty()){
            System.out.println("Không được để trống");
            name = scanner.nextLine().trim();
        }
        this.productName = name;

        System.out.println("Nhập tiêu đề : ");
        String tit = scanner.nextLine().trim();
        while (tit.isEmpty()){
            System.out.println("Không được để trống");
            tit = scanner.nextLine().trim();
        }
        this.title = tit;

        System.out.println("Nhập mô tả : ");
        String des = scanner.nextLine().trim();
        while (des.isEmpty()){
            System.out.println("Không được để trống");
            des = scanner.nextLine().trim();
        }
        this.descriptions = des;

        System.out.println("Danh sách catalog : ");
        boolean check = true;
        for (int i = 0; i < catalogs.size(); i++) {
            System.out.println((i+1)+" : " + catalogs.get(i).getCatalogName());
        }
        System.out.println("Mời nhập số để chọn : ");
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice >= 1 && choice <= catalogs.size() ){
            this.catalog = catalogs.get(choice - 1 );
        }else {
            System.out.println("Không tìm thấy catalog theo số vừa nhập. Mời thêm catalog mới");
//            catalogs.get(choice + 1).inputData(catalogs);
            return;
        }

        System.out.println("Nhập giá thu vào :");
        float importP = scanner.nextFloat();
        while (importP <= 0) {
            System.out.println("Giá bán ra phải > 0, vui lòng nhập lại :");
            importP = scanner.nextFloat();
        }
        this.importPrice = importP;

        this.exportPrice = this.importPrice *RATE;

        System.out.println("Nhập trạng thái : (true/false)");
        this.productStatus = Boolean.parseBoolean(scanner.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("Product{" +
                "productId: " + productId +
                ", productName: '" + productName + '\'' +
                ", title: '" + title + '\'' +
                ", descriptions: '" + descriptions + '\'' +
                ", catalog: " + catalog.getCatalogName() +
                ", importPrice: " + importPrice +
                ", exportPrice: " + exportPrice +
                ", productStatus: " + (productStatus ? "Đang bán" : "Ngừng bán") +
                '}');
    }
}
