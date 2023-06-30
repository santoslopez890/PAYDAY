package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        public String pay(String name,double hourlyRate,double hoursWorked,double deductionRate){
            double grossPay;
            double deduction;
            double netPay;

            grossPay=hourlyRate*hoursWorked;
            deduction=grossPay*deductionRate;
            netPay=grossPay -deduction;

            //"KRIS" ,21.5,10,0.05
            String result;

            result =name+grossPay+deduction+netPay;
            return result;

        }

    }
}