
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mycom
 */
public class HW1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        int Income;
        int TaxRate;

        int[] intIncomeRange = new int[4];
        int[] intTaxRate = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Please enter income and tax rate in tax bracket1 :");
            intIncomeRange[i] = scan.nextInt();
            intTaxRate[i] = scan.nextInt();
            System.out.println("IncomeRange : " + intIncomeRange[i]);
            System.out.println("TaxRate : " + intTaxRate[i]);
        }
        System.out.print("Please enter tax rate if income > " + intIncomeRange[3] + " : ");
        int intMaxTaxRate;
        intMaxTaxRate = scan.nextInt();
        System.out.print("Please enter income: ");
        Income = scan.nextInt();

        int total = 0;
        if (Income > intIncomeRange[0]) {
            if (Income > intIncomeRange[1]) {
                if (Income > intIncomeRange[2]) {
                    if (Income > intIncomeRange[3]) {

                        System.out.println("0 - " + intIncomeRange[0] + " you  pay 0 baht.");

                        System.out.print((intIncomeRange[0] + 1) + " - " + intIncomeRange[1] + " you  pay ");
                        System.out.print((intIncomeRange[1] - intIncomeRange[0]) * intTaxRate[1] / 100);
                        System.out.println(" baht.");
                        total += (intIncomeRange[1] - intIncomeRange[0]) * intTaxRate[1] / 100;

                        System.out.print((intIncomeRange[1] + 1) + " - " + intIncomeRange[2] + " you  pay ");
                        System.out.print((intIncomeRange[2] - intIncomeRange[1]) * intTaxRate[2] / 100);
                        System.out.println(" baht.");
                        total += (intIncomeRange[2] - intIncomeRange[1]) * intTaxRate[2] / 100;

                        System.out.print((intIncomeRange[2] + 1) + " - " + intIncomeRange[3] + " you  pay ");
                        System.out.print((intIncomeRange[3] - intIncomeRange[2]) * intTaxRate[3] / 100);
                        System.out.println(" baht.");
                        total += (intIncomeRange[3] - intIncomeRange[2]) * intTaxRate[3] / 100;

                        System.out.print((intIncomeRange[3] + 1) + " - " + Income + " you  pay ");
                        System.out.print((Income - intIncomeRange[3]) * intMaxTaxRate / 100);
                        System.out.println(" baht.");
                        total += (Income - intIncomeRange[3]) * intMaxTaxRate / 100;

                    } else {
                        System.out.println("0 - " + intIncomeRange[0] + " you  pay 0 baht.");
                        System.out.print((intIncomeRange[0] + 1) + " - " + intIncomeRange[1] + " you  pay ");
                        System.out.print((intIncomeRange[1] - intIncomeRange[0]) * intTaxRate[1] / 100);
                        System.out.println(" baht.");
                        total += (intIncomeRange[1] - intIncomeRange[0]) * intTaxRate[1] / 100;
                        System.out.print((intIncomeRange[1] + 1) + " - " + intIncomeRange[2] + " you  pay ");
                        System.out.print((intIncomeRange[2] - intIncomeRange[1]) * intTaxRate[2] / 100);
                        System.out.println(" baht.");
                        total += (intIncomeRange[2] - intIncomeRange[1]) * intTaxRate[2] / 100;
                        System.out.print((intIncomeRange[2] + 1) + " - " + Income + " you  pay ");
                        System.out.print((Income - intIncomeRange[2]) * intTaxRate[3] / 100);
                        System.out.println(" baht.");
                        total += (Income - intIncomeRange[2]) * intTaxRate[3] / 100;
                    }
                } else {
                    System.out.println("0 - " + intIncomeRange[0] + " you  pay 0 baht.");
                    System.out.print((intIncomeRange[0] + 1) + " - " + intIncomeRange[1] + " you  pay ");
                    System.out.print((intIncomeRange[1] - intIncomeRange[0]) * intTaxRate[1] / 100);
                    System.out.println(" baht.");
                    total += (intIncomeRange[1] - intIncomeRange[0]) * intTaxRate[1] / 100;
                    System.out.print((intIncomeRange[1] + 1) + " - " + Income + " you  pay ");
                    System.out.print((Income - intIncomeRange[1]) * intTaxRate[2] / 100);
                    System.out.println(" baht.");
                    total += (Income - intIncomeRange[1]) * intTaxRate[2] / 100;

                }

            } else {
                System.out.println("0 - " + intIncomeRange[0] + " you  pay 0 baht.");

                System.out.print((intIncomeRange[0] + 1) + " - " + intIncomeRange[1] + " you  pay ");
                System.out.print((Income - intIncomeRange[0]) * intTaxRate[1] / 100);
                System.out.println(" baht.");
                total += (Income - intIncomeRange[0]) * intTaxRate[1] / 100;
            }

        } else {
            System.out.println("0 - " + intIncomeRange[0] + " you  pay 0 baht.");
        }

        System.out.println("Total Tax = " + total);
    }

    }
    

