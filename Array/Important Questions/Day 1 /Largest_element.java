public class Largest_element {
    public static void main(String[] args) {
        int[] arr={2,1,4,5,6,7,1,23,1,4,4,4,6,6,7,12,13};
        int largest=arr[0]; //here we have considered the first element of the array to be the largest element
        for (int i = 1; i < arr.length; i++) { //why I starting from 1 not 0, (Ans-First element is assumed to be the largest element so need to do a comparison)
            if(arr[i]>largest) largest=arr[i];
        }
        System.out.println("Largest element of the array is "+largest);
        //Smallest element of the array
        int smallest=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<smallest) smallest=arr[i];
        }
        System.out.println("Smallest element of the array is "+smallest);
    }
}
