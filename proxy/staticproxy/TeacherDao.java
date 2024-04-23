package proxy.staticproxy;

public class TeacherDao implements ITeacher{
    @Override
    public void teach() {
        System.out.println("老师授课中……");
    }
}
