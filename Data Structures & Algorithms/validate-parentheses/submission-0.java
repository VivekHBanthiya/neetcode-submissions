class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char a = s.charAt(0);
        if(a=='}' || a==')' || a==']')return false;

        for(char c:s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            else if(!stack.isEmpty()){
                char p = stack.pop();
                switch(c){
                    case ')': {
                        
                        if(p!='(') return false;
                        break;
                    }
                    case '}':{
                        if(p!='{') return false; 
                        break;
                    }

                    case ']':{
                        if(p!='[') return false;
                        break;
                    }
                }
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}
