import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDB;
public class Start {

	public static void main(String[] args)throws IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		// TODO Auto-generated method stub
		System.out.println("Welcome To STUDENT MANAGEMENT APP....!!");
		while (true) {
			System.out.println("PRESS 1 TO ADD STUDENT INFORMATION INTO DATABASE.");
			System.out.println("PRESS 2 TO UPDATE STUDENT INFORMATION FROM DATABASE.");
			System.out.println("PRESS 3 TO DELETE STUDENT INFORMATION FROM DATABASE.");
			System.out.println("PRESS 4 TO DISPLAY STUDENT INFORMATION FROM DATABASE.");
			System.out.println("PRESS 5 TO EXIT FROM DATABASE.");
			
			int choice = Integer.parseInt(rd.readLine());
			if(choice == 1) {
				System.out.println("Enter Student Name : ");
				String name = rd.readLine();
				System.out.println("Enter Student Phone Number : ");
				String phone = rd.readLine();
				System.out.println("Enter Student City Name : ");
				String city = rd.readLine();
				System.out.println("Enter Student Age : ");
				int age = Integer.parseInt(rd.readLine());
				
				Student st = new Student(name, phone,city,age);
				boolean ans = StudentDB.insertStudentToDB(st);
				if(ans) {
					System.out.println("Student Info Successfully Added to Database");
				}
				else {
					System.out.println("Something went wrong Please try again");
				}
				System.out.println(st);
			}
			else if(choice == 2) {
				System.out.println("Enter StudentID to Update Student Info : ");
				int Studentid = Integer.parseInt(rd.readLine());
				System.out.println("Enter Student Name : ");
				String name = rd.readLine();
				System.out.println("Enter Student Phone Number : ");
				String phone = rd.readLine();
				System.out.println("Enter Student City Name : ");
				String city = rd.readLine();
				System.out.println("Enter Student Age : ");
				int age = Integer.parseInt(rd.readLine());
				Student st = new Student(Studentid,name, phone,city,age);
				boolean ans = StudentDB.updateStudentInfo(st);
				if(ans) {
					System.out.println("Student Info Successfully Updated to Database");
				}
				else {
					System.out.println("Something went wrong Please try again");
				}
			}
			else if(choice == 3) {
				//Delete Student info..
				System.out.println("Enter Student Id to Delete Student Info From Database");
				int Studentid = Integer.parseInt(rd.readLine());
				boolean res = StudentDB.deleteStudentInfo(Studentid);
				if(res) {
					System.out.println("Student Info Successfully Deleted From Database");
				}
				else {
					System.out.println("Something went wrong Please try again");
				}
			}
			else if(choice == 4) {
				// Display Student info...
				StudentDB.showAllData();
			}
			else if(choice == 5) {
				break;
			}
			else {
				System.out.println("....Please Enter a Valid Choice from the Option Menu...");
			}
		}
		System.out.println("Thank you For Using Our Application...See you Soon");

	}

}
