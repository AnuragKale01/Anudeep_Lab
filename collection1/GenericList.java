package collection1;
/*Create a generic class called GenericList that uses an ArrayList internally to store elements of a specific type. Implement methods to add elements to the list, retrieve elements by index, and print the list*/
import java.util.ArrayList;

public class GenericList<T> {
    private ArrayList<T> elements;

    public GenericList() {
        elements = new ArrayList<>();
    }

    public void addElement(T element) {
        elements.add(element);
    }

    public T getElement(int index) {
        if (index >= 0 && index < elements.size()) {
            return elements.get(index);
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }
    }

    public void printList() {
        System.out.print("List Elements: ");
        for (T element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        GenericList<Integer> intList = new GenericList<>();
        intList.addElement(10);
        intList.addElement(20);
        intList.addElement(30);
        intList.printList();

        GenericList<String> stringList = new GenericList<>();
        stringList.addElement("Hello");
        stringList.addElement("World");
        stringList.printList();
    }
}
