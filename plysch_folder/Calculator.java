package plysch_folder;

public class Calculator {
    Calculator(){

    }
    public void summ (int a, int b){
        System.out.println("Сумма чисел равна "+(a+b));
    }
    public void minus (int a, int b){
        System.out.println("Разность чисел равна "+(a-b));
    }
    public void multi (int a, int b){
        System.out.println("Произведение чисел равно "+(a*b));
    }
    public void del (int a, int b){
    if (b==0){
        System.out.println("На ноль делить нельзя!");
    }
    else {
        System.out.println("Отношение чисел равно "+(a/b));
    }
    }
}

