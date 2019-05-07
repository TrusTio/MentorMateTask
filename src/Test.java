/**
 * Solution for the "Rockie to Rockstar Intern Task"
 * @author Erkan Myumyunov
 * @version 1.0
 * @since 07-05-2019
 */
public class Test {
    public static void main(String [] args) {

        LogoBuilder testLogoBuilder = new LogoBuilder(7);
        testLogoBuilder.printLogo();

        // You can create another object using the second constructor to print it with different symbols
        LogoBuilder testLogoBuilder2 = new LogoBuilder(5,"-","M");
        testLogoBuilder2.printLogo();

        //Or just set an existing object and set different parameters for it
        testLogoBuilder.setLogoSize(9);
        testLogoBuilder.setBackgroundSymbol("@");
        testLogoBuilder.setLogoSymbol("+");
        testLogoBuilder.printLogo();

        //trying if it doesn't meet the criteria
        testLogoBuilder.setLogoSize(6);
        testLogoBuilder.printLogo();
    }

}
