package Arrays;

import java.util.*;

public class ContainerMostWater {

	public int maxArea(int[] height) {

		int n = height.length;

		List<Integer> areaList = new ArrayList<Integer>();

		if (n <= 1) {
			return 0;
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				areaList.add((Math.abs(i - j)) * (Math.min(height[i], height[j])));
			}
		}
		
		Collections.sort(areaList);
		
		return areaList.get(areaList.size()-1);
	
	}

	public static void main(String[] args) {
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		//int[] height = { 1,1 };
		//int[] height = { 4,3,2,1,4 };
		//int[] height = { 1,2,14 };
		System.out.println("Max area : " + new ContainerMostWater().maxArea(height));
	}

}
