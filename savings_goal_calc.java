import java.util.*;
public class savings_goal_calc {
    double goal_amount,time_frame,exp_rate_return,temp,future_value;
    protected void get_data(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your goal amount");
        goal_amount = sc.nextDouble();
        System.out.println("Enter The Time Frame");
        time_frame = sc.nextDouble();
        System.out.println("Enter your Expected Rate of Returns");
        exp_rate_return = sc.nextDouble();
    }
    protected void display(){
        temp = goal_amount*(1+exp_rate_return);
        future_value = Math.pow(temp,time_frame);
        System.out.println("The future cost of the goal is :"+future_value);
    }
}
