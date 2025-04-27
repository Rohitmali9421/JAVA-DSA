public class ReverseString {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("");
        String s1="Hello";
        for(int i=s1.length()-1;i>=0;i--){
            s.append(s1.charAt(i));
        }
        System.out.println(s.toString());
    }
}
