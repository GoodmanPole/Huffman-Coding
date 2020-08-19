import java.io.*;
import java.util.*;

//Java implementation of Min Heap 
/*class MinHeap {
	private int[] Heap;
	private int size;
	private int maxsize;

	private static final int FRONT = 1;

	public MinHeap(int maxsize) {
		this.maxsize = maxsize;
		this.size = 0;
		Heap = new int[this.maxsize + 1];
		Heap[0] = Integer.MIN_VALUE;
	}

	// Function to return the position of
	// the parent for the node currently
	// at pos
	private int parent(int pos) {
		return pos / 2;
	}

	// Function to return the position of the
	// left child for the node currently at pos
	private int leftChild(int pos) {
		return (2 * pos);
	}

	// Function to return the position of
	// the right child for the node currently
	// at pos
	private int rightChild(int pos) {
		return (2 * pos) + 1;
	}

	// Function that returns true if the passed
	// node is a leaf node
	private boolean isLeaf(int pos) {
		if (pos >= (size / 2) && pos <= size) {
			return true;
		}
		return false;
	}

	// Function to swap two nodes of the heap
	private void swap(int fpos, int spos) {
		int tmp;
		tmp = Heap[fpos];
		Heap[fpos] = Heap[spos];
		Heap[spos] = tmp;
	}

	// Function to heapify the node at pos
	private void minHeapify(int pos) {

		// If the node is a non-leaf node and greater
		// than any of its child
		if (!isLeaf(pos)) {
			if (Heap[pos] > Heap[leftChild(pos)] || Heap[pos] > Heap[rightChild(pos)]) {

				// Swap with the left child and heapify
				// the left child
				if (Heap[leftChild(pos)] < Heap[rightChild(pos)]) {
					swap(pos, leftChild(pos));
					minHeapify(leftChild(pos));
				}

				// Swap with the right child and heapify
				// the right child
				else {
					swap(pos, rightChild(pos));
					minHeapify(rightChild(pos));
				}
			}
		}
	}

	// Function to insert a node into the heap
	public void insert(int element) {
		if (size >= maxsize) {
			return;
		}
		Heap[++size] = element;
		int current = size;

		while (Heap[current] < Heap[parent(current)]) {
			swap(current, parent(current));
			current = parent(current);
		}
	}

	// Function to print the contents of the heap
	public void print() {
		for (int i = 1; i <= size / 2; i++) {
			System.out.print(
					" PARENT : " + Heap[i] + " LEFT CHILD : " + Heap[2 * i] + " RIGHT CHILD :" + Heap[2 * i + 1]);
			System.out.println();
		}
	}

	// Function to build the min heap using
	// the minHeapify
	public void minHeap() {
		for (int pos = (size / 2); pos >= 1; pos--) {
			minHeapify(pos);
		}
	}

	// Function to remove and return the minimum
	// element from the heap
	public int remove() {
		int popped = Heap[FRONT];
		Heap[FRONT] = Heap[size--];
		minHeapify(FRONT);
		return popped;
	}

	int getSize() {
		return size;
	}

	// Driver code

}*/

class Node {
	private int charNum;
	private char charSymbol;
	private Node left, right;

	void setNumber(int cN) {
		charNum = cN;
	}

	void setCharacters(char cS) {
		charSymbol = cS;
	}

	void setLeftNext(Node ln) {
		left = ln;
	}

	void setRightNext(Node rn) {
		right = rn;
	}

	int getNumber() {
		return charNum;
	}

	char getCharacters() {
		return charSymbol;
	}

	Node getLeftNext() {
		return (left);
	}

	Node getRightNext() {
		return (right);
	}

	Node(int cN, char cS, Node l, Node r) {
		charNum = cN;
		charSymbol = cS;
		left = l;
		right = r;
	}

	Node() {
		this(0, '!', null, null);
	}
}

public class Huffman {
	static String[] huffmanCodes;
	static int index = 0;

