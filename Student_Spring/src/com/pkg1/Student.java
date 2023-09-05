package com.pkg1;

public class Student {


		// TODO Auto-generated method stub
		private int rollno;
		private String name ;
		private double m1, m2;
		private double total;
		private double percent;
		private Address address;
		
		public Student(int rollno, String name, double m1, double m2, Address address) 
		{
			super();
			this.rollno = rollno;
			this.name = name;
			this.m1 = m1;
			this.m2 = m2;
			this.address = address;
		}

		public int getRollno() {
			return rollno;
		}

		public void setRollno(int rollno) {
			this.rollno = rollno;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getM1() {
			return m1;
		}

		public void setM1(double m1) {
			this.m1 = m1;
		}

		public double getM2() {
			return m2;
		}

		public void setM2(double m2) {
			this.m2 = m2;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}
		
		public void Calculate()
		{
			this.total = m1+m2;
		    this.percent = (total/500) * 100;	
		}

		@Override
		public String toString() {
			return "Student [rollno=" + rollno + ", name=" + name +'\''+ ", m1=" + m1 + ", m2=" + m2 + ", total=" + 
		                 total	+ ", percent=" + percent + ", address=" + address + "]";
		}
		
}
		
		
	
