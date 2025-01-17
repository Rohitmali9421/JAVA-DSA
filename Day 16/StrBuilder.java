public class StrBuilder {
    public static void main(String[] args) {
        
        StringBuilder st=new StringBuilder("");

        for(char ch='A';ch<='Z';ch++){
            st.append(ch);
        }
        System.out.println(st);
    }
}
