public class Relational {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
    }
}
/*
C:\xxxxxxxxxxxxxxxxx>javac Relational.java

C:\xxxxxxxxxxxxxxxxx>java Relational
a > b : false
a < b : true
a >= b: false
a <= b: true
a == b: false
a != b: true */