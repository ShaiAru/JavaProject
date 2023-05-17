package Mentorship;

public class mergeSort {
    public static void merge (int nums [], int l , int m, int r){
        int size1 = m-l +1;
        int size2 = r-m;
        int temp1[] = new int [size1];
        int temp2[] = new int[size2];
        for (int i =l; i<=m; i++){
            temp1[i-l] =nums[i];
        }
        for(int i = m+1; i<=r; i++){
            temp2[i-m-1]= nums[i];
        }
        int index1 = 0;
        int index2 = 0;

        while (index1<size1 && index2<size2){
            if(temp1[index1] <temp2[index2]){
                nums[l]=temp1[index1];
                index1++;
            }else {
                nums[l]= temp2[index2];
                index2++;

            } l++;
        }
        while(index1<size1){
            nums[l]=temp1[index1];
            index1++;
            l++;
        }
        while(index2<size2){
            nums[l]= temp2[index2];
            index2++;
            l++;
        }
    }

    public static void sort(int[] nums, int l, int r){//calculate m
        if(r>l){
            int m =(r+l)/2;
            sort(nums,l,m);
            sort(nums,m+1,r);
            merge(nums,l,m,r);
        }

    }

    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n; i++){
            f*=i;
        } return f;
    }

    public static int missingNum(int[]nums) {
        int n = nums.length + 1;

        boolean[] found = new boolean[n];
        for (int i = 0; i < found.length; i++) {
            found[i] = false;
        }
        for (int j = 0; j < nums.length; j++) {
            found[nums[j] - 1] = true;
        }
        for (int y = 0; y < found.length; y++) {
            if (found[y] == false) {
                return y + 1;
            }
        }return -1;

    }

    public static int linearSearch(int [] nums, int num){
        //return index of the num else return -1
        for(int i =0; i< nums.length;i++){
            if(nums[i]==num){
                return i;
            }
        }return -1;
    }
    public static int binarySearch(int [] nums, int num){
        //you can use it only in sorted array
        int l = 0;
        int r = nums.length-1;
        int m = (l+r)/2;
        while(l<=r){
            if(nums[m]==num){
                return m;
            }else if(nums[m]<num){
                l=m+1;
            } else  {
                r=m-1;
            }  m = (l+r)/2;
        } return -1;
    }


    public static void bubbleSort(int []nums){
        for(int i=0; i< nums.length;i++){
            for(int m=0; m<nums.length-1;m++){
                if(nums[m]>nums[m+1]){
                    int temp =nums[m];
                    nums[m]=nums[m+1];
                    nums[m+1]=temp;
                }
            }
        }

    }

    public static void selectionSort(int[] numbers){
        for(int i =0; i< numbers.length;i++){
            int smallest =i;
            for(int x = i;x< numbers.length;x++){
                if(numbers[x]<numbers[smallest]){
                    smallest =x;
                }
            }int temp = numbers[i];
            numbers[i]=numbers[smallest];
            numbers[smallest]=temp;
        }
    }

    public static void insertionSort(int [] numbers1){
        for(int i =0; i< numbers1.length;i++){
            int r = numbers1[i];
            int j =i-1;
            while(j>=0 &&numbers1[j] > r){
                int temp = numbers1[j];
                numbers1[j]=numbers1[j+1];
                numbers1[j+1]=temp;
                j--;

            }
        }
    }





    public static void main(String[] args) {

        int [] nums ={1,2,65,4,34,78,5,32,0,77,112,98};
        sort(nums,0, nums.length-1);
        for (int i =0; i< nums.length;i++){
            System.out.print(nums[i]+ " ");
        }
        System.out.println();



        System.out.println(factorial(7));
        int []nums2= {1,2,6,4,8,7,9,10,5};
        System.out.println(missingNum(nums2));
        System.out.println(linearSearch(nums,78));
        System.out.println(binarySearch(nums, 112));


        int []num3 ={3,2,5,7,4,9,9};
        bubbleSort(num3);
        for (int i =0; i< num3.length;i++){
            System.out.print(num3[i]+ " ");
        }

        System.out.println();
        int []num4 ={4,78,90,54,32,15,67};
        selectionSort(num4);
        for (int i =0; i< num4.length;i++){
            System.out.print(num4[i]+ " ");
        }
        System.out.println();
        int []num5 ={4,78,90,54,32,15,67,56,4,23,45,100};
        insertionSort(num5);
        for (int i =0; i< num5.length;i++){
            System.out.print(num5[i]+ " ");
        }
    }
}
