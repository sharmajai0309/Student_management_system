package com.pwskills.HibDemo;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Student stud = new Student();

            System.out.print("Enter Roll Number: ");
            stud.setRollno(sc.nextInt());

            sc.nextLine(); // Consume the newline character

            System.out.print("Enter Name: ");
            stud.setName(sc.nextLine());

            System.out.print("Enter Marks: ");
            stud.setMarks(sc.nextInt());

            Configuration config = new Configuration().configure().addAnnotatedClass(Student.class);
            SessionFactory sf = config.buildSessionFactory();

            try (Session session = sf.openSession()) {
                Transaction tx = session.beginTransaction();
                session.save(stud);
                tx.commit();
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("Student details saved: " + stud);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
