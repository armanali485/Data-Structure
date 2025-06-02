class RemoveAdjacentDuplicate {
    public static String removeAdjacentDuplicates(String str) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char ch : str.toCharArray()) {
            if (!stack.isEmpty() && stack.peek().equals(ch)) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        String result ="";
        while(!stack.isEmpty()){
            result = stack.pop() + result;
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "baba";
        System.out.println(removeAdjacentDuplicates(str));
    }

}