public class cookie {
    int size = 10;
    String type = "plain";
    String price = "$2.00";

    public cookie(String pType, String pPrice, int pSize) {
        System.out.println("making a pumpkin");
        size = pSize;
        type = (pType);
        price = (pPrice);



    }

    public cookie() {
        size = 10;
        type = "plain";
        price = "$2.00";
    }

    public void printInfo() {
        System.out.println(type);
        System.out.println("price: " + price);
        System.out.println("size: " + size);
        //System.out.println("changed size: " + size);


    }
}
