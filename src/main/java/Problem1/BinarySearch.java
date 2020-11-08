package Problem1;

public class BinarySearch {
    // This is to be done recursively
    // Do not change signature (return type, function name, parameter types)
    // Add a helper function for recursion calls
    public static int binarySearch(int[] data, int target) {

        int left = 0;
        int right = data.length -1;
        while (left<= right){
            int center = (left +right) /2;

            if(target < data[center]){

                right = center -1;

            } else if (target > data[center]){
                left = center + 1;

            }
            else{
                return center;
            }
            }
        return -1;

        }
        public static void main (String[] args){

            int[] arr1 = {-17, 0, 12, 78, 429};

            int index = binarySearch(arr1, 12);
            System.out.println(index);
        }
    }

