public class BinaryTree{

	public static Node createTree(int[] arr, int index){
		if(index >= arr.length) return null;
		Node newNode = new Node(arr[index]);
		newNode.left = createTree(arr, (2 * index) + 1);
		newNode.right = createTree(arr, (2 * index) + 2);				
		return newNode;
	}


	public static void printPre(Node current){
		System.out.print(current.data + " ");
		if(current.left != null) printPre(current.left);
		if(current.right != null) printPre(current.right);
	}

	public static void printPost(Node current){
		if(current.left != null) printPost(current.left);
		if(current.right != null) printPost(current.right);
		System.out.print(current.data + " ");
	}

	public static void printIn(Node current){
		if(current.left != null) printIn(current.left);
		System.out.print(current.data + " ");
		if(current.right != null) printIn(current.right);
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,44,5,6,7,8,9};
		Node root = createTree(arr, 0);
		System.out.print("Pre -> ");
		printPre(root);
		System.out.println();
		System.out.print("Post -> ");
		printPost(root);
		System.out.println();
		System.out.print("In -> ");
		printIn(root);
	}
}


class Node{
	int data;
	Node left;
	Node right;

	Node(int data){
		left = null;
		right = null;
		this.data = data;
	}
}