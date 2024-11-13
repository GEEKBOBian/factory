public class factory {
    //made a variable of type string
    String nameOffactory;

    //made variable of type int aka whole number
    int yearFounded;

    //made a var of type boolean aka true/false
    boolean inUse;


    public static void main(String[] args) {
        new factory();

    }

    public factory() {
        nameOffactory = "pumpkin factory";
        yearFounded = 2007;
        inUse = false;
        System.out.println(nameOffactory + " was founded in the year " + yearFounded);
        pumpkin spookly = new pumpkin("triangle", "blue", 100, true);
        System.out.println("spookly's info");
        spookly.printInfo();
        System.out.println();
        pumpkin boo = new pumpkin("deformed", "orange", 20, false);
        System.out.println("boo's info");
        boo.printInfo();
        System.out.println();
        pumpkin ghost = new pumpkin("destroyed", "brown", 58, false);
        System.out.println("ghost's info");
        ghost.printInfo();
        System.out.println();
        pumpkin casper = new pumpkin();
        System.out.println("casper's info");
        casper.printInfo();


        for (int x = 0; x < 10; x++) {
            System.out.println("pumpkin number " + x);

            pumpkin average = new pumpkin();
            average.size = (int)(Math.random()*100);
            if (average.size > 50) {
                average.isHalloween = true;
            }
            average.printInfo();


        }
        System.out.println();
        System.out.println("factory aquired by a cookie company");
        System.out.println("now our factory makes cookies and pumpkins");
        nameOffactory = "P.C. Factory";
        System.out.println(nameOffactory);
        cookie tasty = new cookie("chocolate chip", "$5.00", 10);
        System.out.println("tasty's info");
        tasty.printInfo();
        System.out.println();




    }





    }



