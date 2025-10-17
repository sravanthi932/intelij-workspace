package basic_programming;

public class Welcome {
    public static final double CM_PER_INCH = 2.54;
    public static void main(String[] args){
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: "
                + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
//        final double CM_PER_INCH = 2.54;
//        double paperWidth = 8.5;
//        double paperHeight = 11;
//        System.out.println("Paper size in centimeters: "
//                + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
//        String greeting = "Welcome to java";
//        System.out.print(greeting);
//        for (int i=0; i<greeting.length(); i++)
//            System.out.print("=");
//            System.out.println();

    }
}
