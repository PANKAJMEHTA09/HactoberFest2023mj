import java.util.*;
public class reverseofarray {
    public static void reverse(int array[]){
            int start = 0;
            int end = array.length-1;
while(start<end){
    int temp = array[start];
    array[start] = array[end];
    array[end] = temp;
    start++;
    end--;

}


        }
    
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
int array[] = new int[n];
for(int i=0;i<n;i++){
    array[i]= sc.nextInt();
}
reverse(array);
for(int i=0;i<n;i++){
   System.out.print(array[i] + " ");
}

}
}
