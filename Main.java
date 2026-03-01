public class Main {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.Greet("Zakee ahmad"); // Run this code & see output :
        std1.Student_Data("Zakee ahmad", 21, 98f);
        int fact = std1.Factorial(5);
        System.out.println("Factorial of the number is : " + fact); // Output : 120

        Student std2 = new Student();  // We can create multiple objects by using same tamplate.
        std2.Greet("Gaush alam"); // std2 also return the same output
    }

    static class Student {
        String name;
        int age;
        float marks;

        Student() {
            this.name = "Zakee ahmad";
            this.age = 21;
            this.marks = 98f;
        }

        void Greet(String name) { // Void function its not return any value
            System.out.println("Have a nice day! " + name);
        }

        void Student_Data(String name, int age, float marks) { // This function pass all the data from Student
            System.out.println("Name : " + name + "\n" + "Age : " + age + "\n" + "marks : " + marks);
        }

        int Factorial(int n) { // This function return the the data!
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }
    }
}