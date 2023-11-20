public class left_rotate {
    public static void main(String args[]){
        int [] numbers = new int [] {2,4,6,8,10,12};
        int n=1;
        System.out.println("given array is: ");
        for(int i=0;i< numbers.length; i++){
        System.out.print(numbers[i]+ " ");
        }
        /*for(int i=0;i<n;i++){
            int j, firstelement;
        firstelement = numbers[0];
        for (j=0;j<numbers.length-1;j++){
            numbers[j] = numbers[j+1];
        }
        numbers[j]=firstelement;
    }
    System.out.println();
    System.out.println("array after "+n+" left rotations: ");
    for(int i=0; i<numbers.length;i++){
        System.out.print(numbers[i]+ " ");
    }*/
    for(int i=0;i<numbers.length-1;i++){
        
         int temp=numbers[0];
        numbers[0]=numbers[numbers.length-1];
        numbers[numbers.length-1]=temp;
        
    }
    for(int i=0;i< numbers.length; i++){
        System.out.println(numbers[i]+ " ");
    }
}
}
