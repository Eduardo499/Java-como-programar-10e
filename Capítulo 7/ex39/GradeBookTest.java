import java.util.Scanner;

public class GradeBookTest {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      // Solicita o número de alunos e exames
      System.out.print("Enter the number of students: ");
      int numStudents = scanner.nextInt();
      System.out.print("Enter the number of exams: ");
      int numExams = scanner.nextInt();

      // Cria o GradeBook com base nas entradas do usuário
      GradeBook myGradeBook = new GradeBook("CS101 Introduction to Java Programming", numStudents, numExams);

      // Permite que o instrutor insira as notas
      for (int i = 0; i < numStudents; i++) {
         for (int j = 0; j < numExams; j++) {
            System.out.printf("Enter grade for student %d, exam %d: ", i + 1, j + 1);
            int grade = scanner.nextInt();
            myGradeBook.setGrade(i, j, grade); // Define a nota para o aluno
         }
      }

      // Exibe o resultado
      System.out.printf("Welcome to the grade book for%n%s%n%n", myGradeBook.getCourseName());
      myGradeBook.processGrades();

      scanner.close();
   }
}