class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1=new Stack<>();
        char[] ch=s.toCharArray();
        int i;
        for(i=0;i<ch.length;i++){
            if(ch[i]=='('){
                s1.push(')');
            }
             else if(ch[i]=='{'){
                s1.push('}');
            }
             else if(ch[i]=='['){
                s1.push(']');
            }
            else{
                if(s1.empty()){
                    return false;
                    }
                char a=s1.pop();
                if(a!=ch[i]){
                    return false;
                }
            }
        }
        
        return s1.empty();
    }
}