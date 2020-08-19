public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        University university = new University();
        university.setStudent(new Student());
        Student student = university.getStudent();
    }
}

class Student implements Cloneable {
    @Override
     public Student clone() throws CloneNotSupportedException {
        return (Student)super.clone();
    }
}

class University {
    private Student student;

    public Student getStudent() throws CloneNotSupportedException {
        return student.clone();
    }
    public void setStudent(Student student) {
        this.student = student;
    }
}