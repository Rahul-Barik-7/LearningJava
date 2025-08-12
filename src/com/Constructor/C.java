package com.Constructor;

 class C extends P{
	
	String s="Child class...";
	
	public void m1() {
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
	}
}