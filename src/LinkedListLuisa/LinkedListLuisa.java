package LinkedListLuisa;

public class LinkedListLuisa {
    NodeLuisa first;
    NodeLuisa last;

    public void printNode(){
        NodeLuisa current=first;
        while(current!=null){
            System.out.print("current.value -> " + current.value);
            current=current.next;
        }
    }

    public void addAtPosition(int myPosition, int myValue) {
        NodeLuisa myNewNode = new NodeLuisa();
        myNewNode.value=myValue;

        if (first==null) {
            first = myNewNode;
            last = myNewNode;
            last.next=null;
            return;
        }

        NodeLuisa current=first;
        int index = 1;                    // Element einfügen - neu verketten
        myPosition = myPosition - 1;
        if(myPosition == 0){
            first=myNewNode;
            myNewNode.next=current;
            return;
        }

        while(current!=null){
            if(myPosition ==index){
                NodeLuisa next=current.next;
                current.next=myNewNode;
                myNewNode.next=next;
                if(current==last){
                    last=myNewNode;
                }
                break;
            }
            current=current.next;
            index++;
        }
    }
}
