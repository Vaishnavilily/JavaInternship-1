import java.util.*;
public class mortgage_calc{
    double mon_pay,loan_term,loan_amount,interest_rate,n,temp,rate;
    protected void get_data(){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Loan Amount:");
        loan_amount = sc.nextDouble();
        System.out.println("Enter Loan Interest Rate:");
        interest_rate = sc.nextDouble();
        System.out.println("Enter Loan term in years:");
        loan_term = sc.nextDouble();
    }
    protected void display(){
        n = loan_term*12;
        rate = (interest_rate/100)/12;
        temp = Math.pow((1+rate),n);
        mon_pay = loan_amount *(rate * temp) / (temp -1);
        System.out.printf("The Monthly Mortgage Payment will be: %.2f",mon_pay);
    }
}
