public class Game {
    //fields for the game
    private String title, genre;
    private int price, quantity;
    //game constructor
    public Game(String title, String genre, int price, int quantity){
        this.title = title; // all of these just set the variables for the constructor
        this.genre = genre;
        this.price = price;
        this.quantity = quantity;
    }
    //getters
    public String getTitle(){
        return this.title;
    }
    public String getGenre(){
        return this.genre;
    }
    public int getPrice(){
        return this.price;
    }
    public int getQuantity(){
        return this.quantity;
    }
    //setters
    public void setTitle(String title){
        this.title = title;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    @Override
    public String toString(){
        return "Title: " + getTitle() + "\n" + "Genre: " + getGenre() + "\n" + "Price: " + getPrice() + "\n" + "Quantity: " + getQuantity() + "\n";
    }








}
