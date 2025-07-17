import java.util.Scanner;

public class Day3 {
    public static void main(String [] args){

        Scanner nal = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int name = nal.nextInt();

        if(name <= 12){
            System.out.println("You are a child");
        }else if(name >= 13 & name < 20){
            System.out.println("You are a teenager");
        }else{
            System.out.println("You are an adult");
        }
    }
}
