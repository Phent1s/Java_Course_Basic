package Homework.Homework22;

public class Student {

    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName() {
        StringBuilder name2 = new StringBuilder(name);
            return name2;
    }

    public void setName(StringBuilder name) {
        if (name.length() >= 3) {
            this.name = name;
        }
    }

    public int getCourse() {

            return course;
    }

    public void setCourse(int course) {
        if (course >= 1 && course <= 4) {
            this.course = course;
        }
    }

    public int getGrade() {
            return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 10) {
            this.grade = grade;
        }
    }


    void showInfo(){
        System.out.println("Name: " + getName() + ", Course: " + getCourse() + ", Grade: " + getGrade());
    }
}

class TestStudent1 {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setName(new StringBuilder("Alex"));
        st1.setGrade(7);
        st1.setCourse(3);
        st1.showInfo();
    }
}
