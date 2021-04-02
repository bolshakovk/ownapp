package plysch_folder;

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        System.out.println("Введите числа ");
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        System.out.println("вы ввели числа " + number1+"\t"+ number2);
        System.out.println("Какую опперацию выполнить? 1:Сумма, 2:Разность, 3:Умножение, 4:Деление");
        int operation = input.nextInt();
    switch (operation){
        case (1):
            calculator.summ(number1,number2);
            break;
        case (2):
            calculator.minus(number1,number2);
            break;
        case (3):
            calculator.multi(number1,number2);
            break;
        case(4):
            calculator.del(number1,number2);
    }
    }


}


