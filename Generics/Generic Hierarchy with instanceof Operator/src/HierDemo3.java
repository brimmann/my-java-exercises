public class HierDemo3 {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<Integer>(88);
        Gen2<Integer> iob2 = new Gen2<Integer>(99);
        Gen2<String> strOb2 = new Gen2<String>("Generics Test");
        if(iob2 instanceof Gen2<?>) System.out.println("iobs2 is instance of Gen2");
        if(iob2 instanceof Gen<?>) System.out.println("iOb2 is instance of Gen");
        System.out.println();
        if(strOb2 instanceof Gen<?>) System.out.println("strOb2 is instance of Gen2");
        System.out.println();
        if(iOb instanceof Gen2<?>) System.out.println("iOb is instance of Gen2");
        if(iOb instanceof Gen<?>) System.out.println("iOb is instance of Gen");
    }
}
