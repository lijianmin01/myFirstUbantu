package Class1121;

public class Student {
    String name;
    int age;
    public Student(){

    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
