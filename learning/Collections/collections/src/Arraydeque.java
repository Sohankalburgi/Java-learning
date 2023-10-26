import java.util.ArrayDeque;

 class Arraydequesfirst {
    public static void main(String[] args) {
        ArrayDeque a = new ArrayDeque();
        a.add(100);
        a.add(200);
        a.addFirst(300); // adds at the first
        a.addLast(400); // adds at the last
        a.add(200); // ArrayDeque allows duplicate
        System.out.println(a);

        a.add("sohan");
        a.add(5.6);
        a.add('j');
        System.out.println(a);

        a.offer(500);
        a.offerFirst(11); // offer method is use to take add in data structures if it needs or not
        a.offerLast(1);
        System.out.println(a);
    }
}
