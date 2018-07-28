/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdpa;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author samiul_siddiqui
 */
public class SDPa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Student student = new Student();

        student.setDOB("12/12/2012");
        student.setName("Abcd");
        student.setFathersName("Father of Abcd");
        student.setMothersName("Mother of Abcd");

        student.setSemesterEnd("December 2018");
        student.setSemesterStart("July 2018");

        try (FileOutputStream fos = new FileOutputStream("outputFile.bin");
                ObjectOutputStream oos = new ObjectOutputStream(fos);) {

            oos.writeObject(student);
            oos.flush();
            fos.close();
            oos.close();

        } catch (Exception e) {
        }

        // read object from file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("outputFile.bin"));) {
            Student student_result = (Student) ois.readObject();

            ois.close();
            System.out.println(student_result);
        } catch (Exception e) {
        }

    }

}
