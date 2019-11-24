import java.util.Scanner;
// Dennis Dayan
//IntroClass1.java
public class IntroClass1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Dollar" +
                " Plus, where profits are our priority\n! Due to our CEO cutting our health insurance, everything is $1 dollar today!\n" +
                " Remember, you must purchase 5 items or else you will face the ultimate wrath of the Dollar Plus(TM) Retail Removal Device*\n" +
                " (Dollar Plus (TM) is not responsible for injuries  during a run in with the aforementioned device).");
        String item1 = scan.next();
        int item1int = scan.nextInt();
        String item2 = scan.next();
        int item2int = scan.nextInt();
        String item3 = scan.next();
        int item3int = scan.nextInt();
        String item4 = scan.next();
        int item4int = scan.nextInt();
        String item5 =  scan.next();
        int item5int = scan.nextInt();
        double total = item1int + item2int + item3int + item4int + item5int; //  total number of all items
        double actualtotal = total*1.00; // all items multiplied by 1.00 to get total price for the itemized receipt
        System.out.println("Thank you for shopping today!\n. Your receipt is as follows: You bought\n" + item1int + " " + item1 + "\n" + item2int + " " + item2 + "\n" + item3int + " " + item3 + "\n" + item4int + " " + item4 + "\n" + item5int + " " + item5 + "\n" + " For a total of " + " " + actualtotal);
    }
}

