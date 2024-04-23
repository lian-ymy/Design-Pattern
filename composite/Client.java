package composite;

public class Client {
    public static void main(String[] args) {
        University university = new University("大学", "大学");

        College computer = new College("计算机学院", "计算机");
        College makesi = new College("马克思主义学院", "马克思");

        computer.add(new Department("计算机科学与技术","计算机科学与技术"));
        computer.add(new Department("网络安全","网络安全攻防"));

        makesi.add(new Department("人文主义学院","学习人文主义"));
        makesi.add(new Department("法学院","学习先进法律"));

        university.add(computer);
        university.add(makesi);

        university.print();
    }
}
