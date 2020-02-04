import sun.awt.geom.AreaOp;

public class Student {
    private String name;
    private int GPA;
    private String favClass;
    public Student(String name, int GPA){
        this.name = name;
        this.GPA = GPA;
    }
    public Student(String name, int GPA, String favClass){
        this.name = name;
        this.GPA = GPA;
        this.favClass = favClass;
    }
    public Student(){

    }
    public Student(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getGPA(){
        return this.GPA;
    }
    public void setGPA(int GPA){
        this.GPA = GPA;
    }
    public void sayHello(Student s1){
        System.out.println("Hello, " + s1.getName());
        if(s1.equals(this)){
            System.out.println("Saying hello to yourself is weird...");
        }
    }
    @Override
    public String toString(){
        return "Name: " + getName() + ", GPA: " + getGPA() + ", Favorite Class: " + getFavClass();
    }

    public String getFavClass(){
        return this.favClass;
    }
    public void setFavClass(String favClass){
        this.favClass = favClass;
    }

    public void drive(Car car, int miles){
        if(miles > 0){
            System.out.println("Have a good drive, " + this.getName());
            car.setMiles(car.getMiles() + miles);
            System.out.println("the " + car.getModel() + " drove " + car.getMiles() + " miles");
        }
        else{
            System.out.println("You cannot drive negative miles");
            car.setMiles(car.getMiles());
        }
    }



}
