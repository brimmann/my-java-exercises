public class Gen2<T> extends Gen<T> {
    Gen2(T o){
        super(o);
    }

    T getob(){
        System.out.print("Gen2's getob(): ");
        return ob;
    }
}
