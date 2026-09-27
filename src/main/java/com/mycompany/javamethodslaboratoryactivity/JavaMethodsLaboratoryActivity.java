/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javamethodslaboratoryactivity;

/**
 *
 * @author admin
 */
public class JavaMethodsLaboratoryActivity {

        public static void main(String[] args) {
        // Call the method with different student names and grades
        checkGrade("Jeruel Lenard Jacinto", 90);
        checkGrade("King Phillip Laxamana", 80);
        checkGrade("Neil Harvey Salvador", 60);
        checkGrade("Danilo Jr. Saren", 45);
    }

    public static String checkGrade(String name, int grade) {
        String result;
        
        if (grade > 75) {
            System.out.println(name + " passed with distinction!");
            result = "Passed with distinction";
        } else if (grade >= 50 && grade <= 75) {
            System.out.println(name + " passed.");
            result = "Passed";
        } else {
            System.out.println(name + " failed.");
            result = "Failed";
        }
        
        return result;
    }
}