public class Main {
    public static void main(String[] args) {
        double intitialB = 5000;
        double monthOne = 0;
        double monthTwo = 0;
        monthOne = intitialB * .17;
        System.out.println("The amount of interest after month one is " + monthOne);
        monthTwo = intitialB * .17 * 2;
        System.out.println("The amount of interest after month two is " + monthTwo);
    }
}