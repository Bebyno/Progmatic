package Module01.BasicTasks;

public class HomeWork {

    public static void main(String[] args) {

        //1
        int j = 5;
        int i = 10;
        System.out.println(j += j * 2 == i ? j : i % 3);
        //2
        int n = 0;
        System.out.println(n -= (n % 2 > 0) ? 1 + 2 * n : n - 3);
        //3
        int b = 9;
        boolean a = ++b % 5 == 0 ? b == 10 : b != 9;
        System.out.println(a);
        //4 mi a hiba itt?
        boolean k = false, c = true, d = true;
        boolean l = k || c ? !(k || c && d) : c && !d;
        System.out.println(l);
        //5
        int f = 1;
        boolean e =!false == (10%3 == f);
        int g = e ? f -= (++f*-1):f+ (f+f)* ++f;
        System.out.println(g);
        //6
        int v = 5, x = v* --v;
        boolean y = x % v < 0 ? v== 0 : !false;
        boolean z = !y && x == v*v;
        System.out.println(z);




    }
}
