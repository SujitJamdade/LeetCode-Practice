// approach 1

// class MyCircularDeque {
//     // your code here
// 	int head, tail, size,n;
// 	final int[] a;
//     public MyCircularDeque(int k) {
//         a = new int[k];
// 		n = a.length;
// 		tail = 1;
//     }
    
//     public boolean insertFront(int value) {
//         if(size == n) return false;
// 		a[head = ++head % n] =value;
// 		size++;
// 		return true;
//     }
    
//     public boolean insertLast(int value) {
//         if(size==n)return false;
// 		a[tail = (--tail +n)%n]=value;
// 		size++;
// 		return true;
//     }
    
//     public boolean deleteFront() {
//         if (size==0)return false;
// 		head = (--head +n )%n;
// 		size--;
// 		return true;
//     }
    
//     public boolean deleteLast() {
//         if (size==0)return false;
// 		tail = ++tail %n;
// 		size--;
// 		return true;
//     }
    
//     public int getFront() {
//         return size == 0 ? -1 : a[head];
//     }
    
//     public int getRear() {
//          return size == 0 ? -1 : a[tail];
//     }
    
//     public boolean isEmpty() {
//         return size == 0;
//     }
    
//     public boolean isFull() {
//         return size == a.length;
//     }
// }



// Approach 2

class Node{
	int data;
	Node next;
	Node prev;

	Node(int data){
		this.data = data;
	}
}

class MyCircularDeque {
    // your code here
	
	Node head;
	Node tail;
	int size;
	int maxsize;
	
	
    public MyCircularDeque(int k) {
       head= null;
		tail = null;
		size=0;
		maxsize=k;
    }
    
    public boolean insertFront(int value) {

		if(size==maxsize){
			return false;
		}
		else{
			Node nn = new Node(value);
			if(head==null){
				head=tail= nn;
			}
			else{
				nn.next=head;
				head.prev=nn;
				head=nn;
			}
			size++;
			return true;
		}
    }
    
    public boolean insertLast(int value) {
        if(size==maxsize){
			return false;
		}
		else{
			Node nn = new Node(value);
			if(head==null){
				head=tail= nn;
			}
			else{
				tail.next=nn;
				nn.prev=tail;
				tail=nn;
			}
			size++;
			return true;
		}
    }
    
    public boolean deleteFront() {
        
		if(size==0){
			return false;
		}
		else{
			if(head==tail){
				head=tail=null;
			}
			else{
				head= head.next;
				head.prev = null;
			}
			size--;
			return true;
		}
    }
    
    public boolean deleteLast() {
        if(size==0){
			return false;
		}
		else{
			if(head==tail){
				head=tail=null;
			}
			else{
				tail= tail.prev;
				tail.next = null;
			}
			size--;
			return true;
		}
    }
    
    public int getFront() {
        if(size==0){
			return -1;
		}
		else{
			return head.data;
		}
    }
    
    public int getRear() {
        if(size==0){
			return -1;
		}
		else{
			return tail.data;
		}
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == maxsize;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */