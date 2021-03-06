import java.util.Arrays;
import java.util.Random;

/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 3;

	/**
	 * The number of values to shuffle.
	 */
	private static final int VALUE_COUNT = 52;

	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = new int[VALUE_COUNT];
		for (int i = 0; i < values1.length; i++) {
			values1[i] = i;
			}
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = new int[VALUE_COUNT];
		for (int i = 0; i < values2.length; i++) {
			values2[i] = i;
			}
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {

		int[] shuffled = new int[VALUE_COUNT];
		int k = 0;
		
		for(int j = 0; j < VALUE_COUNT / 2; j++)//Distribute the first half of values to the even indices of shuffled
		{
			shuffled[k] = values[j];
			k += 2;
		}
	
		k = 1;
		
		
		for(int j = VALUE_COUNT / 2; j < VALUE_COUNT; j++)//Distribute the second half of values to the odd indices of shuffled
		{
			shuffled[k] = values[j];
			k +=2;
		}
		
		for(int i = 0; i < VALUE_COUNT; i++)
		{
			values[i] = shuffled[i];
		}
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
		
		Random rand = new Random();
		for(int k = VALUE_COUNT - 1; k > 0; k--)
		{
			int r = rand.nextInt(k+1);
			int temp = values[r];
			values[r] = values[k];
			values[k] = temp;
		}
	}
	
	public static boolean arePermutations(int[] a1, int[] a2)
	{
		boolean isPermutation = true;
		
		int[] array1 = doInsertionSort(a1);
		int[] array2 = doInsertionSort(a2);
		for(int i = 0; i < array1.length; i++)
		{
			if(array1[i] != array2[i])
			{
				isPermutation = false;
			}
		}
		return isPermutation;
	}
	
	public static int[] doInsertionSort(int[] input){
        
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }
}
