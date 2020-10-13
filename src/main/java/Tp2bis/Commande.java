package Tp2bis;

public class Commande {
    private int studentId;
    private String studentName;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    @Override
    public String toString() {
        return "Aide{" +
                "studentId=" + studentId +
                ", StudentName='" + studentName + '\'' +
                '}';
    }
}

