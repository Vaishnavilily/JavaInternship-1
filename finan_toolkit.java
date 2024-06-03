import java.util.Scanner;
public class finan_toolkit {
    public static void main(String[]args){
        Investment_return_calc ob1 = new Investment_return_calc();
        mortgage_calc ob2 = new mortgage_calc();
        savings_goal_calc ob3 = new savings_goal_calc();
        System.out.println("***SIMPLE FINANCIAL TOOLKIT***");
        System.out.println("Choose from below:");
        System.out.println("1. Investment Return Calculator");
        System.out.println("2. Mortgage Calculator");
        System.out.println("3. Savings Goal Calculator");
        System.out.println("Enter Your Choice:");
        int choice;
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("***INVESTMENT RETURN CALCULATOR***");
                ob1.get_data();
                ob1.display();
                break;
            case 2:
                System.out.println("***MORTGAGE CALCULATOR***");
                ob2.get_data();
                ob2.display();
                break;
            case 3:
                System.out.println("***SAVINGS GOAL CALCULATOR***");
                ob3.get_data();
                ob3.display();
            default:
                System.out.println("Wrong Choice");
        }
    }
    
}
