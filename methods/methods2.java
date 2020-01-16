// Dennis Dayan
// AP CS A

// people pronounce it
// as i-ran but that is wrong
// when will they learn this?


public class methods2 {
    static  void  line(){
        System.out.println("---------------------------------------------------");
    }
    static boolean jollyLikes(String target) {
        for (int i = 0; i < target.length() - 1; i++) {
            if (target.substring(i, i + 1).equals(target.substring(i + 1, i + 2))) {
                return true;
            }
        }
        return false;
    }
    static void reverseString(String target){
        String res = "";
        for(int i = target.length()-1; i>=0; i--){
            res += target.substring(i,i+1);
        }
        System.out.println(res);
    }
    static boolean findTarget(int targ, int [] arr ){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == targ){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
    static boolean findTarget(String targ, String [] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(targ)){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
    static void tipCalc(int bill, int diners, int tipPercent){
        double yourTip = (tipPercent / 100 ) * bill;
        double total = yourTip + bill;
        double finalEach = total / diners;
        System.out.println("Each diners total is: " + finalEach);
    }
    static void countWords(String targ){
        String [] anArr = targ.split("\\s+");
        System.out.println(anArr.length);
    }
    static void nameGame(String targ){
        //System.out.println(targ + " " + targ + ",");
        String bstring  = targ.replace(targ.substring(0,1), "B");
        String banan = "Banana-fana";
        String fstring = targ.replace(targ.substring(0, 1), "f");
        String feefee = "Fee-fi-";
        String mstring = targ.replace(targ.substring(0, 1), "m");
        String exclaim = targ.toUpperCase();
        System.out.println(targ + " " + targ + ", " + bstring.substring(0, 2) + "-" + bstring);
        System.out.println(banan + " " + fstring.substring(0, 2) + "-" + fstring);
        System.out.println(feefee + mstring.substring(0, 2) + "-" + mstring);
        System.out.println(exclaim + "!");



    }
    public static void main(String[] args) {
        String strArray [] = {"Dennis", "Extrapolated", "Statistical", "Output", "Yesterday"};
        int intArray [] = {2, 4, 6, 8, 10, 12, 14};
        line();
        System.out.println(jollyLikes("Jelly"));
        line();
        reverseString("Dennis");
        line();
        System.out.println(findTarget(1, intArray));
        line();
        System.out.println(findTarget("Dennis", strArray));
        line();
        tipCalc(120, 4, 15);
        line();
        countWords("Max, I Do Not Care");
        line();
        nameGame("John");

    }

}
