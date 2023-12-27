import dao.CourseDao;
import dao.TeacherDao;
import domainModel.Course;
import domainModel.Teacher;

public class MainClass {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.setTeacherName("Ali");

        Teacher teacher2 = new Teacher();
        teacher2.setTeacherName("Pooyan");

        TeacherDao td = new TeacherDao();

        Course course1 = new Course();
        course1.setCourseName("Math");

        Course course2 = new Course();
        course2.setCourseName("Physics");

        teacher1.getCourses().add(course1);
        teacher1.getCourses().add(course2);

        CourseDao cd = new CourseDao();
        cd.save(course1);
        cd.save(course2);

        td.save(teacher1);
        td.save(teacher2);

    }
}
