package com.jza.pramp;

public class SalesPath {
	public static class Node {

		int cost;
		Node[] children;
		Node parent;

		public Node(int cost) {
			this.cost = cost;
			children = null;
			parent = null;
		}
	}


	public static int getCheapestCost(Node rootNode) {
		System.out.println("cost = " + rootNode.cost);

		if (rootNode.children == null || rootNode.children.length == 0) {
			System.out.println("children = 0 -> return");
			return rootNode.cost;
		}
		System.out.println("children = " + rootNode.children.length);
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < rootNode.children.length; i++) {
			int tmpCost = getCheapestCost(rootNode.children[i]);
			if (tmpCost < min) {
				min = tmpCost;
			}
		}

		return min + rootNode.cost;
	}

	public static int testCase() {
		Node root = new Node(0);
		Node n1 = new Node(5);
		Node n2 = new Node(3);
		Node n3 = new Node(6);
		Node n4 = new Node(4);
		Node n5 = new Node(2);
		Node n6 = new Node(0);
		Node n7 = new Node(1);
		Node n8 = new Node(5);
		Node n9 = new Node(1);
		Node n10 = new Node(10);
		Node n11 = new Node(1);

		n1.children = new Node[]{n4};
		n2.children = new Node[]{n5, n6};
		n3.children = new Node[]{n7, n8};
		n5.children = new Node[]{n9};
		n6.children = new Node[]{n10};
		n9.children = new Node[]{n11};
		root.children = new Node[]{n1, n2, n3};
		int min = SalesPath.getCheapestCost(root);
		System.out.println(min);
		return min;
	}
}
