import java.io.*;
import java.util.*;
public class Calculate{
    static int cube (int x)
    {
        return x*x*x;
    }
    public static void main(String args[]){
        int result = Calculate.cube(2);
        System.out.println("Cube of 2 is: "+result);
    }
}