package Homework.Homework6;

public class Lesson6 {
     double sum;
    double sum(){
        sum = 0;
        return sum;
    }

    double sum(double num1){
        sum += num1;
        return sum;
    }

    double sum(double num1, double num2){
        sum += num1+num2;
        return sum;
    }
        double sum(double num1, double num2, double num3){
            sum += num1+num2+num3;
            return sum;
    }

    double sum(double num1, double num2, double num3, double num4){
        sum += num1+num2+num3+num4;
        return sum;
    }

    void Output(){
        System.out.println("Sum = " + sum);
    }
}

