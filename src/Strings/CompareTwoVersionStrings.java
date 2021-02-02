package Strings;
public class CompareTwoVersionStrings {

	public int compareVersion(String version1, String version2) {

		if ((version1 == null || version1.length() == 0) || (version2 == null || version2.length() == 0)) {
			return 0;
		}
		String[] version1Array = null;
		String[] version2Array = null;
		if (version1.contains(".")) {
			version1Array = version1.split("\\.");
		} else {
			version1Array = new String[1];
			version1Array[0] = version1;
		}

		if (version2.contains(".")) {
			version2Array = version2.split("\\.");
		} else {
			version2Array = new String[1];
			version2Array[0] = version2;

		}

		int i = 0;
		int j = 0;
		Integer version1Int = 0;
		Integer version2Int = 0;

		while (i < version1Array.length && j < version2Array.length) {
			version1Int = Integer.parseInt(version1Array[i]);
			version2Int = Integer.parseInt(version2Array[j]);

			if (!(version1Int == version2Int)) {
				if (version1Int > version2Int) {
					return 1;
				} else if (version2Int > version1Int) {
					return -1;
				}
			} else {
				i++;
				j++;
			}
		}

		if (i > j) {
			return 1;
		} else if (i < j) {
			return -1;
		}

		return 0;
	}

	public static void main(String[] args) {
		System.out.println(new CompareTwoVersionStrings().compareVersion("0.1", "1.1"));
		System.out.println(new CompareTwoVersionStrings().compareVersion("1.0.1", "1"));
		System.out.println(new CompareTwoVersionStrings().compareVersion("7.5.2.4", "7.5.3"));
		System.out.println(new CompareTwoVersionStrings().compareVersion("1.01", "1.001"));
		System.out.println(new CompareTwoVersionStrings().compareVersion("1.0", "1.0.0"));
	}
}
