/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author homepc
 */
public class Student {
    private String name;
    private int age;
    private boolean isDismissed;
    private int [] marks;
    
    public Student(String name, int age, boolean isDismissed, int [] marks ){
        this.name = name;
        this.age = age;
        this.isDismissed = isDismissed;
        this.marks = marks;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public boolean getDismissed(){
        return this.isDismissed;
    }
    
    public int [] getMarks(){
        return this.marks;
    }
}
