
public class Roation {

	public static void main(String[] args) {
Boolean sg=isRotateVersion("abcd", "cdab");
	System.out.println(sg);
	}

	public static boolean isRotateVersion(String str, String rotated) {

		if (str == null || rotated == null) {
			return false;
		} else if (str.length() != rotated.length()) {
			return false;

		}
		else {
			String concatinated=str+str;
			return concatinated.contains(rotated);
		}

	}

}
