// Java program to calculate Simple Interest
import java.io.*;
class si{ 
    public static void main(String args[])
    {
        float P = 1, R = 1, T = 1;

        /* Calculate simple interest */
        float SI = (P * T * R) / 100;
        System.out.println("Simple interest = " + SI);
    }
}
// This code calculates the simple interest based on principal (P), rate of interest (R), and time (T).