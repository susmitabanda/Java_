class teacher {
    private String tname;
    private String subject;
    private int yrsOfExp;

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getYrsOfExp() {
        return yrsOfExp;
    }

    public void setYrsOfExp(int yrsOfExp) {
        this.yrsOfExp = yrsOfExp;
    }
}

class Student {
    private String sname;
    private String degree;
    private String college;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}

public class Relationship {
    public static void relationship1(teacher teacher, Student student) {
        System.out.println(student.getSname() + " takes " + teacher.getSubject() + 
                           " class under " + teacher.getTname() + " Sir");
    }

    public static void relationship2(teacher teacher, Student student) {
        System.out.println(teacher.getTname() + " teaches " + teacher.getSubject() + 
                           " to " + student.getSname() + " who reads as " + student.getDegree() + 
                           " Student in " + student.getCollege());
    }

    // Main method to test the classes
    public static void main(String[] args) {
        // Create Teacher and Student objects
        teacher teacher = new teacher();
        teacher.setTname("Amitava");
        teacher.setSubject("OOPS design");
        teacher.setYrsOfExp(10);

        Student student1 = new Student();
        student1.setSname("Ankan");
        student1.setDegree("Btech");
        student1.setCollege("UEM");

        Student student2 = new Student();
        student2.setSname("Madhu");
        student2.setDegree("Btech");
        student2.setCollege("UEM");

        // Print relationships
        relationship1(teacher, student1);
        relationship2(teacher, student2);
    }
}
