package com.pwskills.HibDemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
    private int rollno;
    private String Name;
    private int marks;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() { // Corrected method name
        return Name;
    }

    public void setName(String Name) { // Corrected method name
        this.Name = Name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", Name=" + Name + ", marks=" + marks + "]";
    }
}
