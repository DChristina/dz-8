public class Student {
    private int studentId;
    private static int generator = 0;
    private String studentName;
    private String studentSurname;

    public Student (String name, String surname){
        this.studentId = generator++;
        this.studentName = name;
        this.studentSurname = surname;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }
}
