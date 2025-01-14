import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {
        // Sorted in natural order (or a custom order if a comparator is provided).
        // Unique, as it does not allow duplicate elements.
        TreeSet<Integer> treeSet=new TreeSet<>();
        // Add elements to the array
        treeSet.add(20);
        treeSet.add(40);
        treeSet.add(30);
        treeSet.add(65);
        treeSet.add(40);
        treeSet.add(30);
        // Print TreeSet
        System.out.println("TreeSet : "+treeSet);
        //  Check for existence
        System.out.println(treeSet.contains(30));
        // Retrieve specific elements
        System.out.println("Ceiling : "+treeSet.ceiling(12));//Finds the smallest element ≥ 12 → 20
        System.out.println("Floor : "+treeSet.floor(35)); //Finds the largest element ≤ 35 → 30
        System.out.println("Higher : "+treeSet.higher(20)); //Finds the smallest element > 20 → 30
        System.out.println("Lower : "+treeSet.lower(25)); //Finds the largest element < 25 → 20
    }
}
