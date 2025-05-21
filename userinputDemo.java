package user_input;
import java.util.Scanner;
public class userinputDemo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=scan.nextLine();
        System.out.println("Enter your age:");
        int age=scan.nextInt();
        System.err.println("Enter your mark of subject1:");
        int sub1=scan.nextInt();
        System.out.println("Enter your mark of subject2:");
        int sub2=scan.nextInt();
        System.out.println("Enter your mark of subject3:");
        int sub3=scan.nextInt();
        System.out.println("Enter your mark of subject4:");
        int sub4=scan.nextInt();
        System.out.println("Enter your mark of subject5:");
        int sub5=scan.nextInt();
        int Total=(sub1+sub2+sub3+sub4+sub5);
        int avg=(Total/5);
        if(avg==100){
        System.out.println("GRADE O");
        }else if(avg>=90 && avg<=99){
            System.out.println("GRADE A");
        }else if(avg>=75 && avg<=89){
            System.out.println("GRADE B");
        }else if(avg>=50 && avg<=74){
            System.out.println("GRADE C");
        }else{
            System.out.println("FAIL");
        }


    }
    
}
