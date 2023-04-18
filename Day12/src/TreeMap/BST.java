//package TreeMap;
//
//public class BST<E extends Comparable<E>> extends AbstractTree<E> {
//    protected TreeNode<E> root;
//    protected int size = 0;
//
//    public BST() {
//    }
//
//    public BST(E[] objects) {
//        for (int i = 0; i < objects.length; i++)
//            insert(objects[i]);
//    }
//
//    @Override
//    public boolean insert(E e) {
//        return false;
//    }
//
//    @Override
//    public int getSize() {
//        return 0;
//    }
//    @Override
//    public void inorder() {
//        inorder(root);
//    }
//
//    protected void inorder(TreeNode<E> root) {
//        if (root == null) return;
//        inorder(root.left);
//        System.out.println(root.element + " ");
//        inorder(root.right);
//    }
//
//
//}
