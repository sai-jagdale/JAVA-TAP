class Student {

    String Name;
    int RollNo;
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


    }
}