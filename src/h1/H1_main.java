package h1;

public class H1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node e = new Node(null);
		Node d = new Node(e);
		Node c = new Node(d);
		Node b = new Node(c);
		Node a = new Node(b);
		//System.out.println(distance(e, e));
	}

	public static int distance(Node x, Node y) {
		if (x == y) {
			return 0;
		}
		return 1 + distance(x.getNext(), y);
	}
}
