package com.kavinschool.loops;

/**
 * <p>
 * DoWhile class.
 * </p>
 *
 * @author kangs
 */
public class DoWhile {

	/**
	 * <p>
	 * main.
	 * </p>
	 *
	 * @param args an array of {@link String} objects
	 */
	public static void main(String[] args) {
		int count = 0;
		System.out.println("Before Loop Starts.");

		do {
			// if (count%2==0) continue;
			System.out.println("Current Value: " + count);
			if (count == 5) {
				break;
			}
		} while (++count <= 10);

		System.out.println("After Loop complete.");
	}

	public static class ForLoopBreakContinueExample {
		public static void main(String[] args) {
			// Example with 'break'
			System.out.println("Break example:");
			for (int i = 1; i <= 10; i++) {
				if (i == 5) {
					break; // Terminates the loop when i equals 5
				}
				System.out.println("i: " + i);
			}

			// Example with 'continue'
			System.out.println("\nContinue example:");
			for (int i = 1; i <= 10; i++) {
				if (i % 2 == 0) {
					continue; // Skips the current iteration if i is even
				}
				System.out.println("i: " + i);
			}
		}
	}

	public static class ForLoopBreakWithLabelExample {
		public static void main(String[] args) {
			// Defining a label for the outer loop
			outerLoop:
			for (int i = 1; true; i++) {
				for (int j = 1; j <= 3; j++) {
					System.out.println("i: " + i + ", j: " + j);
					if (i == 2 && j == 2) {
						System.out.println("Breaking out of outer loop");
						break outerLoop; // Breaks the outer loop labeled as 'outerLoop'
					}
				}
			}
			System.out.println("Loop exited.");
		}
	}

	public static class ForLoopBreakWithMultipleLabelsExample {
		public static void main(String[] args) {
			// Label for the outermost loop
			outerLoop:
			for (int i = 1; true; i++) {
				// Label for the inner loop
				innerLoop:
				for (int j = 1; j <= 3; j++) {
					System.out.println("i: " + i + ", j: " + j);

					// Condition to break out of the inner loop
					if (i == 1 && j == 2) {
						System.out.println("Breaking out of inner loop");
						break innerLoop; // Break only the inner loop
					}

					// Condition to break out of the outer loop
					if (i == 2 && j == 2) {
						System.out.println("Breaking out of outer loop");
						break outerLoop; // Break the outer loop
					}
				}
			}
			System.out.println("Loops exited.");
		}
	}
}
