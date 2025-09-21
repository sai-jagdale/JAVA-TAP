package com.Sai;

public class Student {
    
    private int RollNo;
    private String Name;
    float Marks;
    int Standard;

    int count;
    
    // Default Constructor
    Student(){
        RollNo = 1;
        Name = "Sai";
        Marks = 57.7f;
        Standard = 12;
        count++;
    }

    Student(int RollNo, String Name, float Marks , int Standard){
        this.RollNo=RollNo;
        this.Name=Name;
        this.Marks=Marks;
        this.Standard=Standard;
        count++;
    }
    
    Student(Student s){
        this.RollNo=s.RollNo;
        this.Name=s.Name;
        this.Marks=s.Marks;
        this.Standard=s.Standard;
        count++;
    }

    @Override
    public String toString(){
        return ("RollNo : "+RollNo+" "+"Name : "+Name+" "+"Marks : "+Marks+" "+"Standard : "+Standard);
    }

    public void setName(String Name){
        this.Name=Name;
    }
    public String getName(String Name){
        return Name;
    }

    public void setRollNo(int RollNO){
        this.RollNo=RollNO;
    }
    public int getRollNo(int RollNO){
        return RollNO;
    }

    public static void main(String [] srgs){
        System.out.println("--------------------------------Lets check--------------------------------");
        System.out.println("---------------------Using Default Constructor--------------------------------");
        Student s1 = new Student();
        System.out.println(s1);
        System.out.println("---------------------Using Parameteraized Constructor-------------------------");
        Student s2 = new Student(24,"Jui",45,15);
        System.out.println(s2);
        System.out.println("---------------------Using Copy Constructor-----------------------------------");
        Student s3 = new Student(s2);
        System.out.println(s3);

        


    }
}
