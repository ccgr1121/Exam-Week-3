package main;

import java.util.ArrayList;

import org.omg.CORBA.StringSeqHelper;

public class OfflineExercises<multiChar> {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {

//		ArrayList<multiChar>chars = new ArrayList<multiChar>();

		String[] oldStr = input.split("");
		String newStr = new String();
		for (String c : oldStr) {
			newStr += c + c + c;
		}

		return newStr;
	}

	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "evilc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) {
//		String result = "";
//		int num1 = input.indexOf("bert");
//		int num2 = input.lastIndexOf("bert");
//		String subResult = input.substring(num1, num2);
//
//		for (int i = num2 - 1; i > num1 + 3; i--) {
//			result += subResult.toCharArray()[i];
//			// System.out.println(input.charAt(i) + result);
//
//		}
//
//		System.out.println(result);
//		return result;

		String x = "";
		if (input.toLowerCase().contains("bert")) {
			if (input.toLowerCase().substring(input.toLowerCase().indexOf("bert") + 4).contains("bert")) {
				String y = input.toLowerCase().substring(input.toLowerCase().indexOf("bert") + 4,
						input.toLowerCase().lastIndexOf("bert"));
				for (int i = y.length() - 1; i >= 0; i--) {
					x += y.toCharArray()[i];
				}

			}
		}
		return x;
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c) {

		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(a);
		nums.add(b);
		nums.add(c);
		nums.sort(null);
		int check1 = nums.get(2) - nums.get(1);
		int check2 = nums.get(2) - nums.get(0);

		if ((check1 * 2) == check2) {
			return true;
		}

		return false;
	}

	// Given a string and an int n, return a string that removes n letters from the
	// 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input
	// is odd.

	// nMid("Hello", 3) → "Ho"
	// nMid("Chocolate", 3) → "Choate"
	// nMid("Chocolate", 1) → "Choclate"

	public String nMid(String input, int a) {
//		int mid = input.length() / 2 - 1;
//		int num1 = mid - (a / 1);
//		int num2 = mid + (a / 2);
//
//		String sub1 = input.substring(0, num1);
//		String sub2 = input.substring(num2, input.length() - 1);
//
//		String result = "";
//		result = sub1 + sub2;

		int len = input.length();
		int midIndex = len / 2;
		int offset = a / 2;
		String oldStrStart = input.substring(0, (midIndex - offset));
		String oldStrEnd = input.substring((len - midIndex + offset), len);

		return oldStrStart + oldStrEnd;
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") → true
	// endsDev("wehateDev") → true
	// endsDev("everoyonehatesdevforreal") → false
	// endsDev("devisnotcool") → false

	public boolean endsDev(String input) {

//		int num1 = input.indexOf("dev");
//		int num2 = input.indexOf("Dev");
//
//		for (int i = num1 - 1; i > 1;) {
//			return true;
//		}
//
//		for (int i = num2 - 1; i > 1;) {
//			return true;
//		}

	return input.toLowerCase().endsWith("dev");
		

	}

	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		return -1;

	}

	// given a string - return the number of times "am" appears in the String
	// ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by
	// other letters
	//
	// amISearch("Am I in Amsterdam") → 1
	// amISearch("I am in Amsterdam am I?") → 2
	// amISearch("I have been in Amsterdam") → 0

	public int amISearch(String arg1) {

		int counter = 0;
		String lowerCaseArg = arg1.toLowerCase();


		String[] ary = lowerCaseArg.split(" ");
		for (String element : ary) {
			if (element.contentEquals("am")) {
				counter++;
			}
		}

		return counter;

	}

	// given a number
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3 and 5return "fizzbuzz"
	//
	// fizzBuzz(3) → "fizz"
	// fizzBuzz(10) → "buzz"
	// fizzBuzz(15) → "fizzbuzz"

	public String fizzBuzz(int arg1) {

		if (arg1 % 3 == 0 && arg1 % 5 != 0) {
			return "fizz";
		} else {
			if (arg1 % 3 != 0 && arg1 % 5 == 0) {
				return "buzz";
			} else {
				if (arg1 % 3 == 0 && arg1 % 5 == 0) {
					return "fizzbuzz";
				} else {
					return "null";
				}
			}
		}
	}

	// Given a string split the string into the individual numbers present
	// then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	// largest("55 72 86") → 14
	// largest("15 72 80 164") → 11
	// largest("555 72 86 45 10") → 15

	public int largest(String arg1) {

		String[] ary = arg1.split(" ");
		for (String num : ary) {
			String[] numAry = num.split("");
			for (String c : numAry) {
				int strAsInt = Integer.parseInt(c);
				System.out.println(strAsInt);
			}
		}

		return 0;
	}

}
