package com.kh.treeMain;
/*
 * ��带 �����ϰ� ���ư��� ����ϴ� ����Ʈ��
 * ���� ��ȸ : root(�Ѹ�)�� ���� �湮
 * ���� ��ȸ : ���� ���� Ʈ���� �湮 �� root(�Ѹ�) �湮
 * ���� ��ȸ : ���� Ʈ�� ��� �湮 �� root(�Ѹ�) �湮
 * ���� ��ȸ : �� �� node�� ���� �Ʒ��������� ���ʴ�� �湮
 * */
public class BinaryTree {
	TreeNode root;
	public BinaryTree() {
		this.root = null;
	}
	/*
	 insert �޼���� insertRec �޼���� ���� Ʈ���� ���ο� ��带 �����ϴ� �� ���
	 * */
	
	//insert : �ܺο� ����Ǵ� �޼���
	public void insert(int data) {
		root = insertRec(root, data);
	}
	
	//insertRec ���� ���� �۾� �޼���
	//�����: �ڱ� �ڽ��� �����ϰ� �ٽ� �ڱ� �ڽ��� ����ؼ� ���� ����
	//��������� ��带 �����ϰ� ������ ��ġ�� ã�� ���ο� ��带 ����
	private TreeNode insertRec(TreeNode root, int data) {
		if( root == null ) {
			root = new TreeNode(data);
			return root;
		}
		
		if (data < root.data) {
			root.left = insertRec(root.left, data);
		} else if (data > root.data) {
			root.right = insertRec(root.right, data);
		}
		return root;
	}
	/*
	 * inOrderT : ���� ��ȸ 
	 * inOrderTR : ���� ��ȸ�� �����Ͽ� Ʈ���� ��带 ����ϴµ� ���
	 * ���� ����Ʈ�� ������ ������ ����Ʈ�� ������ ��� ���
	 * */
	public void inOrderT() {//inOrderTraversal ���� ��ȸ
		inOrderTR(root);
	}
	
	private void inOrderTR(TreeNode root) {
		if(root != null) {
			inOrderTR(root.left);
			System.out.println(root.data + " ");
			inOrderTR(root.right);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree tree = new BinaryTree();
		tree.insert(50);
		tree.insert(10);
		tree.insert(11);
		tree.insert(14);
		tree.insert(7);
		
		System.out.println("���� Ʈ���� ���� ��ȸ ��� : ");
		tree.inOrderT();
	}

}