package org.example.package2;

public class NewStudent {
    private int age;
    public String name;
    public NewStudent() {
        this.age=23;
        this.name="Yogasree";
    }
    public NewStudent(int age, String name) {
        this.age=age;
        this.name=name;
    }
    public static void main(String[] args) {
        NewStudent newStudent=new NewStudent();
        System.out.println(newStudent.age);
        System.out.println(newStudent.name);
        NewStudent newStudent2=new NewStudent(27,"Varadha");
        System.out.println(newStudent2.age);
        System.out.println(newStudent2.name);
        System.out.println("Hello World");
        System.out.println("New branch commit");
    }
}
