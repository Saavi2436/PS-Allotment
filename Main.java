package project;

import java.util.ArrayList;
import java.util.*;

public class Main {
	public static void main(String args[]) {
		ArrayList<String> temp = new ArrayList<String>();
		ArrayList<String> temp2 = new ArrayList<String>(Arrays.asList("A", "B", "C"));

		temp.add("OOP");
		temp.add("DSA");
		temp.add("DBS");
		ArrayList<String> t5 = new ArrayList<String>();
		t5.add("OOP");
		t5.add("DSA");

		Student s1 = new Student("A", 9.8, 1, "CS", temp, temp2);
		Student s2 = new Student("B", 7, 2, "CS", temp, temp2);
		Student s3 = new Student("C", 8, 3, "EEE", temp, temp2);
		Student s4 = new Student("D", 8.5, 4, "EEE", temp, temp2);

		Admin a1 = new Admin(1);
//		//User.students.add(s1);
//		s1.setPref((ArrayList<String>) (Arrays.asList("A", "B", "C"));
//		//User.students.add(s2);
//		s2.setPref((ArrayList<String>) (Arrays.asList("A", "B", "C"));
//		//User.students.add(s3)
//		s3.setPref((ArrayList<String>) (Arrays.asList("A", "B", "C"));
		
		ArrayList<String> t3 = new ArrayList<String> ();
		ArrayList<String> t4 = new ArrayList<String> ();

		
		t4.add("EEE");
		
		t3.add("EEE");
		t3.add("CS");
		
		Station st1 = new Station("A", t3, temp);
		Station st2 = new Station("B", t4, temp);
		Station st3 = new Station("C", t4, temp);
		
//		ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(s1, s2, s3, s4));
//		students.sort(null);
//		
//		for (int i = 0; i < 4; i++) {
//			System.out.print(students.get(i).getName());
//		}
		
		a1.assignStation();		
		
		for (int i = 0; i < 4; i++) {
			System.out.println(User.students.get(i).getName() + " " + User.students.get(i).getStation());
		}
		
		//System.out.println(st1.getBranchReq());

		
//		for (int i = 0; i < 3; i++) {
//			User.studentsInRound.add(User.students.get(i));
//		}
		
		

		
	}
}
