package HW_02052024;

import java.util.Arrays;

public class HW_003 {
    public static void main(String[] args) {
        //Find the max salary in the input arrays {30,50,60,90,10, 100,999}
        int input_salary[] =  {30,50,60,90,10, 100,999};
        int max_salary = input_salary[0];
        for (int i = 0; i < input_salary.length; i++) {
            if (input_salary[i]>max_salary){
                max_salary=input_salary[i];
            }
        }
        System.out.println(max_salary);
    }
}
