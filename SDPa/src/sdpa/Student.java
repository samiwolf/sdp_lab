/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdpa;

import java.io.Serializable;

/**
 *
 * @author samiul_siddiqui
 */
public class Student implements Serializable {

    private String name;
    private int roll;
    private String DOB;
    private String semesterEnd;
    private String semesterStart;
    private String fathersName;
    private String mothersName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getSemesterEnd() {
        return semesterEnd;
    }

    public void setSemesterEnd(String semesterEnd) {
        this.semesterEnd = semesterEnd;
    }

    public String getSemesterStart() {
        return semesterStart;
    }

    public void setSemesterStart(String semesterStart) {
        this.semesterStart = semesterStart;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    @Override
    public String toString() {
        return "Name:" + name + "\nRoll: " + roll + "\nDOB: " + DOB + "\nFather's name: " + fathersName + "\nMother's name: " + mothersName;
    }
    
    

}
