package com.Methods;

public class StudentMain {
		public static void main(String[] args) {
			//Student s=new Student();
			//(1)store data using object ref
			/*
			s.sid=102;
			s.sname="Rahul";
			s.grade='a';
			s.printStudentData();
			*/
			
			//(1)store data using method(whenever you want to do some peform or write some logic)
			//s.setStudentData(203, "Roman", 'a');
			//s.printStudentData();
			
			
			//(1)store data using constructor(*prefer because the time of creating object it will automatically invoked)
			Student st = new Student(3021, "Hiii", 'd');
			st.printStudentData();
		}
}
