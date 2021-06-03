public class Gen<T> {
    T ob;
    Gen(T o){
        ob = o;
    }

    T getOb(){
        System.out.print("Gen's getob(): ");
        return ob;
    }
}
