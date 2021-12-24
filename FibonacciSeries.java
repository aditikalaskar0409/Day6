import java.io.*;

class FibonacciSeries {
    
    static void findSeries(int num, int first, int sec)
    {
        System.out.print(first + " " + " ");
        int counter = 0, sum;

        while (counter < num - 2)
        {
           sum = first + sec;
           System.out.print( sum + " ");
           first = sec;
           sec = sum;
           counter++;
        }
    }
    
    public static void main (String[] args)
    {
        int n = 5, first = 2, sec = 4;
        findSeries(n, first, sec);
    }
}