public class ExcuseLetterStack19 {
    ExcuseLetter19[] stack;
    int top, size;
    public ExcuseLetterStack19(int size) {
        this.size = size;
        top = -1;
        stack = new ExcuseLetter19[size];
    }

    boolean isFull() {
        return top == size -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(ExcuseLetter19 std) {
        if(!isFull()) {
            top++;
            stack[top] = std;
        } else {
            System.out.println("Stack is already full!");
        }
    }

    ExcuseLetter19 pop() {
        if(!isEmpty()) {
            ExcuseLetter19 std = stack[top];
            top--;
            return std;
        } else {
            System.out.println("There is no data in Stack!");
            return null;
        }
    }

    ExcuseLetter19 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else { 
            System.out.println("There is no data in Stack!");
            return null;
        }
    }

    void searchByName(String name) {
        boolean found = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].name.equalsIgnoreCase(name)) {
                System.out.println("Excuse letter found:");
                stack[i].display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No letter found for student: " + name);
        }
    }
}
