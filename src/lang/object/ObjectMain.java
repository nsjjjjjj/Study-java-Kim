package lang.object;

public class ObjectMain {

    public static void main(String[] args) {
        Child child = new Child();
        child.ChildMethod();
        child.parentMethod();

        // toString()은 Obeject 클래스의 메소드
        String string = child.toString();
        System.out.println(string);
    }
}
