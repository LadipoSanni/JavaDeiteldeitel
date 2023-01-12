package chapter4_6;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Shola Mafsholl", 90.80);
        Student student2 = new Student("Demo Megbaby", 70.70);
        Student student3 = new Student("Dipo Akinson", 80.70);

        System.out.printf("%s's letter grade is :  %s%n",student1.getName(),student1.getLetterGrade());
        System.out.printf("%s's letter grade is :  %s%n",student2.getName(),student2.getLetterGrade());
        System.out.printf("%s's letter grade is :  %s%n",student3.getName(),student3.getLetterGrade());

    }
}
