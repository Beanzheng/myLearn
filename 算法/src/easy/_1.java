package easy;

public class _1 {
    public static void main(String[] args) {
        int[] guess={1,2,3};
        int[] answer={3,2,1};
        System.out.println(Ranswer(guess,answer));
    }
    public static int Ranswer(int[] guess, int[] answer){
        int result=0;
        for(int i=0; i<guess.length;i++){
            if(guess[i] == answer[i]) result++;
        }
        return result;
    }
}
