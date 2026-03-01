public class Main {
    public static void main(String[] args) {
        Student other = new Student();
        System.out.println(other.name);
        Student std = new Student();
        System.out.println(std.name);
        std.changeName("Waris alam"); // We can change the name via Function!
        System.out.println(std.name); // Now this will return : Waris alam
    }

    static class Student {
        String name;
        int age;
        float marks;

        // Student() {
        //     name = "Zakee ahmad";
        //     age = 21;
        //     marks = 98f;
        // }

        Student() {
            this("Zakee ahmad", 21, 98f);
        }
        // Student std1 = new Student("Gaush alam ,21,99f");
        // Here this will replace with std1
        Student(String name, int age, float marks) { // This is our constructor!
            this.name = name;
            this.age = age;
            this.marks = marks;
        }

        // Same thing is working internally
        Student(Student other) {
            this.name = other.name;
        }

        void changeName(String name) {
            this.name = name;
        }
    }
}
