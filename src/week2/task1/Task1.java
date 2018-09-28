package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        do {
            a = Math.abs(a);
            b = Math.abs(b);
            if(a>b && b!=0)
                a = a%b;
            else if(a<b && a!=0)
                 b=b%a;
        }while(a!=0 && b!=0);
        if(a>b)
        {
            return a;
        }
        else return b;
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        if (n < 3) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


}
