package intro;
import java.util.*;
public class subsetswithkbacktracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 1, 4, 5, 6 };
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		kPartition(arr, 0, list, 3);
}
	public static void kPartition(int[] arr, int vidx, ArrayList<ArrayList<Integer>> list, int k) {
		if (vidx == arr.length) {
			if (list.size() == k) {
				System.out.println(list);
			}
			return;
		}
		if (list.size() == 0) {
			list.add(new ArrayList<Integer>());
			list.get(0).add(arr[vidx]);
			kPartition(arr, vidx + 1, list, k);
			list.remove(0);
		} else {
			for (int i = 0; i < list.size(); i++) {
				list.get(i).add(arr[vidx]);
				kPartition(arr, vidx + 1, list, k);
				list.get(i).remove(list.get(i).size() - 1);
			}

			if (list.size() < k) {
				list.add(new ArrayList<>());
				list.get(list.size() - 1).add(arr[vidx]);
				kPartition(arr, vidx + 1, list, k);
				list.remove(list.size() - 1);
			}
		}
	}

}
