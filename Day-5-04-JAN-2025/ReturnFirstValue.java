public class ReturnFirstValue {
    public static void main(String[] args) {
        int[] arr={33,36,25,36,53,32,45};
        int count=0;
        int k=1;
        boolean found=false;
        for (int i = arr.length-1; i>0 ; i--) {
            for (int j = (arr.length-1)-k++; j >0 ; j--) {
                if(arr[i]==arr[j]) {
                    System.out.println(arr[i]);
                    count++;
                    found=true;
                    break;
                }
            }
            if(found) break;
        }
        if(count ==0) System.out.println(-1);
    }
}
