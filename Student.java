 class Student {
    private int rollNo;
    private String name;
    private int marks;

    // Method to set student details
    public void setDetails(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Method to display student details
    public void display() {
        System.out.println("Roll no: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println();
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        Student[] students = new Student[5];

        // Initialize Student objects and set details
        for (int i = 0; i <students.length; i++) {
            students[i] = new Student();
        }

        students[0].setDetails(1, "Alice", 850);
        students[1].setDetails(2, "Bob", 780);
        students[2].setDetails(3, "Charlie", 690);
        students[3].setDetails(4, "Chris", 880);
        students[4].setDetails(5, "Priti", 760);

        // Display student details
        for (Student student : students) {
         student.display();  // Correctly indented line
        }
    }
}