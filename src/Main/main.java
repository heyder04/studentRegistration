/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import beans.Student;
import java.util.Scanner;
import javax.rmi.CORBA.Util;

/**
 *
 * @author HP
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu;
      while(true){
          
        menu=util.inputUtil.requiredNumber("What do you want to do"+"\n1. Register student"+"\n2. Show all student"+"\n3. Find student" +"\n4. Update student"+"\n5. Exit");
            util.menuUtil.processMenu(menu);
      }
    }
    
}
