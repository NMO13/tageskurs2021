import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // 1. ArrayList
        // insert is slow bc. a new array needs to be
        // generated as soon as initial capacity is depleted
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>(40);
        arrayList1.add(3);
        arrayList1.add(8);
        arrayList1.add(18);
        System.out.println(arrayList1);

        // element at position 0
        System.out.println(arrayList1.get(0));

        // element at position 1
        System.out.println(arrayList1.get(1));

        // remove element
        arrayList1.remove(0);
        System.out.println(arrayList1);

        // override position 0 with value 20
        arrayList1.set(0, 20);
        System.out.println(arrayList1);

        // Exercise 1
        int[] arr = {4, 5, 7, 2, 54, 7, 78};

        arr = remove(arr, 6);
        // arr: 4, 5, 7, 2, 7, 78
        System.out.println(Arrays.toString(arr));

        arr = remove(arr, 5);
        System.out.println(Arrays.toString(arr));

        // 2. LinkedList
        // insert is fast bc. only two pointers and a new node gets created
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Affe");
        linkedList.add("Banane");
        linkedList.remove(0);
        System.out.println(linkedList.contains("Banane"));

        // Exercise 2
        // LinkedList: 0, 1, 2, 3, 4
        LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
        int index = 5;
        for(int i = 0; i < index; i++) {
            linkedList1.add(i);
        }
        System.out.println(linkedList1.size());
        linkedList1.addFirst(9);
        linkedList1.add(20);
        Collections.sort(linkedList1);

        System.out.println(linkedList1);
    }

    private static int[] remove(int[] arr, int index) {
        int[] arr2 = new int[arr.length-1];

        // solution 1
//        int j = 0;
//        for(int i = 0; i < arr.length; i++) {
//            if(i != index) {
//                arr2[j] = arr[i];
//                j++;
//            }
//        }

        // solution 2
//        for(int i = 0; i < arr.length-1; i++) {
//            if(index <= i) {
//                arr2[i] = arr[i+1];
//            } else {
//                arr2[i] = arr[i];
//            }
//        }

        // solution 3
        for(int i = 0; i < arr.length; i++) {
            if(index < i) {
                arr2[i-1] = arr[i];
            } else if(index > i ) {
                arr2[i] = arr[i];
            }
        }
        return arr2;
    }
}
