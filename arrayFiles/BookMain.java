// Dennis Dayan
// i had a huge poetic rambling, yet i removed it
// in the name of memory?
// i think im doing too much C programming


// maybe C is good
// maybe java is better
// no one is certain

public class BookMain {
    public static void line(){
        System.out.println("--------------------");
    }
    public static void main(String[] args) {
        Book wonder = new Book(2015, "Wonder", "Palacio", "Fiction");
        Book CProgramming = new Book(1982, "The C Programming Language", "Ritchie", "Non-Fiction");
        Book intro64bit = new Book(2008, "64 Bit Assembly Language", "Seyfarth", "Non-Fiction");
        Book egosown = new Book(1844, "The Ego amd its Own", "Stirner", "Fiction");
        Book manifesto = new Book(1848, "The Communist Manifesto", "Marx", "Fiction"); // a little divisive, no really good fict or non-fict answer here
        // WE MUST SIEZE THE MEANS OF COMPILING
        // LINKERS OF THE WORLD, UNITE!
        System.out.println(wonder);
        line();
        System.out.println(CProgramming);
        line();
        System.out.println(intro64bit);
        line();
        System.out.println(wonder.getTitle());
        line();
        System.out.println(CProgramming.getTitle());
        line();
        System.out.println(intro64bit.getAuthor());
        line();
        System.out.println(egosown.getAuthor());
        line();
        System.out.println(manifesto.getCopyYear());
        line();
        Book [] bookArray = new Book[10];
        bookArray[0] = wonder;
        bookArray[1] = CProgramming;
        bookArray[2] = intro64bit;
        bookArray[3] = egosown;
        bookArray[4] = manifesto;
        bookArray[5] = new Book(1877, "Anna Karenina", "Tolstoy", "Fiction");
        bookArray[6] = new Book(1856, "Madame Bovary", "Flaubert", "Fiction");
        bookArray[7] = new Book(1869, "War and Peace", "Tolstoy", "Fiction");
        bookArray[8] = new Book(1884, "The Adventures of Huckleberry Finn", "Twain", "Fiction");
        bookArray[9] = new Book(1932, "Stories of Anton Checkhov", "Checkhov", "Fiction");
        line();
        line();
        line();
        System.out.println(bookArray[5].getType());
        line();
        System.out.println(bookArray[6].getType());
        line();
        for(int i =0; i < bookArray.length; i++){
            System.out.println(bookArray[i]);
            line();
        }
        for(int i=0; i < bookArray.length; i++){
            System.out.println(bookArray[i].getTitle());
            line();
        }
        for(int i=0; i < bookArray.length; i++){
            System.out.println("Book Number: " + i);
            System.out.println(bookArray[i].getTitle());
            System.out.println(bookArray[i].getAuthor());
            line();
        }
        for(int i=0; i < bookArray.length; i++){
            if(bookArray[i].getType().equals("Fiction")){
                System.out.println(bookArray[i]);
                line();
            }
        }
        for(int i=0; i < bookArray.length; i++){
            if(bookArray[i].getType().equals("Non-Fiction")){
                System.out.println(bookArray[i]);
                line();
            }
        }
        for(int i=0; i < bookArray.length; i++){
            if(bookArray[i].getCopyYear() > 1950){
                System.out.println(bookArray[i]);
                line();
            }
        }
        line();
        line();
        line();
        System.out.println(Book.searchByTitle(bookArray, "The C Programming Language"));
        line();
        System.out.println(Book.searchByTitle(bookArray, "tHe c pRoGramming lAnguage"));
        line();
        System.out.println(Book.searchByTitle(bookArray, "C For Dummies"));
        line();
        System.out.println(Book.searchByAuthor(bookArray, "Twain"));
        line();
        System.out.println(Book.searchByAuthor(bookArray, "tWaIn"));
        line();
        System.out.println(Book.searchByAuthor(bookArray, "Kernighan"));
        line();
        Book.displayBooksByAuthor(bookArray, "Twain");
        line();
        Book.displayBooksByAuthor(bookArray, "Stirner");
        line();
        Book.displayBooksByAuthor(bookArray, "Marx");
        line();
        line();
        line();
        Student sampleStudent = new Student("Sample", 95, "AP CS A ");
        sampleStudent.rentBook(wonder);
        sampleStudent.rentBook(egosown);
        sampleStudent.rentBook(CProgramming);
        sampleStudent.displayRentedBooks();
        line();
        sampleStudent.rentBook(intro64bit);
        sampleStudent.rentBook(manifesto);
        sampleStudent.displayRentedBooks();
        line();
        sampleStudent.rentBook(CProgramming);



















    }
}
