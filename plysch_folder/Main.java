package plysch_folder;

public class Main {
    public static void main(String[] args) {
    int a=2;
    int b=1;
    int c=a+b;
    Math.abs(a+b);
    System.out.println(c);
    function();
    Vino.huy();
    Vino.vino();
    Vino.pivo();
    Vino.vodka();
    Calculator e=new Calculator();
    e.summ(4,6);
    e.minus(4,6);
    e.multi(4,6);
    e.delenie(4,6);
    System.out.println(e.summ(4,6));
    System.out.println(e.minus(4,6));
    System.out.println(e.multi(4,6));
    System.out.println(e.delenie(4,6));
    }

    public static void function() {
        System.out.println("Privet");
    }

}
class Vino{
    public static void huy(){
        System.out.println("Privet111");
    }
    public static void pivo(){
        System.out.println("Pivo horosho");
    }
    public static void vodka(){
    System.out.println("Vodka is bad");

    }
    public static void vino(){
    System.out.println("Vino zbs");
    }
    }
class Calculator{


    Calculator(){


    }
    public int summ(int a,int b){
        return a+b;
    }
    public int minus(int a, int b){
        return a-b;
    }
    public int multi(int a, int b){
        return a*b;
    }
    public int delenie(int a, int b){
        return a/b;
    }
}
