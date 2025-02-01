public class OrderString {
    public static void main(String[] args) {
        String[] arr={"Niko","Emon","Chandan","Dipankar","Lasker"};

        for (int i = 0; i < arr.length-1; i++) {
            int idx=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j].compareTo(arr[idx])<0)
                {
                    String temp=arr[idx];
                    arr[idx]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (String string : arr) {
            System.out.print(string+" ");
        }
    }
}
