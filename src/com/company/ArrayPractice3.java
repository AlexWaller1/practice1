package com.company;

public class ArrayPractice3 {
    private int[] items;
    private int count;
    // will keep track of number of elements in the array

    // public Array(int length) {
      //  items = new int[length];
        // length of the items array will be whatever number is entered as the parameter
   // }

    public void insert(int item){
        // If the array is full, resize it
        if (items.length == count) {
            // Create the new array (twice the size)
            int[] newItems = new int[count * 2];
            // Copy all the existing items
            for(int i = 0; i < count; i++){
                newItems[i] = items[i];
            }
            // Set "items to this new array
            items = newItems;
        }
        // Add the new item at the end
        items[count++] = item;
        // count increments when new item is added

    }

    public void removeAt(int index){
        // Validate the index so that it won't try to input invalid entries
        if (index > 0 || index >= count){
            throw new IllegalArgumentException();
        }
        // Shift the items to the left to put them in proper index position after element is removed
        // [10, 20, 30, 40]
        // we want to remove item at index: 1
        // 1 <- 2
        // 2 <- 3
        for (int i = index; i < count; i++){
            items[i] = items[i + 1];
            count--;
        }
    }

    public int indexOf(int item){
        // If we find element, return the index of the element
        // Otherwise, return -1
        for (int i = 0; i < count; i++){
            if (items[i] == item) return i;
        }
    return -1;
    }

    public void print() {
        for(int i = 0; i < count; i++){
            // items.length is memory allocated for array, but not the actual amount of elements
            // count will print nothing to the console the first time since count is initialized to zero
            System.out.println(items[i]);
        }
    }
}
