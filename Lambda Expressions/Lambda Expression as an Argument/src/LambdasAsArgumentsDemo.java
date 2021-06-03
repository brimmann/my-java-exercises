public class LambdasAsArgumentsDemo {
    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambdas add power to Java";
        String outStr;
        System.out.println("Here is input String: " + inStr);
        outStr = stringOp((str)->str.toUpperCase(), inStr);
        System.out.println("The string in uppercase: " + outStr);


        StringFunc block = (str) -> {
            String result = "";
            int i;
            for(i = 0; i < str.length(); i++) if(str.charAt(i) != ' ') result += str.charAt(i);
            return result;
        };
        outStr = stringOp(block, inStr);
        System.out.println("The string with spaces removed: " + outStr);

        
        outStr = stringOp((str) -> {
            String result = "";
            int i;
            for(i = str.length()-1; i >= 0; i--) result += str.charAt(i);
            return result;
        }, inStr);
        System.out.println("The string reversed: " + outStr);
    }
}
