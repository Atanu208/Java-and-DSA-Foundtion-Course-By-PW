public class FrogJump {
    static int minimumJumps(int[] stones,int n,int index)
    {
        if(index==n-1)
        {
            return 0;
        }
        int opt1=minimumJumps(stones, n, index+1)+ Math.abs(stones[index+1]-stones[index]);
        if(index==n-2)
        {
            return opt1;
        }
        int opt2=minimumJumps(stones, n, index+2) + Math.abs(stones[index+2]-stones[index]);
        return Math.min(opt1,opt2);
    }
    public static void main(String[] args) {
        int[] stones = {10, 30, 40, 20};
        System.out.println(minimumJumps(stones, stones.length, 0));
    }
}