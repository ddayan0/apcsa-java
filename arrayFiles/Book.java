public class Book {
    private int copyYear;
    private String title, author, type;
    public Book(int copyYear, String title, String author, String type ){
        this.copyYear = copyYear;
        this.title = title;
        this.author = author;
        this.type = type;
    }
    public Book(){

    }
    public int getCopyYear(){
        return this.copyYear;
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getType(){
        return this.type;
    }
    public void setCopyYear(int copyYear){
        copyYear = this.copyYear;
    }
    public void setTitle(String title){
        title = this.title;
    }
    public void setAuthor(String author){
        author = this.author;
    }
    public void setType(String type){
        type = this.type;
    }
    public static boolean searchByTitle(Book[] array, String title){
        for(int i = 0; i < array.length; i++){
            if(title.equals(array[i].getTitle())){
                return true;
            }
        }
        return false;
    }
    public static boolean searchByAuthor(Book[] array, String author){
        for(int i = 0; i < array.length; i++){
            if(author.equals(array[i].getAuthor())){
                return true;
            }
        }
        return false;
    }
    public static String displayAllBooks(Book[] array){
        for(int i =0; i < array.length; i++){
            return array[i].getTitle() + " " + array[i].getAuthor();
        }
        return "0";
    }
    public static void displayBooksByAuthor(Book[] array, String author){
        Boolean isFound = false;
        for(int i =0; i < array.length; i++){
            if(array[i].getAuthor().equals(author)){
                System.out.println(array[i]);
                isFound = true;
            }
            if(!isFound){
                System.out.println("Error");
            }
        }
    }







    @Override
    public String toString(){
        return "Title: " + getTitle() + "\n" + "Author: " + getAuthor() + "\n" + "Type: " + getType() + "\n" + "\u00a9" +" " + getCopyYear();
    }
}
