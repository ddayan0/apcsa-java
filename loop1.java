// dennis dayan
// ap comp sci a
// SGVsbG8gTXIuIFdhdHNvbg==
// dGhlIG9ubHkgd2F5IHRvIHdpbiBpcyB0byBub3QgcGxheSB0aGUgZ2FtZQ==
import java.util.*;
import java.lang.*;


public class loop1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        while(counter <= 50){
            System.out.println(counter);
            counter = counter+1;
        }

        int counter2 = 0;
        while(counter2 <= 100){
            System.out.println(counter2);
            counter2 = counter2+5;
        }

        int mynum = 0;

        while(mynum != 3){
            int firsts = scan.nextInt();
            if(firsts > 0){
                if(firsts == 1){
                    System.out.println("You Lose");
                }
                if(firsts == 2){
                    System.out.println("You Lose");
                }
                if(firsts > 3){
                    System.out.println("You Lose");
                }
                if(firsts == 3){
                    System.out.println("You Win!");
                    mynum = 3;
                    System.exit(0);
                }
            }




        }

        int ranfactnum = 1;
        while(ranfactnum != 0){
            System.out.println("Welcome to random server fact generator!, type fact to receive a fact or bye to quit ");
            String inpstring = scan.next();
            if(inpstring.equals("fact")){
                String stfact = "The PowerEdge R240 includes four DIMM slots, supports up to 64GB UDIMMs ";
                String secfact = " The Intel® Xeon® E-2100 processor has increased core count\n" +
                        "and embedded PCIe lanes that will improve the IO performance\n" +
                        "and a lot more features. ";
                String thfact = " The new 1-socket servers support the latest S140 software\n" +
                        "RAID along with H330 and H730P controller cards with\n" +
                        "improved functionality and faster performance.";
                int random =(int)(Math.random()*3+1);
                if(random == 1){
                    System.out.println(stfact);

                }
                if(random == 2){
                    System.out.println(secfact);
                }
                if(random == 3){
                    System.out.println(thfact);
                }

            String quitstring = scan.next();
            if(quitstring.equals("bye")){
                System.exit(0);
            }




            }

        }







        }
    }

