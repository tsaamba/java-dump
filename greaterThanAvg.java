public class greaterThanAvg {
    public static void main(String[] args){
        int arr[]= {12,56,-85,75,69,26};
        float avg =0;
        int sum =0;
        for (int i=0; i<arr.length;i++){
           sum += arr[i];
           // avg = arr[i]/arir
        }
                avg = (float)sum/arr.length;
        //System.out.println(avg);


        for (int i =0; i<arr.length;i++){
            if(arr[i]>avg){
                System.out.println(arr[i]);
            }
        }
    }
}
