import java.util.*;

class Student {

    private String Name;
    private int RollNo;
    float Marks;
    int Standard;

    // Default Constructor
    Student() {
        this.Name = "Sai";
        this.RollNo = 1;
        this.Marks = 28.45f;
        this.Standard = 12;
    }

    // Parameterized Constructor
    Student (String name, int rollNo, float marks, int standard) {
        this.Name = name;
        this.RollNo = rollNo;
        this.Marks = marks;
        this.Standard = standard;
    }

    // Copy Constructor
    Student (Student s) {
        this.Name = s.Name;
        this.RollNo = s.RollNo;
        this.Marks = s.Marks;
        this.Standard = s.Standard;
    }

    @Override
    public String toString(){
        return ("Name : "+Name+" "+"RollNo : "+RollNo+" "+"Marks : "+Marks+" "+"Standard : "+Standard );
    }

    // Getter Setter for Name
    public void setName(String Name){
        this.Name=Name;
    }
    public String getName(String Name){
        return Name;
    }
    // Getter Setter for RollNo
    public void setRollNo(int RollNo){
        this.RollNo=RollNo;
    }
    public int getRollNo(int RollNo){
        return RollNo;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        System.out.println("---------------------Using Default Constructor--------------------------------");
        Student s1 = new Student();
        System.out.println(s1);

        System.out.println("---------------------Using Parameteraized Constructor-------------------------");
        Student s2 = new Student("Chait", 2, 45.67f, 11);
        System.out.println(s2);

        System.out.println("---------------------Using Copy Constructor-----------------------------------");
        Student s3 = new Student(s2);
        System.out.println(s3);

        System.out.println("---------------------Taking Input --------------------------------------------");

        Scanner input=new Scanner(System.in);

        System.out.println("Enter Name : ");
        String SName=input.nextLine();

        System.out.println("Enter RollNO : ");
        int SRollNo=input.nextInt();

        System.out.println("Enter Marks : ");
        float SMarks=input.nextFloat();

        System.out.println("Enter Standard : ");
        int SStandard=input.nextInt();

        Student s4 = new Student( SName , SRollNo ,SMarks,SStandard );
        System.out.println(s4);

    }
}