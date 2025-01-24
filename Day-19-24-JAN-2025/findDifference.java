import java.util.ArrayList;

public class findDifference {
    public static void main(String[] args) {
        int[] arr1={5,9};
        int[] arr2={3,0, 0, 0};
        int i=arr1.length-1;
        int j=arr2.length-1;
        ArrayList<Integer> list=new ArrayList<>();
        int borrow=0;
        while(j>=0)
        {
            int digit1= i>=0 ? arr1[i] : 0;
            int digit2= arr2[j];
            int diff=digit2-digit1-borrow;
            if(diff<0)
            {
                diff +=10;
                borrow=1;
            }
            else{
                borrow=0;
            }
            list.add(0,diff);
            i--;
            j--;
        }
        while (list.size()>1 && list.get(0)==0) {
            list.remove(0);
        }
        System.out.println(list);
    }
}
