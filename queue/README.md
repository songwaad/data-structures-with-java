# Truck Weighing Application (Queue)

This program demonstrates the use of **Queues** in Java to manage and process truck weight inspections. It handles various truck types, validates inputs, and processes queue operations efficiently.

## Key Features
1. **Truck Data Input**
   - Users can select the type of truck and input its registration number and weight.
   - The program supports four truck types:
     1. **4-wheel truck (max weight: 10 tons)**
     2. **4-wheel truck (max weight: 15 tons)**
     3. **10-wheel truck (max weight: 25 tons)**
     4. **6-axle truck (max weight: 50 tons)**
   - Invalid inputs (e.g., non-numeric weights) are rejected, prompting the user to re-enter the data.

2. **Queue Management**
   - Displays all trucks currently in the queue in a table format.
   - Supports a maximum of 10 trucks in the queue.
   - If the queue is full, the program alerts the user with a "FULL" message.

3. **Weight Inspection**
   - Processes trucks in the queue one by one.
   - If the truck's weight exceeds the limit for its type, a fine of 10,000 baht is applied, and the program displays an "Overweight" message.
   - Trucks within the weight limit are marked as "Weight not exceeding."
   - Updates both the queue table and the inspection results table dynamically.

4. **Error Handling**
   - Alerts users if there are no trucks in the queue when attempting to process weights.

## Supporting Documentation
For a detailed explanation of the program's design and implementation, refer to the [QUEUE.pdf](./QUEUE.pdf) file included in this repository.
