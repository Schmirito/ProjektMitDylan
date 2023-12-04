package spielerKartenBaum;

public class Baum {
	Node root;
	Node parent;

	public Baum() {
	        root = null;
	    }

	public void insert(int value) {

		if (root == null) {
			root = new Node(value);

		} else {

			insert(root, value);
		}

	}

	private void insert(Node parent, int value) {
		if (parent.value >= value) {
			if (parent.left == null) {
				parent.left = new Node(value);

			} else {
				insert(parent.left, value);
			}
		} else {
			if (parent.value < value) {
				if (parent.right == null) {
					parent.right = new Node(value);
				} else {
					insert(parent.right, value);
				}

			}
		}

	}
	public void ausgabeKarten() {
		readValues(root);
	}
	
	public void readValues(Node parent) {
		    if(parent.left != null)
		      readValues(root.left);
		    System.out.print(parent.value);
		    if(parent.right != null)
		      readValues(parent.right);
		 
	}
}
