import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        int x = 30;
//
//        if( x > 20) {
//            System.out.println("This is an if statement");
//        } else {
//            System.out.println("This is the else part");
//        } else if (x ++ 30){
//            Sytem.out.println("This is the else if Part")
//        }
//    }
//}
//
//
//        System.out.println("Enter your name: ");
//        Scanner scannner = new Scanner(System.in);
//        String name = scannner.nextLine();
////        String name = "Colin Bell";
//        System.out.println(name.equals("Colin Bell"));
//
//        char grade = 'C';
//
//        switch(grade) {
//            case 'A':
//                System.out.println("Excellent");
//                break;
//            case 'B':
//                System.out.println("Great");
//                break;
//            case 'C':
//                System.out.println("Well done");
//                break;
//        default:
//                System.out.println("Invalid grade");
//        }

//        int x = 10;
//
//        while(x < 20){
//            System.out.println("Value of x is " + x);
//            x++;
//            System.out.println("\n");
//        }

//        int x =10;
//
//        do {
//            System.out.println("value of x: " +x);
//            x++;
//        } while(x < 20);

        ArrayList<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Orange");
        words.add("Dragonfruit");

        for(int i = 0; i < words.size(); i++){
            System.out.println(words.get(i));
        }

        for(String word: words){
            System.out.println(word);
        }
    }
}