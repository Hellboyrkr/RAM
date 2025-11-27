public class Logical {
    public static void main(String[] args) {
        boolean x = true, y = false;

        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));
        System.out.println("!x = " + (!x));
    }
}
/*
C:\xxxxxxxxxxxxxxxxx>javac Logical.java

C:\xxxxxxxxxxxxxxxxx>java Logical
x && y = false
x || y = true
!x = false */