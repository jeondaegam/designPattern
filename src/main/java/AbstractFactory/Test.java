package AbstractFactory;

public class Test {
    public static void main(String[] args) {
        int a =4;
        int b =2;

        int max = (a>b)? a:b;
        int max2 = a>b? b:a;

        System.out.println(max);
        System.out.println(max2);

    }
}
