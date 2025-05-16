

public class ReverseString {

    public static String reverseString(String str){
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append((char)stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Original String: " + str);
        String reversed = reverseString(str);
        System.out.println("Reversed String: " + reversed);
    

    }
    
}
