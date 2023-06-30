package org.example;

public class PayDAY {//NAME YOUR CLASS NAMES WELLLLLLLL!!!!!!
    public static void main(String[] args) {
        System.out.println("Hello world!");


        }
    public String pay(String name,double hourlyRate,double hoursWorked,double deductionRate){
        double grossPay;
        double deduction;
        double netPay;

        grossPay=hourlyRate*hoursWorked;
        deduction=grossPay*deductionRate;
        netPay=grossPay -deduction;

        //"KRIS" ,21.5,10,0.05
        String result;
        //string cat didnt give me enough controll
        result =String.format("%s %.2f %.2f %.2f",name,grossPay,deduction,netPay);
        return result;

    }
}