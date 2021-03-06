import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Problem Description -> https://www.hackerrank.com/challenges/the-love-letter-mystery/problem
 *
 * @author @Trushit777
 * @since 12-10-2020
 */
public class TheLoveLetterMystery {

	/**
	 * @param s
	 *
	 * @return int
	 */
	static int theLoveLetterMystery(String s) {
		int count=0;
		int len = s.length();
		for(int i=0;i<len/2;i++){
			if(!(s.charAt(i) == s.charAt(len-i-1))){
				count += Math.abs((int) s.charAt(i) - (int) s.charAt(len-i-1));
			}
		}
		return count;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String s = scanner.nextLine();

			int result = theLoveLetterMystery(s);

			bufferedWriter.write(String.valueOf(result));
			bufferedWriter.newLine();
		}
		bufferedWriter.close();
		scanner.close();
	}
}
