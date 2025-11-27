public class Unary {
    public static void main(String[] args) {
        int a = 5;

        System.out.println("++a = " + (++a)); 
        System.out.println("a++ = " + (a++)); 
        System.out.println("After a++ value = " + a);
        
        System.out.println("--a = " + (--a)); 
        System.out.println("a-- = " + (a--)); 
        System.out.println("After a-- value = " + a);

        System.out.println("Unary minus: " + (-a));
    }
}
/*

C:\xxxxxxxxxxxxxxxxx>java Unary
++a = 6
a++ = 6
After a++ value = 7
--a = 6
a-- = 6
After a-- value = 5
Unary minus: -5 */