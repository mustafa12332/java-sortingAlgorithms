/**
 * Created by Mustafa Abudalu on 2/28/2017.
 */
public class selectionSort {
public static void sortSelect(int A[]){
    for(int i =0;i<A.length;i++){
        swap(A,i,getMinIndex(A,i,A.length));
    }
}
    public static void swap(int A[],int i,int j){
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;
    }
    public static int getMinIndex(int A[],int from,int to){
        int index=from;
        int min=A[from];
        for(int i =from;i<to;i++){
            if(min>A[i])
            {
                index=i;
                min=A[i];
            }

        }
        return index;
    }


    public static void main(String[] args) {
        int A[]={1,5,4,3,2,-6};
        sortSelect(A);
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+"\t");
        }
    }
}
