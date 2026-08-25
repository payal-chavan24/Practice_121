public class MyClass {
    private String name;
    private int value;

    public MyClass(String name) {
        this.name = name;
        this.value = 0;
    }

    public void increment() {
        value++;
    }

    public String greet() {
        return "Hello, " + name + "!";
    }

    @Override
    public String toString() {
        return name + " (value=" + value + ")";
    }

    public static void main(String[] args) {
        MyClass m = new MyClass("Alice");
        System.out.println(m.greet());
        m.increment();
        System.out.println(m);
    }
}
