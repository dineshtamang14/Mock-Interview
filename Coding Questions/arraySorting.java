public class arraySorting {
    public static void sortArray(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {8, 3, 9, 1, 12, 5};
        System.out.println("Array before sorting");
        for(int n: arr) System.out.print(n+" ");
        System.out.println();
        
        sortArray(arr);

        System.out.print("Arrya after sorting");
        System.out.println();
        for(int n: arr) System.out.print(n+" ");
    }
}
