public class BankMain {
    public static void myLine(){
        System.out.println("------------------------------------------------");
    }
    public static void main(String[] args) {
        Student dennis = new Student("dennis", 95, "Computer Science");
        Student nick = new Student("Nick");
        Student sam = new Student("Sam", 95);
        Student max = new Student();
        System.out.println(dennis.displayBalance());
        myLine();
        System.out.println(nick.displayBalance());
        myLine();
        System.out.println(sam.displayBalance());
        myLine();
        System.out.println(max.displayBalance());
        myLine();
        System.out.println(dennis.displayAccountNum());
        myLine();
        System.out.println(nick.displayAccountNum());
        myLine();
        System.out.println(sam.displayAccountNum());
        myLine();
        System.out.println(max.displayAccountNum());
        myLine();
        System.out.println(dennis.displayBalance());
        myLine();
        System.out.println(nick.displayBalance());
        myLine();
        System.out.println(sam.displayBalance());
        myLine();
        System.out.println(max.displayBalance());
        myLine();
        dennis.deposit(500);
        dennis.deposit(600);
        dennis.deposit(-500);
        dennis.deposit(-600);
        sam.deposit(500);
        sam.deposit(600);
        sam.deposit(-500);
        sam.deposit(-600);
        nick.deposit(500);
        nick.deposit(600);
        nick.deposit(-500);
        nick.deposit(-600);
        max.deposit(500);
        max.deposit(600);
        max.deposit(-500);
        max.deposit(-600);
        System.out.println(dennis.displayBalance());
        myLine();
        System.out.println(nick.displayBalance());
        myLine();
        System.out.println(sam.displayBalance());
        myLine();
        System.out.println(max.displayBalance());
        myLine();
        dennis.withdraw(100);
        dennis.withdraw(200);
        dennis.withdraw(1200);
        dennis.withdraw(-100);
        sam.withdraw(100);
        sam.withdraw(200);
        sam.withdraw(1200);
        sam.withdraw(-100);
        nick.withdraw(100);
        nick.withdraw(200);
        nick.withdraw(1200);
        nick.withdraw(-100);
        max.withdraw(100);
        max.withdraw(200);
        max.withdraw(1200);
        max.withdraw(-100);
        System.out.println(dennis.displayBalance());
        myLine();
        System.out.println(nick.displayBalance());
        myLine();
        System.out.println(sam.displayBalance());
        myLine();
        System.out.println(max.displayBalance());
        myLine();









    }

}
