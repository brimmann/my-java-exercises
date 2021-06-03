public class OverrideDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<Integer>(88);
        Gen2<Integer> iOb2 = new Gen2<Integer>(99);
        Gen2<String> strOb2 = new Gen2<String>("Generics Test");
        System.out.println(iOb.getOb());
        System.out.println(iOb2.getob());
        System.out.print(strOb2.getOb());
    }
}
