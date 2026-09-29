class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Marks: " + marks;
    }
}

public class ToStringDemo {
    public static void main(String[] args) {
        Student s = new Student("Rahul", 85);

        System.out.println(s);
    }
}
