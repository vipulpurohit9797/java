import java.util.*;

public class BSTpreorder {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    static class Binarytree {
        static int index = -1;

        public static Node buildTree(int nodes[]) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public static void preorder(Node root) {
            if (root == null)
                return;
            System.out.println(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root) {
            if (root == null)
                return;
            inorder(root.left);
            System.out.println(root.data + " ");
            inorder(root.right);
        }

        public static void postorder(Node root) {
            if (root == null)
                return;
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        }

        public static void levelorder(Node root) {
            if (root == null)
                return;
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

        public static int countofnodes(Node root) {
            if (root == null) {
                return 0;
            }
            int leftnodes = countofnodes(root.left);
            int rightnodes = countofnodes(root.right);
            return leftnodes + rightnodes + 1;
        }

        // public static int sumofnodes(Node root) {
        // if (root == null) {
        // return 0;
        // }
        // int leftsum = countofnodes(root.left);
        // int rightsum = countofnodes(root.right);
        // return leftsum + rightsum + root.data;
        // }
        public static int sumOfNodes(Node root) {
            if (root == null) {
                return 0;
            }

            int leftSum = sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.right);
            return leftSum + rightSum + root.data;
        }

        public static int Height(Node root) {
            if (root == null)
                return 0;
            int leftheight = Height(root.left);
            int rightheight = Height(root.right);
            int myheight = Math.max(leftheight, rightheight) + 1;
            return myheight;
        }

        // O(n^2) approch for diameter
        public static int diameter(Node root) {
            if (root == null) {
                return 0;
            }
            int diam1 = diameter(root.left);
            int diam2 = diameter(root.right);
            int diam3 = Height(root.left) + Height(root.right) + 1;

            return Math.max(Math.max(diam1, diam2), diam3);
        }

        static class TreeInfo {
            int height;
            int diam;

            TreeInfo(int height, int diam) {
                this.height = height;
                this.diam = diam;
            }
        }

        public static TreeInfo diameter2(Node root) {
            if (root == null) {
                return new TreeInfo(0, 0);
            }
            TreeInfo left = diameter2(root.left);
            TreeInfo right = diameter2(root.right);
            int myHeight = Math.max(left.height, right.height) + 1;
            int diam1 = left.diam;
            int diam2 = right.diam;
            int diam3 = left.height + right.height + 1;
            int myDiam = Math.max(Math.max(diam1, diam2), diam3);

            TreeInfo myInfo = new TreeInfo(myHeight, myDiam);
            return myInfo;

        }

        public static void main(String args[]) {
            int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
            Binarytree tree = new Binarytree();

            Node root = tree.buildTree(nodes);
            // System.out.println(root.data);
            // preorder(root);
            // inorder(root);
            // postorder(root);
            // levelorder(root);
            // System.out.println(countofnodes(root));
            // System.out.println(sumOfNodes(root));
            // System.out.println(Height(root));
            // System.out.println(diameter(root));
            System.out.println(diameter2(root).diam);
        }

    }
}
