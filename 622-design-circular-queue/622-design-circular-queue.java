class MyCircularQueue {
    List<Integer> list;
    boolean flag;
    int size;
    public MyCircularQueue(int k) {
        flag = true;
        list = new ArrayList<>(3);
        // list.add(k);
        size = k;
    }
    
    public boolean enQueue(int value) {
        if(list.size() == size) return false;
        list.add(value);
            return true;
    }
    
    public boolean deQueue() {
        if(!list.isEmpty()) {
            list.remove(0);
        return true;
        }
        else return false;
    }
    
    public int Front() {
        if(!list.isEmpty()){
            return list.get(0);
        }
        else return -1;
    }
    
    public int Rear() {
        if(!list.isEmpty()){
            return list.get(list.size()-1);
        }
        else return -1;
        
    }
    
    public boolean isEmpty() {
        if(!list.isEmpty()) return false;
        
        return true;
    }
    
    public boolean isFull() {
           // if(!list.isEmpty()) return true;
        if(list.size() == size) return true;
        
        return false;
        // return false;
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