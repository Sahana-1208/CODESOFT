package gradeCalculator;
import java.util.Scanner;
public class GradeCalculator {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		int totalMarks=0;
		System.out.println("Enter the total No.Of.Subjects:");
		int totalSub=a.nextInt();
		int[] marks=new int[totalSub];
		for(int i=0;i<totalSub;i++) {
			System.out.println("Enter marks obtained in subject "+(i+1)+":");
			marks[i]=a.nextInt();
			totalMarks+=marks[i];
		}
		double avg=(double)totalMarks/totalSub;
		
		char grade;
		if(avg>=90) {
			grade='A';
		}
		else if(avg>=80) {
			grade='B';
		}
		else if(avg>=70) {
			grade='C';
		}
		else if(avg>=60) {
			grade='D';
		}
		else {
			grade='F';
		}
		System.out.println("Total Marks Obtained:"+totalMarks);
		System.out.println("Average Percentage:"+avg);
		System.out.println("Grade:"+grade);
		a.close();
	}
}
