package top.chgl16.aop;

public class Test1Service implements TestServiceInter, TestServiceInter2 {

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("hi " + name);
    }

    public void sayBye() {
        System.out.println("bye " + name);
    }
}
