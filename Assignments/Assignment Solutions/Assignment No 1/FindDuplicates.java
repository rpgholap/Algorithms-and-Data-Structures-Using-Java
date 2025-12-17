find duplicates in an array

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 5, 7, 9, 4};

        System.out.println("Duplicate elements are:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}




import java.util.HashSet;

public class FindDuplicatesEfficient {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 5, 7, 9, 4};

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {   // if already present in set
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate elements are: " + duplicates);
    }
}
