public class Main {
    public static void main(String[] args) {
        // Create model (Student)
        Student student = new Student("6390569", "Hima", "A");

        // Create view
        StudentView view = new StudentView();

        // Create controller
        StudentController controller = new StudentController(student, view);

        // Display initial details
        controller.updateView();

        // Update student details
        controller.setStudentName("Himasri");
        controller.setStudentGrade("A+");

        System.out.println("\nAfter updating details:");
        controller.updateView();
    }
}
