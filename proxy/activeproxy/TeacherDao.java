package proxy.activeproxy;

public class TeacherDao implements ITeacher{
    @Override
    public void teach() {
        System.out.println("老师授课中……");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("你好.."+name);
    }
}
