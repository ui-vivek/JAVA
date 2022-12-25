package CodingNinja1;

class hola<X> {
	void fun(X a) {
		System.out.println(a);
	}
}

public class demo2 {
	public static void main(String[] args) {
		hola<Integer> hh = new hola<Integer>();
		hh.fun(1);
	}
}
//	String name;
//	private int age;
//	String sex;
//	int dob;
//
//	public int getage() {
//
//		return age;
//	}
////---------------------------------------------
//	// ----------------------------------------
//	 public void setage(int num) {
//	 if (num < 20) {
//	 return;
//	 }
//	 age = num;
//	 }
//
//	 public String getname() {
//	 return name;
//	 }
//
//	 void setname(String name) {
//	 this.name = name.toUpperCase();
//	
//	 }
//
//	public demo2(String name, int age, String sex, int dob) {
//		this.name = name;
//		this.age = age;
//		this.sex = sex;
//		this.dob = dob;
//	}
//
//	void print() {
//		System.out.println(name + " " + age + " " + sex + " " + dob);
//	}
//
//}
