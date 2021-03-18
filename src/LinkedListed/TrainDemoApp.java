package LinkedListed;

public class TrainDemoApp {
    public static void main(String[] args) {

        LinkedList linkedList=new LinkedList();
        linkedList.add(5);
        linkedList.add(566);
        linkedList.add(27);

        linkedList.printAllNodes();
        System.out.println("contain" + linkedList.contains(566));
        System.out.println("contain" + linkedList.contains(6));
        System.out.println("contain" + linkedList.contains(27));

        System.out.println("linkedList" + linkedList.getAt(1).value);
        System.out.println("linkedList" + linkedList.getAt(2).value);
        //System.out.println("linkedList" + linkedList.getAt(10).value);
        linkedList.deleteAt(2);
        linkedList.printAllNodes();
        System.out.println();
        linkedList.deleteAt(1);
        linkedList.printAllNodes();
        System.out.println();
        linkedList.add(5);
        linkedList.add(566);
        linkedList.add(27);
        linkedList.add(6);
        linkedList.add(888);
        linkedList.add(88);
        linkedList.printAllNodes();

        System.out.println();
        //linkedList.deleteAt(4);
        linkedList.printAllNodes();
        System.out.println();
        linkedList.addElement(3,9999);
        linkedList.printAllNodes();
    }
}
