import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();
        for(int i=1;i<11;i++)
        {
            System.out.printf("%d x %d = %d\n",num,i,(num*i) );
        }        

       
    }
}
