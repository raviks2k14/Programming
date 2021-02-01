package Arrays;

import java.util.ArrayList;
import java.util.List;

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
		
		int max_area = 0;
		
		for(Integer area : areaList) {
			if(area > max_area)
				max_area = area;
		}

		return max_area;
	}

	public static void main(String[] args) {
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		//int[] height = { 1,1 };
		//int[] height = { 4,3,2,1,4 };
		//int[] height = { 1,2,14 };
		System.out.println("Max area : " + new ContainerMostWater().maxArea(height));
	}

}
