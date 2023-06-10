import java.util.Scanner;

public class Taxes {
    static void print(String x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        // create a variable of the Scanner object type;
        Scanner input = new Scanner(System.in);
        print("Enter filing status: eg: 0; \n Note: 0 for single, \n 1 for married (jointly or qualified widow(er)");
        int filing = input.nextInt();
        print("Enter taxable income");
        double income = input.nextDouble();
        double tax = 0;

        // alternate path of execution.
        if(filing == 0){
            if(income < 8350) {
                tax = (income * 10) / 100;
            }else if(income <= 33_950) {
                tax = 8350 * 0.10 + ((income - 8350) * 0.15);
            }else if(income <= 82_250)  {
                tax = 8350 * 0.10 + ((33_950 - 8350) * 0.15) + (income - 33_950) * 0.25;
            }else if(income <=  171_550) {
                tax = 8350 * 0.10 + ((33_950 - 8350) * 0.15) + (82_250 - 33_950) * 0.25 + (income - 82_250) * 0.28;
            }else if(income <= 372_950) {
                tax = 8350 * 0.10 + ((33_950 - 8350) * 0.15) + (82_250 - 33_950) * 0.25 + (171_550 - 82_250) * 0.28 + (income - 171_550) * 0.33;
            }else {
                tax = 8350 * 0.10 + ((33_950 - 8350) * 0.15) + (82_250 - 33_950) * 0.25 + (171_550 - 82_250) * 0.28 + (372_950 - 171_550) * 0.33 + (income - 372_950) * 0.35;
            }
        }else if(filing == 1){
            if(income < 16_700) {
                tax = (income * 10) / 100;
            }else if(income <= 67_900) {
                tax = 16_700* 0.10 + ((income - 16_700) * 0.15);
            }else if(income <= 137_050)  {
                tax = 16_700 * 0.10 + ((67_900 - 16_700) * 0.15) + (income - 67_900) * 0.25;
            }else if(income <=  208_850) {
                tax = 16_700 * 0.10 + ((67_900 - 16_700) * 0.15) + (137_050 - 67_900) * 0.25 + (income - 137_050) * 0.28;
            }else if(income <= 372_950) {
                tax = 16_700 * 0.10 + ((67_900 - 16_700) * 0.15) + (137_050 - 67_900) * 0.25 + (208_850 - 137_050) * 0.28 + (income -  208_850) * 0.33;
            }else {
                tax = 16_700 * 0.10 + ((67_900 - 16_700) * 0.15) + (137_050 - 67_900) * 0.25 + (208_850 - 137_050) * 0.28 + (372_950 - 208_850) * 0.33 + (income - 372_950) * 0.35;
            }
        }else {
            System.exit(1);
        }
    
        // output the result
        print("Your total tax is " + tax);
    }

}
