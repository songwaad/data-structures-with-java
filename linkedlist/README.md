# Reverse Number Program Using Stack

This program is designed to demonstrate the use of **Stacks** in Java by implementing a reverse number sorting mechanism. The program utilizes three stacks (A, B, C) to manage and manipulate data. It showcases fundamental operations of stack-based algorithms such as **PUSH** and **POP**.

## Key Features
1. **Stack Initialization**  
   - Users can specify the number of levels (size) for the stacks.
   - Ensures valid input; non-integer or invalid data will prompt a re-entry.

2. **Number Input (Stack A)**  
   - Users input numbers into Stack A using the **PUSH** operation.
   - Numbers must follow a decreasing order. If a number equal to or larger than the previous input is entered, the program prompts the user to enter a smaller value.
   - Stack overflow (exceeding the specified size) is handled with appropriate error messages.

3. **Reversing Data Between Stacks**  
   - Users can move data between Stacks A, B, and C using **POP** and **PUSH** operations.
   - The program supports continuous data transfer and reversal between stacks.
   - Handles underflow scenarios gracefully, displaying an error message if an empty stack is accessed.

## Algorithms Used
- **PUSH**: Adds an element to the top of the stack.
- **POP**: Removes the top element from the stack.
- Validation mechanisms ensure that only valid data is processed.

## Supporting Documentation
For a detailed explanation of the program and its design, refer to the [STACK.pdf](./STACK.pdf) file included in this repository.
