package com.wgdevelopment;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    //runtime complexity -> 0(n * m)
    public Array intersect(Array other) {
        Array result = new Array(count);
        for (int i = 0; i < count; i++) {
            if (other.contains(items[i]))
                result.insert(items[i]);
        }
        return result;
    }

    // runtime complexity -> 0(n)
    public int max(){
        if(count == 0)
            throw new IllegalStateException("Array is empty");

        int max = items[0];
        for (int i = 1; i < count; i++){
            if(items[i] > max)
                max = items[i];
        }
        return max;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public void insert(int item) {
        // if array is full we need to resize
        if (items.length == count) {

            // create new array ( twice the size )
            int[] newItems = new int[count * 2];

            // copy all the existing items
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];

            // set "items" to this new array
            items = newItems;
        }

        // add new item at the end of current array
        items[count] = item;
        count++;
    }

    public void removeAt(int index) {
        // validate index
        if (index < 0 || index >= count)
            throw new IllegalArgumentException("Index out of bounds");

        // shift items to the left to fill the hole
        // [10,20,30]
        // index: 1
        // 1 <- 2
        // 2 <- 3
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    public int indexOf(int item) {
        // runtime complexity O(n)
        for (int i = 0; i < count; i++) {
            // if item found, return index
            if (items[i] == item)
                return i;
        }
        return -1;
    }

}
