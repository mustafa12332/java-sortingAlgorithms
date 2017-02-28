/**
 * Created by Mustafa Abudalu on 2/28/2017.
 */
public class bubbleSort {
    public static int sortBubble(int A[]){

        boolean changed=false;
        for(int i =0;i<A.length-1;i++){
            if(A[i]>A[i+1]) {
                swap(A, i, i + 1);
            changed=true;
            }
        }
        if(changed==false)
            return 1;
        return sortBubble(A);
    }
    public static void swap(int A[],int i,int j){
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;

    }

    public static void main(String[] args) {
        int A[]={1,5,4,3,2};
        sortBubble(A);
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+"\t");
        }
    }
}
