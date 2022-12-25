package CodingNinja1;

class F_BinaryTree<T> {
	T data;
	F_BinaryTree<T> left;
	F_BinaryTree<T> right;

	F_BinaryTree(T data) {
		this.data = data;
	}
}

public class AAAAA {

	public static void printTree(F_BinaryTree<Integer> root) {
		if (root == null) {
			return;
		}
		int count = 0;
		printTree(root.left);

		root.data = count;
		System.out.print(root.data + " ");
		printTree(root.right);
		return;
	}

	public static void main(String[] args) {
//            1
//	        /   \
//         2     3
//         \     /
//		    4   5
		F_BinaryTree<Integer> root = new F_BinaryTree<>(1);
		F_BinaryTree<Integer> root_left = new F_BinaryTree<>(2);
		F_BinaryTree<Integer> root_right = new F_BinaryTree<>(3);

		root.left = root_left;
		root.right = root_right;

		F_BinaryTree<Integer> root_left_right = new F_BinaryTree<>(4);
		F_BinaryTree<Integer> root_right_left = new F_BinaryTree<>(5);
		root_left.right = root_left_right; // See the diagram above to understand.
		root_right.left = root_right_left;

		printTree(root);

	}
}
