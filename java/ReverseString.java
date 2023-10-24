import java.util.*;
public class reversestring {
    public static String ReverseString(String st){
        int n =st.length();
        char[] ch = st.toCharArray();
         int sp=0;
        int ep =n-1;
        while(sp<ep){
            char temp = ch[sp];
            ch[sp] =ch[ep];
            ch[ep] =temp;
            sp++;
            ep--;
        
        }
        String ans = st.valueOf(ch);
        return ans;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.print(ReverseString(st));
    }
}
