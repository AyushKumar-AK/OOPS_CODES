class Person{
    void Name(){
        System.out.println("Name: ");
    }
    void Age(){
        System.out.println("Age: ");
    }
    void Address(){
        System.out.println("Address: ");
    }
}

class Student extends Person{
    void RollNo(){
        System.out.println("Roll No: ");
    }
}

class Teacher extends Person{
    void Subject(){
        System.out.println("Subject: ");
    }
    void Salary(){
        System.out.println("Salary: ");
    }
}

class CollegeStudent extends Student{
    void year(){
        System.out.println("Year: ");
    }
    void major(){
        System.out.println("Major: ");
    }
}

class checking12{
    public static void main(String args[]){
        Student s = new Student();
        System.out.println("Student");
        s.Name();
        s.Age();
        s.Address();
        s.RollNo();
        Teacher t = new Teacher();
        System.out.println("Teacher");
        t.Name();
        t.Age();
        t.Address();
        t.Subject();
        t.Salary();
        CollegeStudent cs = new CollegeStudent();
        System.out.println("College Student");
        cs.Name();
        cs.Age();
        cs.Address();
        cs.RollNo();
        cs.year();
        cs.major();

    }
}


