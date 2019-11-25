package easy;

public class _3 {
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        String s1= "RLLLLRRRLR";
        String s2= "LLLLRRRR";
        System.out.println(balancedStringSplit(s));
        System.out.println(balancedStringSplit(s1));
        System.out.println(balancedStringSplit(s2));
    }
    public static int balancedStringSplit(String s) {
        int L = 0;
        int R = 0;
        int res = 0;
        for(char c : s.toCharArray()){
            if(c == 'L')
                L++;
            else
                R++;
            if(L > 0 && L == R){
                res++;
                L = 0;
                R = 0;
            }
        }
        return res;
    }
}
