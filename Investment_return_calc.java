import java.util.Scanner;
public class Investment_return_calc {
    double rate,future_value,initial_in,exp_rate_return,in_time_horizon;
    protected void get_data(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Initial Investment Value:");
        initial_in = sc.nextDouble();
        System.out.println("Enter the Expected Rate of Return Value:");
        exp_rate_return = sc.nextDouble();
        System.out.println("Enter the Investment Time Horizon(in years):");
        in_time_horizon = sc.nextDouble();
    }
    protected void display(){
        rate = (exp_rate_return/100)/12;
        future_value = (initial_in * in_time_horizon * rate) + initial_in;
        System.out.println("The Future Value of the Interest is:"+future_value);  
    }
}      


