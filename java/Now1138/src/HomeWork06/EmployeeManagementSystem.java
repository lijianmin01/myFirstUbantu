package HomeWork06;

import java.io.*;

public class EmployeeManagementSystem {

    public  void PrintStaff(Employee[] arr, int count){
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i].toString());
        }
    }
    public  void replaceWeight(Employee[] arr,int tNo,float tweight,int count){
        for (int i = 0; i < count; i++) {
            if(arr[i].getNo()==tNo){
                arr[i].setWeight(tweight);
                System.out.println(arr[i].toString());
                break;
            }
        }
    }
    public void addStaff(Employee a,int no,String name,float height,float weight){
        a.setNo(no);
        a.setName(name);
        a.setHeight(height);
        a.setWeight(weight);
    }
    public  void reload(Employee[] arr,int count){
        try {
            int cnt=0;
            FileReader fReader = new FileReader("//home//redorange//IdeaProjects//Now1138//src//HomeWork06//date.txt");
            BufferedReader bufferedReader = new BufferedReader(fReader);
            Writer writer = new FileWriter(new File("//home//redorange//IdeaProjects//Now1138//src//HomeWork06//date.txt"));
            for (int i = 0; i <count ; i++) {
                if(arr[i]!=null){
                    writer.write(arr[i].getNo()+" "+arr[i].getName()+" "+arr[i].getHeight()+" "+arr[i].getWeight()+"\r\n");
                    bufferedReader.readLine();
                }else{
                    cnt++;
                }
            }
            count-=cnt;
            bufferedReader.close();
            fReader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void searchStaff(Employee[] arr,String name,int count){
        for (int i = 0; i <count ; i++) {
            if(arr[i].getName().equals(name)){
                System.out.println(arr[i].toString());
                break;
            }
        }
    }
    public void deleteStaff(Employee[] arr,int no,int count){
        for (int i = 0; i <count ; i++) {
            if(arr[i].getNo()==no){
                arr[i]=null;
                break;
            }
        }
    }
}

