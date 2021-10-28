
public class tree {
    public static void main (String[] str) {
       Tree root =
               new Tree(20,
                       new Tree(7,
                               new Tree(4, null, new Tree(6)), new Tree(9)),
               new Tree(35,
                       new Tree(31, new Tree(28), null),
                       new Tree(40, new Tree(38), new Tree(52))));

       System.out.println("Tree's sum: " + root.sum());
    }

   static class Tree {
        int value;
        Tree left;
        Tree right;

        public Tree(int value, Tree left, Tree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Tree(int value) {
            this.value = value;
        }

        public int sum() {
            int count = value;
            if (left != null) {
                count += left.sum();
            }
            if (right != null) {
                count += right.sum();
            }
            return count;
        }
    }
}
