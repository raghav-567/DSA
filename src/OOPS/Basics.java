package OOPS;

public class Basics {
    public static void main(String[] args) {
        student St1 = new student();
        St1.roll_no  = 2;
        St1.marks  = 100;
        System.out.println(St1.roll_no);

    }
}
class student{
    int roll_no ;
    int  marks ;
}
