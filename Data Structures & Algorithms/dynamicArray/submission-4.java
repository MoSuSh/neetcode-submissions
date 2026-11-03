class DynamicArray {
    private int capacity;
    private int size;
    private int [] arr;

    public DynamicArray(int capacity) {
        arr = new int[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if (this.size == this.capacity) {
            resize();
        }
        arr[this.size] = n;
        this.size++;
    }

    public int popback() {
        this.size--;
        return arr[this.size];
    }

    private void resize() {
        this.capacity = this.capacity * 2;
        int[] newArr = new int[this.capacity];
        for (int i = 0; i < this.size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}