	public static void arrays(String s) {
		// str ;
		//// define array incude all 63 characters
		char[] charactersArray = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
				'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
				'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4',
				'5', '6', '7', '8', '9', '_' };
		////
		//// difine array for number of the characters
		int[] charNumber = new int[63];
		////
		//// fill charNumber of number of each charecters
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A') {
				charNumber[0]++;
			}
			if (s.charAt(i) == 'B') {
				charNumber[1]++;
			}
			if (s.charAt(i) == 'C') {
				charNumber[2]++;
			}
			if (s.charAt(i) == 'D') {
				charNumber[3]++;
			}
			if (s.charAt(i) == 'E') {
				charNumber[4]++;
			}
			if (s.charAt(i) == 'F') {
				charNumber[5]++;
			}
			if (s.charAt(i) == 'G') {
				charNumber[6]++;
			}
			if (s.charAt(i) == 'H') {
				charNumber[7]++;
			}
			if (s.charAt(i) == 'I') {
				charNumber[8]++;
			}
			if (s.charAt(i) == 'J') {
				charNumber[9]++;
			}
			if (s.charAt(i) == 'K') {
				charNumber[10]++;
			}
			if (s.charAt(i) == 'L') {
				charNumber[11]++;
			}
			if (s.charAt(i) == 'M') {
				charNumber[12]++;
			}
			if (s.charAt(i) == 'N') {
				charNumber[13]++;
			}
			if (s.charAt(i) == 'O') {
				charNumber[14]++;
			}
			if (s.charAt(i) == 'P') {
				charNumber[15]++;
			}
			if (s.charAt(i) == 'Q') {
				charNumber[16]++;
			}
			if (s.charAt(i) == 'R') {
				charNumber[17]++;
			}
			if (s.charAt(i) == 'S') {
				charNumber[18]++;
			}
			if (s.charAt(i) == 'T') {
				charNumber[19]++;
			}
			if (s.charAt(i) == 'U') {
				charNumber[20]++;
			}
			if (s.charAt(i) == 'V') {
				charNumber[21]++;
			}
			if (s.charAt(i) == 'W') {
				charNumber[22]++;
			}
			if (s.charAt(i) == 'X') {
				charNumber[23]++;
			}
			if (s.charAt(i) == 'Y') {
				charNumber[24]++;
			}
			if (s.charAt(i) == 'Z') {
				charNumber[25]++;
			}
			if (s.charAt(i) == 'a') {
				charNumber[26]++;
			}
			if (s.charAt(i) == 'b') {
				charNumber[27]++;
			}
			if (s.charAt(i) == 'c') {
				charNumber[28]++;
			}
			if (s.charAt(i) == 'd') {
				charNumber[29]++;
			}
			if (s.charAt(i) == 'e') {
				charNumber[30]++;
			}
			if (s.charAt(i) == 'f') {
				charNumber[31]++;
			}
			if (s.charAt(i) == 'g') {
				charNumber[32]++;
			}
			if (s.charAt(i) == 'h') {
				charNumber[33]++;
			}
			if (s.charAt(i) == 'i') {
				charNumber[34]++;
			}
			if (s.charAt(i) == 'j') {
				charNumber[35]++;
			}
			if (s.charAt(i) == 'k') {
				charNumber[36]++;
			}
			if (s.charAt(i) == 'l') {
				charNumber[37]++;
			}
			if (s.charAt(i) == 'm') {
				charNumber[38]++;
			}
			if (s.charAt(i) == 'n') {
				charNumber[39]++;
			}
			if (s.charAt(i) == 'o') {
				charNumber[40]++;
			}
			if (s.charAt(i) == 'p') {
				charNumber[41]++;
			}
			if (s.charAt(i) == 'q') {
				charNumber[42]++;
			}
			if (s.charAt(i) == 'r') {
				charNumber[43]++;
			}
			if (s.charAt(i) == 's') {
				charNumber[44]++;
			}
			if (s.charAt(i) == 't') {
				charNumber[45]++;
			}
			if (s.charAt(i) == 'u') {
				charNumber[46]++;
			}
			if (s.charAt(i) == 'v') {
				charNumber[47]++;
			}
			if (s.charAt(i) == 'w') {
				charNumber[48]++;
			}
			if (s.charAt(i) == 'x') {
				charNumber[49]++;
			}
			if (s.charAt(i) == 'y') {
				charNumber[50]++;
			}
			if (s.charAt(i) == 'z') {
				charNumber[51]++;
			}
			if (s.charAt(i) == '0') {
				charNumber[52]++;
			}
			if (s.charAt(i) == '1') {
				charNumber[53]++;
			}
			if (s.charAt(i) == '2') {
				charNumber[54]++;
			}
			if (s.charAt(i) == '3') {
				charNumber[55]++;
			}
			if (s.charAt(i) == '4') {
				charNumber[56]++;
			}
			if (s.charAt(i) == '5') {
				charNumber[57]++;
			}
			if (s.charAt(i) == '6') {
				charNumber[58]++;
			}
			if (s.charAt(i) == '7') {
				charNumber[59]++;
			}
			if (s.charAt(i) == '8') {
				charNumber[60]++;
			}
			if (s.charAt(i) == '9') {
				charNumber[61]++;
			}
			if (s.charAt(i) == ' ') {
				charNumber[62]++;
			}

		}
		////
		shortArray(charNumber, charactersArray);

	}

	public static void shortArray(int[] charNumber, char[] charactersArray) {
		int newArraySize = 0, j = 0;
		for (int i = 0; i < charNumber.length; i++) {
			if (charNumber[i] != 0)
				newArraySize++;
		}
		char[] newShortestArray = new char[newArraySize];
		int[] newShortestNArray = new int[newArraySize];

		for (int i = 0; i < charNumber.length; i++) {
			if (charNumber[i] != 0) {
				newShortestArray[j] = charactersArray[i];
				newShortestNArray[j] = charNumber[i];
				j++;
			}
		}

		sort(newShortestNArray, newShortestArray, 0, newShortestNArray.length - 1);
		Node rf = huffmanTreeMaker(newShortestNArray, newShortestArray);

		// Making The String Array without null
		huffmanCodes = new String[newShortestArray.length];
		for (int z = 0; z < huffmanCodes.length; z++)
			huffmanCodes[z] = "";
		// int i=0;
		String str = "";

		postOrder(rf, str);
		// System.out.print(newShortestArray[c]);

		// System.out.println(huffmanCodes[5]);
		writeFileTable(newShortestArray, huffmanCodes);
		encode(newShortestArray);

	}

	static Node huffmanTreeMaker(int[] num, char[] alpha) {
		// System.out.println(alpha[0]);
		int j = 0;
		int n = num.length - 1;
		int c = n;
		Node[] rarray = new Node[(2 * (n + 1))];
		char[] qAlpha = new char[(2 * (n + 1))];
		int[] qNum = new int[(2 * (n + 1))];
		// System.out.println(qNum.length);
		// System.out.println(qAlpha.length);

		// Array copy
		for (int i = 0; i < num.length; i++) {
			qNum[i] = num[i];
			qAlpha[i] = alpha[i];
		}

		// System.out.println(qNum[qNum.length-1]);

		// System.out.print(qAlpha[0]);
		for (int i = 0; i < n; i++) {
			Node r = new Node();
			extract_min(r, qAlpha, qNum, rarray, j);
			insert(r, r.getNumber(), r.getCharacters(), rarray, qAlpha, qNum, c);
			c++;
			j += 2;
		}
		return rarray[j];

	}

	static void extract_min(Node r, char[] qAlpha, int[] qNum, Node[] rarray, int j) {

		Node r1 = new Node();
		Node r2 = new Node();

		if (qAlpha[j] != '/') {

			r1.setLeftNext(null);
			r1.setRightNext(null);
			r1.setNumber(qNum[j]);
			r1.setCharacters(qAlpha[j]);
			r.setLeftNext(r1);
			qNum[j] = -1;
			qAlpha[j] = '/';

		} else {
			r.setLeftNext(rarray[j]);
			qNum[j] = -1;
		}
		if (qAlpha[j + 1] != '/') {

			r2.setLeftNext(null);
			r2.setRightNext(null);
			r2.setNumber(qNum[j + 1]);
			r2.setCharacters(qAlpha[j + 1]);
			r.setRightNext(r2);
			qNum[j + 1] = -1;
			qAlpha[j + 1] = '/';

			r.setNumber(r.getLeftNext().getNumber() + r.getRightNext().getNumber());
			// System.out.println(r.getNumber());
			r.setCharacters('/');
		} else {
			r.setRightNext(rarray[j + 1]);
			qNum[j + 1] = -1;

			r.setNumber(r.getLeftNext().getNumber() + r.getRightNext().getNumber());
			// System.out.println(r.getNumber());
			r.setCharacters('/');
		}

	}

	static void insert(Node r, int rnum, char rchar, Node[] rarray, char[] qAlpha, int[] qNum, int c) {
		int i = 0;
		// System.out.println(qAlpha.length);
		// System.out.println(rnum);
		for (; i < qNum.length; i++) {
			if (i >= c) {
				qNum[i + 1] = rnum;
				qAlpha[i + 1] = rchar;
				rarray[i + 1] = r;
				break;
			}
			if (rnum <= qNum[i] && qNum[i] != -1) {
				// i++;
				for (int j = c; j > i; j--) {
					qNum[j + 1] = qNum[j];
					qAlpha[j + 1] = qAlpha[j];
					rarray[j + 1] = rarray[j];
				}
				qNum[i + 1] = rnum;
				qAlpha[i + 1] = rchar;
				rarray[i + 1] = r;
				// System.out.println(rarray[i+1].getNumber()+"-");
				break;
			}
		}
	}

	static void postOrder(Node r, String coding) {

		if (r != null) {

			if (r.getLeftNext() == null && r.getRightNext() == null) {
				huffmanCodes[index++] += coding;
				// System.out.println(coding);
				return;
			}
			// first recur on left subtree
			postOrder(r.getLeftNext(), coding + "0");
			// System.out.println(coding);

			// then recur on right subtree
			postOrder(r.getRightNext(), coding + "1");
			// System.out.println(coding);
		}
	}

	static void writeFileTable(char[] alpha, String[] code) {
		try {
			FileWriter fw = new FileWriter("E:\\Coding.table");
			for (int i = 0; i < alpha.length; i++) {
				fw.write(alpha[i] + " ");
				fw.write(code[i] + "\n");
			}
			fw.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Success...");
	}

	static void encode(char[] alpha) {
		String str = "";
		String str2 = "";
		try {
			File myObj = new File("E:/filename.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				// System.out.println(data);
				str += data;

			}
			myReader.close();
			for (int i = 0; i < str.length(); i++) {
				for (int j = 0; j < alpha.length; j++) {
					if (str.charAt(i) == alpha[j]) {
						str2 += huffmanCodes[j];
					}
				}
				// System.out.println(str2);
				byte[] strByte = str.getBytes();
				try {
					FileWriter fw = new FileWriter("E:\\EncodedFilename.Huffman");
					for (int x = 0; x < strByte.length; x++) {
						fw.write(strByte[i]);

					}
					fw.close();

				} catch (Exception e) {
					System.out.println(e);
				}
				System.out.println("Success...");
			}

		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}


	static void merge(int arr[], char carr[], int l, int m, int r) {
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];
		char L1[] = new char[n1];
		char R1[] = new char[n2];
		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i) {
			L[i] = arr[l + i];
			L1[i] = carr[l + i];
		}
		for (int j = 0; j < n2; ++j) {
			R[j] = arr[m + 1 + j];
			R1[j] = carr[m + 1 + j];
		}

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				carr[k] = L1[i];
				arr[k] = L[i];
				i++;
			} else {
				carr[k] = R1[j];
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			carr[k] = L1[i];
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			carr[k] = R1[j];
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	static void sort(int arr[], char carr[], int l, int r) {
		if (l < r) {
			// Find the middle point
			int m = (l + r) / 2;

			// Sort first and second halves
			sort(arr, carr, l, m);
			sort(arr, carr, m + 1, r);

			// Merge the sorted halves
			merge(arr, carr, l, m, r);
		}
	}

	public static void main(String[] args) {
		//// read txt file in drive E
		String str = "";
		try {
			File myObj = new File("E:/filename.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				// System.out.println(data);
				str += data;

			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		/////
		// System.out.println(str);

		arrays(str);
	}

}
