package Tp2bis;

public class Aide {
    private int studentId;
    private String StudentName;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }


    @Override
    public String toString() {
        return "Aide{" +
                "studentId=" + studentId +
                ", StudentName='" + StudentName + '\'' +
                '}';
    }
}

