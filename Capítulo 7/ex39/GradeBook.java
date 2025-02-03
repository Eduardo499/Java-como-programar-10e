public class GradeBook {
   private String courseName; // nome do curso
   private int[][] grades; // array bidimensional de notas dos alunos
   
   // Construtor modificado
   public GradeBook(String courseName, int numStudents, int numExams) {
      this.courseName = courseName;
      grades = new int[numStudents][numExams]; // cria o array bidimensional
      for (int i = 0; i < grades.length; i++) {
         for (int j = 0; j < grades[i].length; j++) {
            grades[i][j] = -1; // inicializa todas as notas como -1
         }
      }
   }

   // Método para definir a nota de um aluno em um exame específico
   public void setGrade(int studentIndex, int examIndex, int grade) {
      if (studentIndex >= 0 && studentIndex < grades.length &&
          examIndex >= 0 && examIndex < grades[studentIndex].length) {
         grades[studentIndex][examIndex] = grade;
      } else {
         System.out.println("Índice de aluno ou exame inválido.");
      }
   }

   // Métodos existentes (sem modificações)
   public void setCourseName(String name) {
      this.courseName = name;
   }

   public String getCourseName() {
      return courseName;
   }

   public void processGrades() {
      outputGrades();
      System.out.printf("%n%s %d%n%s %d%n%n", 
         "Lowest grade in the grade book is", getMinimum(), 
         "Highest grade in the grade book is", getMaximum());
      outputBarChart();
   }

   public int getMinimum() { 
      int lowGrade = grades[0][0];
      for (int[] studentGrades : grades) {
         for (int grade : studentGrades) {
            if (grade < lowGrade)
               lowGrade = grade;
         }
      }
      return lowGrade; 
   }

   public int getMaximum() { 
      int highGrade = grades[0][0];
      for (int[] studentGrades : grades) {
         for (int grade : studentGrades) {
            if (grade > highGrade)
               highGrade = grade;
         }
      }
      return highGrade; 
   }

   public double getAverage(int[] setOfGrades) {      
      int total = 0;
      for (int grade : setOfGrades)
         total += grade;
      return (double) total / setOfGrades.length;
   }

   public void outputBarChart() {
      System.out.println("Overall grade distribution:");
      int[] frequency = new int[11];
      for (int[] studentGrades : grades) {
         for (int grade : studentGrades)
            ++frequency[grade / 10];
      }
      for (int count = 0; count < frequency.length; count++) {
         if (count == 10)
            System.out.printf("%5d: ", 100); 
         else
            System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9); 
         for (int stars = 0; stars < frequency[count]; stars++)
            System.out.print("*");
         System.out.println(); 
      } 
   }

   public void outputGrades() {
      System.out.printf("The grades are:%n%n");
      System.out.print("            "); 
      for (int test = 0; test < grades[0].length; test++) 
         System.out.printf("Test %d  ", test + 1);
      System.out.println("Average");

      for (int student = 0; student < grades.length; student++) {
         System.out.printf("Student %2d", student + 1);
         for (int test : grades[student]) 
            System.out.printf("%8d", test);

         double average = getAverage(grades[student]);
         System.out.printf("%9.2f%n", average);
      } 
   } 
}
