package com.inheritanceProg;

 class TestStudentClass extends Student {
	
	
	TestStudentClass(int roll, String name, char sec) {
		super(roll, name, sec);
	}

	public static void main(String[] args) {
		
		System.out.println("---------------getter----------------");
		Student st=new Student(10, "Rahul", 'A');
		System.out.println(st.getRoll());
		System.out.println(st.getName());
		System.out.println(st.getSec());
		
		
		System.out.println("---------------setter----------------");
		st.setRoll(50);
		System.out.println(st.getRoll());
		
		st.setName("Demo ");
		System.out.println(st.getName());
		
		st.setSec('D');
		System.out.println(st.getSec());
	}
}
