public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = {3,5,1,2,1,9,8,1,4};
        int[] fr = new int[arr.length];
        int visited = -1;
        for(int i = 0; i < arr.length; i++){
            int count = 1;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    fr[j] = visited;
                }
            }
            if(fr[i] != visited)
                fr[i] = count;
        }
        System.out.print("The duplicate elements in the given array are: ");
        for (int i = 0; i < arr.length;i++){
            if(fr[i] == visited){
                System.out.print(arr[i]+ " ");
            }
        }
        System.out.print("\n");
    }

}
