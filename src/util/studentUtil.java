/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import Main.Config;
import beans.Student;

/**
 *
 * @author HP
 */
public class studentUtil {
    public static Student fillStudent(){
    String name=util.inputUtil.requiredText("name");
            String surname=util.inputUtil.requiredText("surname");
            String className=util.inputUtil.requiredText("class");
            int age=util.inputUtil.requiredNumber("age");
            
            
            Student st =new Student(name,surname,age,className);
            return st;
                    }
    public static void printRegisteredStudents(){
        if(Config.students==null){
            return;
        }
        for(int i=0;i<Config.students.length;i++){
                Student st=Config.students[i];
                System.out.println((i+1)+"."+st.getFullInfo());
            }
    }
    public static void registerStudents(){
        int studentCount=util.inputUtil.requiredNumber("How many students you will register");
            Config.students=new Student[studentCount];
            for(int i=0;i<studentCount;i++){
                System.out.println((i+1)+"Register");
            
            Config.students[i]=util.studentUtil.fillStudent();
            }
            System.out.println("Registration completed succesfully");
            util.studentUtil.printRegisteredStudents();
    }
    
    public  static void findAndPrintStudents(){
        String text=util.inputUtil.requiredText("Enter student name age class");
        Student[] result=findStudents(text);
            for(int i=0;i<result.length;i++){
               System.out.println(result[i].getFullInfo());
                
        }
    }
    
    public static Student[] findStudents(String text){
        int count=0;
        for(int i=0;i<Config.students.length;i++){
                Student st=Config.students[i];
                if(st.getName().contains(text)||st.getSurname().contains(text)|| st.getClassName().contains(text)){
                    count++;
                }
        }
        Student[] result =new Student[count];
        int found=0;
        for(int i=0;i<Config.students.length;i++){
                Student st=Config.students[i];
                if(st.getName().contains(text)||st.getSurname().contains(text)|| st.getClassName().contains(text)){
                    result[found++]=st;
                }
        }
        return result;
        
        
    }
    public static void updateStudents(){
         util.studentUtil.printRegisteredStudents();
            int i=util.inputUtil.requiredNumber("Necenci studentde deyisiklik etmek isteyirsiniz") ;
            Student s= util.studentUtil.fillStudent();
            Config.students[i-1]=s;
             System.out.println("Yeni melumatlari daxil edin");
    }
    
    public static void updateStudents2(){
         util.studentUtil.printRegisteredStudents();
            int i=util.inputUtil.requiredNumber("Necenci studentde deyisiklik etmek isteyirsiniz") ;
            Student selectedStudent=Config.students[i-1];
            String selectedParam=util.inputUtil.requiredText("Neleri deyismek isteyirsiniz:Meselen 'name','surname','age'");
            if(selectedParam.contains("'name'")){
                selectedStudent.setName(util.inputUtil.requiredText("name"));
            }
            if(selectedParam.contains("'surname'")){
                selectedStudent.setSurname(util.inputUtil.requiredText("surname"));
            }
            if(selectedParam.contains("'age'")){
                selectedStudent.setAge(util.inputUtil.requiredNumber("age"));
            }
            if(selectedParam.contains("'class'")){
                selectedStudent.setClassName(util.inputUtil.requiredText("class"));
            }
    }
    public static void updateStudents3(){
        util.studentUtil.printRegisteredStudents();
            int i=util.inputUtil.requiredNumber("Necenci studentde deyisiklik etmek isteyirsiniz") ;
            Student selectedStudent=Config.students[i-1];
            String selectedParam=util.inputUtil.requiredText("Neleri deyismek isteyirsiniz:Meselen name,surname,age");
            String[] splittedParam=selectedParam.split(",");
             
            for(int j=0;j<splittedParam.length;j++){
                String param=splittedParam[j];
                System.out.println("paaraam"+splittedParam[j]);
            if(param.equalsIgnoreCase("name")){
                selectedStudent.setName(util.inputUtil.requiredText("name"));
            }else if(param.equalsIgnoreCase("surname")){
                selectedStudent.setSurname(util.inputUtil.requiredText("surname"));
            }
            else if(param.equalsIgnoreCase("age")){
                selectedStudent.setAge(util.inputUtil.requiredNumber("age"));
            }
            else if(param.equalsIgnoreCase("class")){
                selectedStudent.setClassName(util.inputUtil.requiredText("class"));
            }
            }
    }
}
