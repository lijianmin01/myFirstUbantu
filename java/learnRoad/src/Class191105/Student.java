package Class191105;

public class Student {
	private static int cnt=0;//记录new了多少属性
	
	public static int getCnt() {
		return cnt;
	}
	public static void setCnt(int cnt) {
		Student.cnt = cnt;
	}
	public Student() {
		this("渣白","20121212",18);
	}
	public Student(String nameString,String schoolString,int string) {
		this.age=string;
		this.nameString=nameString;
		this.schoolString=schoolString;
		cnt+=1;
	}
	
	private int age;
	private String nameString;
	private String schoolString;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getSchoolString() {
		return schoolString;
	}
	public void setSchoolString(String schoolString) {
		this.schoolString = schoolString;
	}
	
}
