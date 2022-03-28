public class student {
    String studentName;
    double studentScore;

    //constructor
    public student(String studentName, double studentScore) {
        this.studentName = studentName;

        if (studentScore >= 0 && studentScore <= 100) {
            this.studentScore = studentScore;
        }
      }

    //set and get methods


    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentScore(double studentScore) {
        if (studentScore >=0 && studentScore <=100){
        this.studentScore = studentScore;
        }
    }

    public double getStudentScore() {
        return studentScore;
    }

    public String getGrade(){
        String getGrade ="";
        if (studentScore >= 90.00)
            getGrade = "A";
        else if (studentScore >=80.00)
            getGrade = "B";
        else if (studentScore >= 70.00)
            getGrade = "C";
        else if (studentScore >= 60.00)
            getGrade = "D";
        else
            getGrade = "Failed";


        return getGrade;
    }

}

