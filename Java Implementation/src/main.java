import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws FileNotFoundException {

		System.out.print("Hello!\n\n");

		System.out.print("Elements found inside input file: ");

		int count = 0;

		aabc()as

		Scanner scanner = new Scanner(new File(args[0]));

		while (scanner.hasNextInt()) {
			count++;

			System.out.print(scanner.nextInt()+" ");

		}

		System.out.print("\n\n" + "Total number of elements found in file: " + count + "\n");

		stack stk = new stack(count);

		scanner = new Scanner(new File(args[0]));

		while (scanner.hasNextInt()) {

			stk.push(scanner.nextInt());
		}

		System.out.print("\n");

		stk.list();

		while (!stk.isEmpty()) {

			System.out.print("Popping element: " + stk.pop() + "\n");

		}

		stk.list();

		return;

	}

}

class stack {

	private int[] st;
	private int top;
	private int size;

	stack(int s) {

		top = -1;
		st = new int[s];
		size = s;
	}

	void push(int n) {

		if (top > size) {
			System.out.print("STACK FULL!");
			return;
		}

		st[++top] = n;

		System.out.print("\nInserted: " + n + " to stack");
	}

	int pop() {

		if (top < 0) {

			System.out.print("STACK EMPTY");
			return 0;
		}

		return st[top--];

	}

	public boolean isEmpty() {

		if (top < 0)
			return true;
		else
			return false;

	}

	void list() {

		System.out.print("\nCurrent numbers inside stack from top to bottom: ");

		if (top < 0) {
			System.out.print("STACK IS EMPTY!\n");
			return;
		}

		for (int i = top; i >= 0; i--) {

			System.out.print(st[i] + " ");

		}

		System.out.println("\n");

	}

}
