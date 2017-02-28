/**
 * Created by mustafa abudalu on 2/28/2017.
 */
public class insertionSort {

    public static int sortInsertion(int A[]){
        for(int i =1;i<A.length;i++)
        {
            int j=i;
            while(j>0 && A[j-1]>A[j]){
                swap(A,j-1,j);
                j--;
            }

        }
        return 0;
    }
    public static void swap(int A[],int i,int j){
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;

    }

    public static void main(String[] args) {
        int A[]={1,5,4,3,2,-6};
        sortInsertion(A);
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+"\t");
        }
    }
}
