class MyCircularQueue {
    int[] que;
    int size, used, front, rear;
    public MyCircularQueue(int k) {
        que = new int[k];
        size = k;
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;
        que[rear] = value;
        rear = (rear + 1) % size;
        used++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        front = (front + 1) % size;
        used--;
        return true;
    }
    
    public int Front() {
        if(isEmpty()) return  -1;
        return que[front];
    }
    
    public int Rear() {
        if(isEmpty()) return -1;
        return que[(rear - 1 + size) % size];
    }
    
    public boolean isEmpty() {
        return used == 0;
    }
    
    public boolean isFull() {
        return  used == size;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */