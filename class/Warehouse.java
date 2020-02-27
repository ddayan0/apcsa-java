import java.util.ArrayList;
import java.util.Scanner;
public class Warehouse {
    static ArrayList <Game> gameArrayList = new ArrayList<Game>(); // static arraylist for ease, universal access
    static void print(String field){ //instead of sout, makes code less ugly and more readable
        System.out.println(field);
    } //print method
    static void print(int field){ //overloaded version of print method,for int
        System.out.println(field);
    } //overloaded ^
    static void addProducts(){ // add product function
        Scanner titleScan = new Scanner(System.in); // scanners for each input
        print("Enter game title: "); // prompt
        String title = titleScan.nextLine(); // stores input, all repeated until line 24
        Scanner genreScan = new Scanner(System.in);
        print("Enter genre: ");
        String genre = genreScan.nextLine();
        Scanner priceScan = new Scanner(System.in);
        print("Enter price: ");
        int price = priceScan.nextInt();
        Scanner quantScan = new Scanner(System.in);
        print("Enter quantity: ");
        int quantity = quantScan.nextInt();
        for(int i =0; i < gameArrayList.size(); i++){ // traverses the array to check contents
            if(gameArrayList.get(i).getTitle().equals(title)){ // if the product is already there....
                print("Invalid, game already present. Update quantity or other attributes instead!"); // DON'T ADD!
                menu(); // goes back to main
            }
        }
        gameArrayList.add(new Game(title,genre, price, quantity)); //if a unique product, it creates a new Game object
    }
    static void remProducts(){ // remove products
        boolean isFound = false; // is it found? obviously not (yet) :)
        Scanner remScan = new Scanner(System.in); // scanner for dat fresh user input
        print("What game would you like to remove?: "); // P R O M P T!
        String remTarg = remScan.nextLine(); // puts user input into a string
        for(int i =0; i < gameArrayList.size(); i++){ // traverse dat array
            if(gameArrayList.get(i).getTitle().equals(remTarg)){ // if the game that the user wants to remove actually exists
                isFound = true; // ITS FOUND! (dun dun )
                gameArrayList.remove(i); // removes! (shut up about "suspicious remove" Intellij. i own you
                print("Removed!"); // removes
            }
        }
        if(!isFound){ // if the game is not present
            print("Product not found! "); // nice message :)
        }
    }
    static void searchByTitle(){ // search by title
        boolean isFound = false; // NOT FOUND (yet)
        Scanner titleTarg = new Scanner(System.in); //  new scanner for title
        print("Enter title to search for: "); // prompt
        String targ = titleTarg.nextLine(); // puts stdin into string targ
        for(int i = 0; i < gameArrayList.size(); i++){ // traverses array
            if(gameArrayList.get(i).getTitle().equals(targ)){ // if title is found:
                System.out.println(gameArrayList.get(i)); // print dat stuff
                isFound = true; // is found
            }
        }
        if(!isFound){ // if not found
            print("Product not found! ");
        }
    }
    static void editProduct(){ // edit products attributes
        print("Welcome to the DayanWMS Product Editor");
        print("Options: ");
        print("(1) Change title of product");
        print("(2) Change genre of product");
        print("(3) Change price of product");
        print("(4) Change quantity of product");
        print("(5) Go Back");
        Scanner menuscan = new Scanner(System.in); // take in menu input
        int userinput = menuscan.nextInt(); // stores menu input into userinput
        if(userinput == 1){ // if user selects....
            Scanner titlescan1 = new Scanner(System.in); // takes in title
            print("Enter existing title: ");
            String targ1 = titlescan1.nextLine(); // stores title
            Scanner newtitlescan = new Scanner(System.in); // takes in new title
            print("Enter a new title: ");
            String newtitle = newtitlescan.nextLine(); //stores new title
            boolean isFound = false; //  not found!
            for(int i = 0; i < gameArrayList.size(); i++){ // traverses array
                if(gameArrayList.get(i).getTitle().equals(targ1)){ // if game present
                    isFound = true;
                    gameArrayList.get(i).setTitle(newtitle); // change title to new title
                }
            }
            if(!isFound){ // if not found
                print("Product not found!");
            }
        }
        if(userinput == 2){
            Scanner titlescan1 = new Scanner(System.in);
            print("Enter existing title: ");
            String targ1 = titlescan1.nextLine();
            Scanner newgenrescan = new Scanner(System.in); // takes in new genre
            print("Enter a new genre: ");
            String newgenre = newgenrescan.nextLine(); // stores new genre
            boolean isFound = false;
            for(int i = 0; i < gameArrayList.size(); i++){ //traverses array
                if(gameArrayList.get(i).getTitle().equals(targ1)){ //if title is there
                    isFound = true;
                    gameArrayList.get(i).setGenre(newgenre); // set new genre, with well, the new genre!
                }
            }
            if(!isFound){ //if not found
                print("Product not found!");
            }
        }
        if(userinput == 3){
            Scanner titlescan1 = new Scanner(System.in);
            print("Enter existing title: ");
            String targ1 = titlescan1.nextLine();
            Scanner newpricescan = new Scanner(System.in);
            print("Enter a new price: ");
            int newprice = newpricescan.nextInt(); // takes in new price
            boolean isFound = false;
            for(int i = 0; i < gameArrayList.size(); i++){ //traverses array
                if(gameArrayList.get(i).getTitle().equals(targ1)){ // if game exists...
                    isFound = true;
                    gameArrayList.get(i).setPrice(newprice); //set new price
                }
            }
            if(!isFound){ //if it does not exist..
                print("Product not found!");
            }
        }
        if(userinput == 4){
            Scanner titlescan1 = new Scanner(System.in);
            print("Enter existing title: ");
            String targ1 = titlescan1.nextLine();
            Scanner newqauntscan = new Scanner(System.in);
            print("Enter a new quantity: ");
            int newquant = newqauntscan.nextInt(); // takes in new quantity
            boolean isFound = false;
            for(int i = 0; i < gameArrayList.size(); i++){ // traverses array
                if(gameArrayList.get(i).getTitle().equals(targ1)){ // if game exists...
                    isFound = true;
                    gameArrayList.get(i).setQuantity(newquant); //set quantity to new quantity
                }
            }
            if(!isFound){ // if it does not exist....
                print("Product not found!");
            }
        }
        if(userinput == 5){
            menu(); //go back
        }
    }
    static void listProducts(){ //list products
        for(int i = 0; i < gameArrayList.size(); i++){ //for loop to go through array
            System.out.println(gameArrayList.get(i)); //just print every object out
        }
    }
    static void listByCategory(){
        print("Enter genre: ");
        Scanner usercatscan = new Scanner(System.in);  // takes in user input for genre
        String catscan = usercatscan.nextLine();
        for(int i =0; i <gameArrayList.size(); i++){ // for loop to go through array
            if(gameArrayList.get(i).getGenre().equals(catscan)){ //if a game matches the genre supplied
                System.out.println(gameArrayList.get(i)); // print it
            }
        }
    }
    static void menu(){ // MAIN MENU!
        Scanner menuscan = new Scanner(System.in);
        boolean isExit = false; // has user exited, no.
        while (!isExit){ // could use switch cases instead, but need to research further
            print("Welcome to DayanWMS!"); // menu prompt
            print("Options: ");
            print("(1) Add Products");
            print("(2) Remove Products");
            print("(3) Search for product (by title)");
            print("(4) Edit a products attributes");
            print("(5) List total products");
            print("(6) List products by category");
            print("(8) Exit");
            int userinput = menuscan.nextInt(); // takes in user input
            if(userinput == 8){ //check for input
                isExit = true; //exits
            }
            if(userinput == 1){ // check for input
                addProducts(); // execute method
            }
            if(userinput == 2){
                remProducts();
            }
            if(userinput == 3){
                searchByTitle();
            }
            if(userinput == 4){
                editProduct();
            }
            if(userinput == 5){
                listProducts();
            }
            if(userinput == 6){
                listByCategory();
            }

        }
        if(isExit){
            //exits
        }
    }
    public static void main(String[] args) {
        gameArrayList.add((new Game("Halo", "FPS", 10, 56))); // mand. 20 games
        gameArrayList.add((new Game("Halo 2", "FPS", 30, 32)));
        gameArrayList.add((new Game("Halo 3", "FPS", 45, 231)));
        gameArrayList.add((new Game("Halo 4", "FPS", 75, 560)));
        gameArrayList.add((new Game("C.O.D", "FPS", 75, 500)));
        gameArrayList.add((new Game("Earthbound", "RPG", 54, 12)));
        gameArrayList.add((new Game("Mother 3", "RPG", 32, 9)));
        gameArrayList.add((new Game("Final Fantasy", "RPG", 45, 231)));
        gameArrayList.add((new Game("FF XIV", "RPG", 25, 5600)));
        gameArrayList.add((new Game("FF II", "RPG", 15, 6600)));
        gameArrayList.add((new Game("Terraria", "Sandbox", 25, 12312)));
        gameArrayList.add((new Game("Minecraft", "Sandbox", 29, 32000)));
        gameArrayList.add((new Game("Scribblenauts", "Sandbox", 0, 2311)));
        gameArrayList.add((new Game("Scribblenauts Reloaded", "Sandbox", 0, 50)));
        gameArrayList.add((new Game("Garry's Mod", "Sandbox", 10, 461584)));
        gameArrayList.add((new Game("2048", "Puzzle", 0, 99999)));
        gameArrayList.add((new Game("Candy Crush", "Puzzle", 0, 99999)));
        gameArrayList.add((new Game("Virtual Soduku", "Puzzle", 0, 99999)));
        gameArrayList.add((new Game("Virtual Wordsearch", "Puzzle", 0, 99999)));
        gameArrayList.add((new Game("Minesweeper", "Puzzle", 0, 99999)));
        menu(); // calls to menu
    }
}