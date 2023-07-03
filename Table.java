import java.util.*;
// import java.lang.*;

class Table {
    public static void main(String[] args) {
        int a;
        int i = 1;
        int result;
        Scanner tp = new Scanner(System.in);
        System.out.println("Enter the number");
        a = tp.nextInt();
        do {
            result = a * i;
            System.out.println(a + "*" + i + "=" + result);
            i++;
        } while (i <= 10);
    }

}