public class pumpkin {
    //variables: big, color, shape, halloween pumpkin
    int size;
    String color;
    String shape;
    boolean isHalloween;

    public pumpkin(String pShape, String pColor, int pSize, boolean pIsHalloween) {
        System.out.println("making a pumpkin");
        size = pSize;
        color = (pColor);
        shape = (pShape);
        isHalloween = pIsHalloween;


    }

    public pumpkin() {
        size = 10;
        color = "orange";
        shape = "regular";
        isHalloween = false;
    }

    public void printInfo() {
        if (isHalloween) {
            System.out.println("i will be used for halloween");
        }
        else {
            System.out.println("i am a regular pumpkin");
        }

        System.out.println(color);
        System.out.println(shape);
        System.out.println("size: " + size);
        //System.out.println("changed size: " + size);




    }


}
