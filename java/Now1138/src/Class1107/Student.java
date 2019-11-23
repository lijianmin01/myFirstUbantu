package Class1107;

public class Student {
    private static int age;
    private  String name;
    private static String School;
    private static int id;
    private static int cnt=10;

    //类内代码块
    {
        name="zhabai";
    }
    //静态代码块~用来访问静态属性
    static{
        age=60;
    }

    public static void setSchool(String school) {
        School = school;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setId(int id) {
        Student.id = id;
    }

    public static void setAge(int age) {
        Student.age = age;
    }

    public static int getAge() {
        return age;
    }

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static String getSchool() {
        return School;
    }

}

