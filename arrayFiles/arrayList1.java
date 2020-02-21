// dennis dayan

// Java is the COBOL of our generation





import java.util.ArrayList;

public class arrayList1 {
    static void line(){
        System.out.println("------------------------------------------------------------------------");
    }
    static void searchArrayList(ArrayList arr, String targ) {
        boolean isFound = false;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i).equals(targ)){
                isFound = true;
            }
        }
        if(isFound){
            System.out.println("Target: " + targ + " Found in: " + arr);
        }
        else{
            System.out.println("Not Found");
        }
    }
    static void searchArrayList(ArrayList arr, int targ) {
        boolean isFound = false;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i).equals(targ)){
                isFound = true;
            }
        }
        if(isFound){
            System.out.println("Target: " + targ + " Found in: " + arr);
        }
        else{
            System.out.println("Not Found");
        }
    }


    public static void main(String[] args) {
        line();
        System.out.println("PART 1");
        line();
        ArrayList <String> colcrList = new ArrayList<String>();
        colcrList.add("Orange");
        colcrList.add("Yellow");
        colcrList.add("Blue");
        System.out.println(colcrList.size());
        System.out.println(colcrList.get(2));
        System.out.println(colcrList.indexOf("Orange"));
        line();
        System.out.println("PART 2");
        line();
        for(String i: colcrList){
            System.out.println(i);
        }
        for(int i = 0; i < colcrList.size(); i++){
            System.out.println(colcrList.get(i));
        }
        System.out.println(colcrList);
        line();
        System.out.println("PART 3");
        line();
        colcrList.add(0, "Red");
        System.out.println(colcrList);
        colcrList.set(3, "Green");
        System.out.println(colcrList);
        colcrList.add("Blue");
        colcrList.add("Indigo");
        colcrList.add("Violet");
        colcrList.add("Brown");
        colcrList.add("Black");
        System.out.println(colcrList);
        colcrList.remove("Black");
        System.out.println(colcrList.size());
        System.out.println(colcrList);
        colcrList.remove(7);
        System.out.println(colcrList.size());
        System.out.println(colcrList);
        line();
        System.out.println("PART 4");
        line();
        searchArrayList(colcrList, "Blue");
        searchArrayList(colcrList, "Maroon");
        line();
        System.out.println("PART 5");
        line();
        ArrayList <Integer> numberList = new ArrayList<Integer>();
        numberList.add(47);
        numberList.add(34);
        numberList.add(23);
        numberList.add(8);
        numberList.add(54);
        numberList.add(98);
        numberList.add(13);
        numberList.add(64);
        numberList.add(35);
        numberList.add(84);
        System.out.println(numberList);
        line();
        for(int i = 0; i < numberList.size(); i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }

        line();
        for(int i = 0; i < numberList.size(); i++){
            if(i%2 == 1){
                System.out.println(i);
            }
        }
        line();
        for(int i = 0; i <numberList.size(); i++){
            if(numberList.get(i)%2 == 0){
                System.out.println(numberList.get(i));
            }
        }
        line();
        for(int i = 0; i <numberList.size(); i++){
            if(numberList.get(i)%2 == 1){
                System.out.println(numberList.get(i));
            }
        }
        line();
        searchArrayList(numberList, 10);
        line();
        searchArrayList(numberList, 20);
        line();
        searchArrayList(numberList, 30);
        line();
        searchArrayList(numberList, 32); // my true favorite
        line();
        numberList.remove(1);
        numberList.remove(2);
        numberList.remove(3);
        numberList.remove(4);
        numberList.remove(5);
        System.out.println(numberList);
        line();
        System.out.println("PART 6");
        line();
        ArrayList <Student> studentList = new ArrayList<Student>();
        Student dennis = new Student("Dennis");
        Student nick = new Student("Nick");
        Student matt = new Student("Matt");
        Student layne = new Student("Layne");
        Student vincent = new Student("Vincent");
        studentList.add(dennis);
        studentList.add(nick);
        studentList.add(matt);
        studentList.add(layne);
        studentList.add(vincent);
        for(int i = 0; i < studentList.size(); i++){
            studentList.get(i).sayHello();
        }
        line();
        System.out.println("THE END!");
        // thats all folks!
        //.__(.)<
        // \___)
        // a duck courtesy of the amazon page source












    }


}
