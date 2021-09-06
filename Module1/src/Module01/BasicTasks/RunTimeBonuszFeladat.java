package Module01.BasicTasks;

public class RunTimeBonuszFeladat {

    public static void main(String[] args) throws Exception{
        long start = System.currentTimeMillis();
        //long start = 1085221;
        System.out.println(start);


        long num = 0; // ha 0l-t írsz akkor az egyből long type
        for (long i = 0; i <=1000000; i++) {
            num += i;
        }

        long end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println("_____");
        float second = (end - start) / 1000.0f; // vagy (float) 1000
        System.out.println(second);
    }
}
