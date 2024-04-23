package proxy.staticproxy;

public class TeacherDaoProxy implements ITeacher{
    //把目标对象聚合过来
    private ITeacher target;

    public TeacherDaoProxy(ITeacher target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("代理模式开始");
        target.teach();
        System.out.println("代理模式结束");
    }
}
