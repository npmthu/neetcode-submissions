class Solution {
    public boolean isValid(String s) {
        // // what is the ds of stack
        //   Stack<Character> st = new Stack<>();
        //   char[] charArray = s.toCharArray();
        //   for(int i = 0; i < charArray.length; i++){
        //     String c = String.valueOf(charArray[i]);
        //     if(c == "(" || c == "[" || c == "{"){
        //         st.push(charArray[i]);
        //     }
        //     if(c == ")"){
        //         if(String.valueOf(st.peek()) != "("){
        //             return false;
        //         }
        //         else st.pop();
        //     }
        //     if(c == "]"){
        //         if(String.valueOf(st.peek()) != "["){
        //             return false;
        //         }
        //         else st.pop();
        //     }
        //     if(c == "}"){
        //         if(String.valueOf(st.peek()) != "{"){
        //             return false;
        //         }
        //         else st.pop();
        //     }
        //   }

        //   return true;

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> closeOpen = new HashMap<>();

        closeOpen.put(')', '(');
        closeOpen.put(']', '[');
        closeOpen.put('}', '{');

        for(char c : s.toCharArray()){
            if(closeOpen.containsKey(c)){
                    if(!stack.isEmpty() && stack.peek() == closeOpen.get(c)){
                    stack.pop();
                }
                else return false;
            }
            else stack.push(c);
        }
        return stack.isEmpty();
    }
}
