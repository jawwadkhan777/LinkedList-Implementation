# Linked List Data Structure in Java

This repository contains the implementation of the Linked List data structure in Java. The Linked List is a fundamental data structure in computer science, providing a dynamic way to store and manage a sequence of elements.

## Project Overview 📚

As part of my ongoing journey in learning Data Structures and Algorithms (DSA) using Java, I have implemented the Linked List data structure. This project is a practical application of the concepts I have learned through YouTube tutorials and hands-on coding in IntelliJ IDEA.

### Linked List
- **Description:** A Linked List is a linear data structure where each element (node) points to the next, forming a sequence. Unlike arrays, Linked Lists are dynamic, allowing for efficient insertions and deletions.
- **Types Implemented:**
  - **Singly Linked List:** Each node contains data and a reference to the next node.
  - **Doubly Linked List:** Each node contains data, a reference to the next node, and a reference to the previous node.
  - **Circular Linked List:** The last node points back to the first node, forming a circle.
- **Time Complexity:** The time complexity of operations on a Linked List can vary depending on the type of operation and the specific variant of the Linked List (Singly, Doubly, or Circular). Here's a breakdown:
  - **Accessing an Element:**<br>
Singly/Doubly/Circular Linked List - O(n) To access an element at a specific index, the list must be traversed from the head (or tail, in the case of a Doubly Linked List), making it a linear time operation.
  - **Searching for an Element:**<br>
Singly/Doubly/Circular Linked List - O(n) Similar to accessing, searching requires traversing the list, so it also takes linear time.
  - **Insertion:**<br>
At the Beginning (Head) - O(1) Inserting a new element at the beginning of the list is a constant time operation, as it only involves updating pointers.<br>
At the End (Tail) - O(1) for Doubly Linked List and Circular Linked List if the tail pointer is maintained; O(n) for Singly Linked List without a tail pointer.<br>
At a Specific Position - O(n) To insert at a specific position, the list must be traversed to that position, leading to linear time complexity.<br>
  - **Deletion:**<br>
From the Beginning (Head) - O(1) Deleting the first element is a constant time operation.<br>
From the End (Tail) - O(1) for Doubly Linked List and Circular Linked List if the tail pointer is maintained; O(n) for Singly Linked List without a tail pointer.<br>
From a Specific Position - O(n) Similar to insertion, deletion from a specific position requires traversal, resulting in linear time complexity.<br>
- **Summary:**
Access/Search: O(n)
Insertion/Deletion at Head or Tail (with tail pointer): O(1)
Insertion/Deletion at a Specific Position: O(n)

### Key Features
- **Insertion:** Adding elements at the beginning, end, or specific position.
- **Deletion:** Removing elements from the beginning, end, or specific position.
- **Traversal:** Iterating through the list to access elements.
- **Search:** Finding an element within the list.

## Get Started 🚀

To get started with this project, simply clone this repository and open the desired Linked List implementation file in your preferred Java IDE (e.g., IntelliJ IDEA). No additional setup is required!

```bash
git clone https://github.com/jawwadkhan777/LinkedList-Implementation.git
```

## Support and Feedback 📧

If you encounter any issues while using this repository or have any suggestions for improvement, please feel free to reach out to the developer, @jawwadkhan777, via [email](mailto:m.jawwadkhan777@gmail.com) or connect on [LinkedIn](https://www.linkedin.com/in/jawwadkhan777/).
