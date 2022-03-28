

public class StudentTester {
    public static void main(String[] args) {

        student student1 = new student("Okiki", 30.00);
        student student2 = new student("Daniel", 90.00);

        System.out.printf("%s's grade is %s", student1.studentName, student1.getGrade());
        System.out.printf("%n%s's grade is %s", student2.studentName, student2.getGrade());


    }
}