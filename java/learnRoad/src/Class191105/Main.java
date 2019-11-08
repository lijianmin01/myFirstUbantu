package Class191105;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.getNameString();
		student.setNameString("渣白");
		/*
		 	普通属性指的是类中每个对象所具有的属性
		 	静态属性（方法）指的是类的属性
		 */
		System.out.println(student.getCnt());
		Student s1=new Student();
		System.out.println(student.getCnt());//通过对象.共有静态属性
		System.out.println(Student.getCnt());//类名.静态属性
		System.out.println(Math.PI);
	}

}
