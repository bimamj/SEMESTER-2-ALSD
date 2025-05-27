public class DoubleLinkedListsMain {
    public static void main(String[] args) {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        dll.print();
        dll.addFirst(new Student("111", "Anton", "TI-1I", 3.57));
        dll.print();
        dll.addLast(new Student("112", "Prabowo", "TI-1I", 3.7));
        dll.print();
        dll.addFirst(new Student("113", "Herco", "TI-1I", 3.89));
        dll.print();
        dll.add(0, new Student("114", "Dilo", "TI-1I", 3.7));
        dll.print();
        dll.add(5, new Student("115", "Elon", "TI-1I", 4));
        dll.print();
        dll.removeAfter("114");
        dll.print();
        System.out.println("Total students: " + dll.getSize());
        if (dll.getLast() != null) {
            System.out.print("Last Student: ");
            dll.getLast().print();
        }
        Student studentAtIndex = dll.getIndex(1);
        System.out.print("Student at index 1: ");
        studentAtIndex.print();
        int index = dll.indexOf("111");
        System.out.println("Index of student with NIM 111: " + index);

        // dll.insertAfter("111", new Student("114", "Rizki", "TI-1I", 3.8));
        // dll.print();
        // dll.insertAfter("112", new Student("115", "Hanzel", "TI-1I", 3.6));
        // dll.print();
        // dll.insertAfter("120", new Student("116", "Eiyu", "TI-1I", 3.4));
        // dll.print();
        // dll.removeFirst();
        // dll.print();
        // dll.removeLast();
        // dll.print();
        // dll.remove(1);
        // dll.print();
    }
}
