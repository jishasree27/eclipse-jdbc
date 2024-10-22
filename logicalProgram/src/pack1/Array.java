package pack1;
import java.util.Arrays;
public class Array {
         public static void main(String []args) {
        	 int a[]= {5,3,6,2,4,1};
        	 int temp=0;
        	 for(int i=0;i<=a.length;i++) {
        		 for(int j=1;j<=a.length-1;j++) {
        			 if(a[j-1]>=a[j]){
        				 {
        					temp=a[j-1];
        					a[j-1]=a[j];
        					a[j]=temp;
        				 }
        			 }
        		 }
        	 }
        	 System.out.println(Arrays.toString(a));
         }
}
