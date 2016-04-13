import java.util.*;

public class PalindromeNumber {

	/**
	 * @param args
	 */
	
	public boolean checkPalindrome(int num) {
		String number = Integer.toString(num);
		int size = number.length();
		
		for(int i=0; i<number.length()/2; i++){
			int oppSide = number.length()-1-i;
			if(number.charAt(i) != number.charAt(oppSide))
				return false;
		}
		
		return true;
	}
	
	public ArrayList<Integer> findDigitPalindromes(int digits) {
		String s = "";
		for(int i=0; i<digits; i++){
			s = s + "9";
		}
		
		ArrayList<Integer> palindromes = new ArrayList();
		
		int digitNum = Integer.parseInt(s);
		int largestNum = digitNum*digitNum;
		
		for(int n=largestNum; n>0; n--){
			if(checkPalindrome(n))
				palindromes.add(n);
		}
		
		System.out.println(palindromes.toString());
		
		return palindromes;
	}
	
	//Find the largest palindrome from the product of two #-digit numbers
	public int findLargestPalindrome(int digits){
		int answer;
		
		ArrayList<Integer> list = findDigitPalindromes(digits);
		
		int smallest = 10^(digits-1);
		smallest = smallest * smallest;
		
		int i = 0;
		while(list.get(i) > smallest){
			list.get(i);
			
			i++;
		}
		
		return answer;
	}
	
	public void findDigitFactors(int product, int digits){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user = new Scanner(System.in);
		int test = 0;
		
		PalindromeNumber pn = new PalindromeNumber();
		
		System.out.print("Enter number: ");
		test = Integer.parseInt(user.next()); 
		
		pn.findDigitPalindromes(test);
	}

}
