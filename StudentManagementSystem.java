import java.util.*;

public class StudentManagementSystem {
    static Scanner sc = new Scanner(System.in);
    static Map<Integer, Student> studentMap = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student\n2. View All\n3. Delete Student\n4. Update Student\n5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewAll(); break;
                case 3: deleteStudent(); break;
                case 4: updateStudent(); break;
                case 5: System.out.println("Exiting..."); return;
                default: System.out.println("Invalid choice!");
            }
        }
    }

    static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // flush
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();

        Student s = new Student(id, name, branch);
        studentMap.put(id, s);
        System.out.println("Student added!");
    }

    static void viewAll() {
        if (studentMap.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student s : studentMap.values()) {
                s.displayInfo();
            }
        }
    }

    static void deleteStudent() {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();
        if (studentMap.remove(id) != null) {
            System.out.println("Student deleted.");
        } else {
            System.out.println("Student not found.");
        }
    }

    static void updateStudent() {
        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();
        sc.nextLine(); // flush
        Student s = studentMap.get(id);

        if (s != null) {
            System.out.print("Enter new name: ");
            String name = sc.nextLine();
            System.out.print("Enter new branch: ");
            String branch = sc.nextLine();

            s.setName(name);
            s.setBranch(branch);
            System.out.println("Student updated.");
        } else {
            System.out.println("Student not found.");
        }
    }
}

