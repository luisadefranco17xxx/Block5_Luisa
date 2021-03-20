package LinkedListed;

import javax.management.NotificationEmitter;
import java.rmi.NoSuchObjectException;

public class LinkedList {
    Node first;  //head, start, begin
    Node last;// tail, End

    public void add(int value) {
        Node newWagon = new Node();
        newWagon.value = value;

        if (first == null) { //emptyTrain
            first = newWagon;
            last = newWagon;
        } else {
            last.next = newWagon;   //wir hängen wagon hinter dran
            last = newWagon;
        }
    }
    // we like to deleteAt a node at position 3
    /*public void deleteAt(int position) {
      Node current = first;
      int index=1;
      position=position-1;
      if (position==0) {
          first=first.next;
          current.next=null;
      } else {
          while (current!=null){
                if (position == index){
                 //
                    Node deletenode=current.next;
                    current.next= current.next.next;
                    deletenode.next=null;// putze the referenz
                    if (deletenode == last){
                        last=current;
                    }
                    break;
                }
                current=current.next;
                index++;
            }
      }

    }*/
    public void deleteAt(int position){
        // 37 auf 58
        Node current = first;
        int index = 1;
        position = position - 1;   //weil wir etwas ein Platz vorher unternehmen sollen (den Link verarbeiten)
        if (position == 0)
        {
            first = first.next;
            current.next = null;
        }
        else {
            while (current != null) {
                if (position == index) {   //wir sind ein Platz vorher
                    // hier müssen wir was tun
                    // current = 37 // current.next = 19
                    Node deleteNode = current.next; // 19
                    current.next = deleteNode.next; /* current.next (19)  delete.next (58)   devo caricare in current.next in valore giusto */

                    deleteNode.next = null; // damit unser node nicht mehr auf den nächsten zeigt

                    if (last==deleteNode){ // bin ich am letzten Knoten
                        // last manipulieren
                        last = current;
                    }
                    break;
                }

                current = current.next;
                index++;
            }
        }
    }
    // is value is on the train return the Index, in other Fall return -1
    public int contains(int value){
        Node current = first;
        int index=1;
        while (current!=null){
             if(current.value==value){
                 return index;
             }
             current = current.next;
             index++;
        }

        return -1;
    }

    public Node getAt(int position ){
          Node current = first;
          int index =1;
          while (current != null){
              if (position == index){
                  return current;
              }
              current=current.next;
              index++;
          }
        return null;
    }

    public void printAllNodes() {
        Node current = first;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }

    }

    // einfügen an bestimmter stelle
    public void addElement(int position, int value) {
        Node newWagon = new Node();
        newWagon.value = value;

        if (first == null) {
            // we have an empty train
            first = newWagon;
            last = newWagon;
            return;
        }

        Node current = first;             // sind wir am Anfang?
        int index = 1;                    // Element einfügen - neu verketten
        position = position - 1;
        if (position == 0) {
            first = newWagon;
            newWagon.next = current;
            return; // our work is done
        }
        while (current != null){
            if (position == index) {
                Node next = current.next;   // 37
                current.next = newWagon;
                newWagon.next = next;
                if (current == last) { //
                    //last.next = newWagon;
                    last = newWagon;
                }
                break;
            }
            current = current.next;
            index++;
        }
    }

    public void changeValue(int position, int newVaue){
        Node current = first;
        int index = 1;


            while (current != null) {
                if (position == index) {

                    current.value = newVaue; /* current.next (19).next (58) */

                    break;
                }

                current = current.next;
                index++;

        }
    }
}
