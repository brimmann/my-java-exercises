public class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFunc<String> myClassCons = MyClass<String>::new;
        MyClass<String> mc = myClassCons.func("Hello World!");
        System.out.println("val in mc is " + mc.getVal());
    }
}
