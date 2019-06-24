public class Main {
    public static void main(String[] args) {
        // write your code here
//        int[] arr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i;
//        }
//
//        int[] scores = new int[]{100, 99, 66};
//        for (int i = 0; i < scores.length; i++) {
//            System.out.println(scores[i]);
//        }
//
//        scores[0] = 98;
//
//        for (int score : scores) {
//            System.out.println(score);
//        }

        Array<Integer> array = new Array<>();
        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }
        System.out.println(array);

        array.addMiddle(100, 1);
        System.out.println(array);

        array.addFirst(31);
        System.out.println(array);

        array.addLast(13);
        System.out.println(array);

        System.out.println(array.contains(31));

        int target = 31;
        System.out.println(target + "位于第" + (array.search(target) + 1) + "位！");

        System.out.println("删除的元素是：" + array.remove(6));
        System.out.println(array);

        System.out.println("删除成功与否：" + array.removeElement(100));
        System.out.println(array);

        System.out.println("删除的元素是：" + array.removeFirst());
        System.out.println(array);


        System.out.println("删除的元素是：" + array.removeLast());
        System.out.println(array);
    }
}
