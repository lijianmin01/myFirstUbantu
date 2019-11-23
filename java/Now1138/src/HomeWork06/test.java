package HomeWork06;

import java.io.*;
import java.util.Scanner;

public class test {
    static int maxSize=100;
    static int count=0;

    public static void main(String[] args) {
        Employee[] arr=new Employee[maxSize];
        EmployeeManagementSystem tool=new EmployeeManagementSystem();
        for (int i = 0; i < maxSize; i++) {
            arr[i]=new Employee();
        }
        Scanner in=new Scanner(System.in);

        try {
            FileReader fReader = new FileReader("//home//redorange//IdeaProjects//Now1138//src//HomeWork06//date.txt");
            BufferedReader bufferedReader = new BufferedReader(fReader);
            System.out.println(bufferedReader);

            String cnt;
            while ((cnt = bufferedReader.readLine()) != null){
                String[] dates=cnt.split(" ");

                arr[count].setNo(Integer.parseInt(dates[0]));
                arr[count].setName(dates[1]);
                arr[count].setHeight(Float.parseFloat(dates[2]));
                arr[count].setWeight(Float.parseFloat(dates[3]));
                count++;
            }
            bufferedReader.close();
            fReader.close();

            int number;
            while (true){
                number=in.nextInt();
                switch (number){
                    case 1:
                        //添加职工
                        int no;//工号
                        String name;//姓名
                        float height;//身高
                        float weight;//体重
                        System.out.println("gonghao:");
                        no=in.nextInt();
                        System.out.println("xingming:");
                        name=in.next();
                        System.out.println("shengao:");
                        height=in.nextFloat();
                        System.out.println("tizhong:");
                        weight=in.nextFloat();
                        tool.addStaff(arr[count++],no,name,height,weight);
                        tool.reload(arr,count);
                        break;
                    case 2:
                        //修改职工信息～根据职工编号修改职工体重并打印
                        System.out.println("请输入该员工的编号：");
                        int tNo=in.nextInt();
                        System.out.println("tizhong:");
                        float tWeight=in.nextFloat();
                        tool.replaceWeight(arr,tNo,tWeight,count);
                        tool.reload(arr,count);
                        break;
                    case 3:
                        //查找员工信息～根据职姓名查找职工信息并打印
                        System.out.println("请输入该员工的姓名：");
                        String tName=in.nextLine();
                        tool.searchStaff(arr,tName,count);
                        break;
                    case 4:
                        //删除员工信息～根据职工编号删除职工信息
                        System.out.println("请输入该员工的编号：");
                        int tno=in.nextInt();
                        tool.deleteStaff(arr,tno,count);
                        tool.reload(arr,count);
                        break;
                    case 5:
                        //显示所有员工信息
                        tool.PrintStaff(arr,count);

                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("请输入合法字符！！！\n");

                }
            }



//            Writer writer = new FileWriter(new File("//home//redorange//IdeaProjects//Now1138//src//HomeWork06//date.txt"));
//            String str;
//            while ((str = bufferedReader.readLine()) != null) {
//                writer.write(str + "\r\n");
//            }

            //writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
