/*Given a sorted array of N integers a[], and Q queries. For each query, you will be given one element K your task is to print the maximum element from the array which is less than or equal to the given element(Floor), and the minimum element from the array which is greater than or equal to the given element(Ceil).*/




static void floorAndCeil(int a[], int N, int x){	
//Enter your code here
    int floorIndex = getFloor(a, N, x);
    if(floorIndex == 0){
        if(a[floorIndex] == x){
            System.out.println(x + " " + x);
        }else{
            System.out.println("-1 " + a[floorIndex]);
        }
    }else if(floorIndex == N){
        System.out.println(a[floorIndex - 1] + " " + -1);
    }else{
        if(a[floorIndex] == x){
            System.out.println(x + " " + x);
        }else{
            System.out.println(a[floorIndex - 1] + " " + a[floorIndex]);
        }
    }
}

static int getFloor(int[] arr, int n, int x){
    int low = 0;
    int high = n -1;
    int resultIndex = n;
    while(low <= high){
        int mid = low + (high-low)/2;
        if(arr[mid] < x){
            low = mid + 1;
        }else{
            high = mid - 1;
            resultIndex = mid;
        }
    }
    return resultIndex;
}