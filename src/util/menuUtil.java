/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author HP
 */
public class menuUtil {
    public static void processMenu(int i){
        switch (i) {
                case 1:
                    util.studentUtil.registerStudents();
                    break;
                case 2:
                    util.studentUtil.printRegisteredStudents();
                    break;
                case 3:
                    util.studentUtil.findAndPrintStudents();
                    break;
                case 4:
                    util.studentUtil.updateStudents3();
                    break;
                case 5:
                    System.exit(0);
                default:
                    break;
            }
    }
}
