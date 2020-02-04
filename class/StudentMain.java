public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student("Dennis", 95, "AP Lang");
        Student s2 = new Student("Nick", 90, "Spanish");
        Student s3 = new Student("Sam", 85, "Pre-Calc");
        System.out.println(s1);
        System.out.println(s2.getName());
        System.out.println(s3.getGPA());
        s1.setName("Dennis Dayan");
        s2.setGPA(95);
        s1.sayHello(s3);
        Student s4 = new Student("Orean", 100, "Computer Science");
        Student s5 = new Student("Max", 105, "Algebra 2");
        System.out.println(s4);
        System.out.println(s5.getName());
        System.out.println(s5.getFavClass());
        s1.sayHello(s1);
        Student s6 = new Student();
        System.out.println(s6);
        s6.setName("Watson");
        s6.setGPA(999);
        s6.setFavClass("Computer Science");
        System.out.println(s6);
        Student s7 = new Student("Dustin");
        System.out.println(s7);
        s7.setGPA(150);
        s7.setFavClass("Physics");
        System.out.println(s7);
    }
}
