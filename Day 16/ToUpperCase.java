public class ToUpperCase {
    public static String toUpper(String str) {
        StringBuilder st=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        st.append(ch);

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                st.append(str.charAt(i));
                i++;
                st.append(Character.toUpperCase(str.charAt(i)));
            }else{
                st.append(str.charAt(i));
            }
        }
        return st.toString();
    }
    public static void main(String[] args) {
        String s1=" hello world  ";
        System.out.println(toUpper(s1));
    }
}
