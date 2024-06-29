package Arrays;

import java.util.Scanner;

public class gradeCalculate {
    

    public static void main(String[] args) {
        int TotalMarks=0;
        double averagePercent;
        String grade;
        System.out.println("Enter Total No. Of Subject: ");
        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int[] marks = new int [N];
            
            for(int i = 0; i<N;i++){
            System.out.println("Enter Your Marks Obtained Out Of 100 :" +(i+1));
             marks[i] = sc.nextInt();
            TotalMarks += marks[i];
 }
    averagePercent = (double)TotalMarks/N;
        grade =  CalculateGrade(averagePercent);
    System.out.println("\nResults: ");
    System.out.println("Total Marks: " +TotalMarks);
    System.out.println("Average Percentage: "+averagePercent+"%");
    System.out.println("Grade: " +grade);
    
}

    public static String CalculateGrade(double averagePercent)
    {
    if(averagePercent>=95)
        return "Outstanding";
    else if(averagePercent>=85&&averagePercent<95)
        return "Excellent";
    else if(averagePercent>=75&&averagePercent<85)
        return "A+";
    else if(averagePercent>=60&&averagePercent<75)
        return "A";
    else if(averagePercent>=45&&averagePercent<60)
        return "B";
    else if(averagePercent>=33&&averagePercent<45)
        return "C";
    else 
        return "F";
    }
}