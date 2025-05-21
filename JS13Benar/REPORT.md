|  | Algorithm and Data Structure |
|--|--|
| NIM | 244107020123 |
| Name |Muhammad Bima Juliansyah|
| Class | TI - 1I |
| Repository | [link] (https://github.com/bimamj/SEMESTER-2-ALSD.git) |

# Jobsheet XIII Double Linked Lists

## 12.1 Experiment 1
### 12.2.1 Activity 1
### 12.2.2 Output Verification
![Screenshot](image/image1.png)

### 12.2.3 Questions Answers
1. Singly linked list only has reference to the next node, while doubly linked list can reference the next and previous node. Singly linked list only allows traversal in a single direction, while doubly linked list can traverse in both direction.
2. `next` is used to point to the next node on the list, and `prev` is used to point to the previous node on the list.
3. It is used to initialize the list to be empty by setting the `head` and `tail` to be null
4. It checks if the list is empty, then the new node becomes the first `head` and first `tail`
5. This connects the existing head's previous pointer to the new node, making the link backward from the old head to the new head.
6. This sets the previous pointer of the node after the insertion point to point back to the new node.
7. 
Traversal occurs in the `insertAfter()` and `print()` methods. `temp = temp.next;` moves the pointer to the next node in the list.
8. It handles the special case when the node you're inserting after is the last node (tail) in the list.
9. Checks whether the current node’s nim matches the key. Used to find the node then the new node should be inserted.