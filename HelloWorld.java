public class HelloWorld {
public static void main(String[] args) {
    Test helloTest = new Test("kazuma", 27);
    helloTest.hello();
}
}
class Test {
    String name;
    int age;

    Test(String name, int age) {
        name = this.name;
        age = this.age;
    }

    public void hello() {
        System.out.println("私の名前は" + name + "です");
        System.out.println("年齢は" + age + "歳です");
    }
}