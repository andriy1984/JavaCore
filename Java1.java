import java.net.SocketPermission;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Created by andri on 02.02.2017.
 */
public class Java1 {

    private void Tasks1(){

        float a;
        float b;
        float c;

        System.out.println("Tasks 1:");
        Scanner sc = new Scanner(System.in);
        System.out.println("input a ");
        a = sc.nextFloat();
        System.out.println("input b ");
        b = sc.nextFloat();
        c = a + b;
        System.out.println("a+b: " + c);
        c = a - b;
        System.out.println("a-b: " + c);
        c = a * b;
        System.out.println("a*b: " + c);
        c = a / b;
        System.out.println("a/b: " + c);
    }

    private void Tasks2(){

        String answer;

        System.out.println("Tasks 2:");
        Scanner sc = new Scanner(System.in);
        System.out.println("How are you? ");
        answer = sc.next();
        System.out.println("You are " + answer);
    }

    private void Tasks3(){

        int m;
        int n;

        System.out.println("Tasks 3:");
        Scanner sc = new Scanner(System.in);
        System.out.println("input m: ");
        m = sc.nextInt();
        if(m > 0){
            n = 1;
            System.out.println("n = " + n);
        }else if(m == 0){
            n = 0;
            System.out.println("n = " + n);
        }else{
            n = -1;
            System.out.println("n = " + n);
        }
    }

    private void Tasks4(){
        System.out.println("Tasks 4:");
        int b = 0;
        for(int i=1; i<11; i++){
            b = b + i;
        }
        System.out.println(b);
    }

    private void HomeWork1(){
        float radius;
        double perimeter;
        double area;

        System.out.println("HW 1:");
        Scanner sc = new Scanner(System.in);
        System.out.println("input radius: ");
        radius = sc.nextFloat();
        perimeter = 2*Math.PI*radius;
        area = Math.PI*(radius*radius);
        System.out.println("perimetr: " + perimeter);
        System.out.println("area: " + area);

    }

    private void HomeWork2(){

        String name;
        String age;

        System.out.println("HW 2:");
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name? ");
        name = sc.next();
        System.out.println("How old are you? ");
        age = sc.next();
        System.out.println("Name: " + name + ", age: " + age);
    }


    private boolean HomeWork3(){
        int year = 365;
        if(year % 4 != 0 || year % 100 == 0|| year % 400 != 0){
            return false;
        }else{
            return true;
        }
    }

    private void HomeWork4(){

        int row;
        String zero = " ";
        String star = "*";
        int c = 1;
        int d = 0;

        System.out.println("HW4:");
        Scanner sc = new Scanner(System.in);
        System.out.println("input rows: ");
        row = sc.nextInt();

        for (int b= 1; b <= row; b++) {

            String rowZero="";
            String rowStar="";

            for (int i = 1; i <= row - c; i++) {
                rowZero += zero;
            }
            for (int i = 1; i <= 1 + d; i++) {
                rowStar += star;
            }

            System.out.println(rowZero + rowStar + rowZero);
            c++;
            d = d+2;
        }
    }

    public static void main(String[] args) {

        Java1 jv1 = new Java1();
        jv1.Tasks1();
        jv1.Tasks2();
        jv1.Tasks3();
        jv1.Tasks4();
        jv1.HomeWork1();
        jv1.HomeWork2();
        jv1.HomeWork4();

    }
}
