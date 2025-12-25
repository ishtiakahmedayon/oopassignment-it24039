import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class QueueStackPriorityQueue {
    
    static class Element<T> {
        T value;
        int order;
        
        public Element(T value, int order) {
            this.value = value;
            this.order = order;
        }
        
        @Override
        public String toString() {
            return value.toString();
        }
    }
    
    static class CustomQueue<T> {
        private PriorityQueue<Element<T>> pq;
        private int insertionOrder = 0;
        
        public CustomQueue() {
            pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.order));
        }
        
        public void enqueue(T value) {
            pq.offer(new Element<>(value, insertionOrder++));
        }
        
        public T dequeue() {
            if (isEmpty()) {
                throw new NoSuchElementException("Queue is empty");
            }
            return pq.poll().value;
        }
        
        public T peek() {
            if (isEmpty()) {
                throw new NoSuchElementException("Queue is empty");
            }
            return pq.peek().value;
        }
        
        public boolean isEmpty() {
            return pq.isEmpty();
        }
        
        public int size() {
            return pq.size();
        }
    }
    
    static class CustomStack<T> {
        private PriorityQueue<Element<T>> pq;
        private int insertionOrder = 0;
        
        public CustomStack() {
            pq = new PriorityQueue<>((e1, e2) -> Integer.compare(e2.order, e1.order));
        }
        
        public void push(T value) {
            pq.offer(new Element<>(value, insertionOrder++));
        }
        
        public T pop() {
            if (isEmpty()) {
                throw new NoSuchElementException("Stack is empty");
            }
            return pq.poll().value;
        }
        
        public T peek() {
            if (isEmpty()) {
                throw new NoSuchElementException("Stack is empty");
            }
            return pq.peek().value;
        }
        
        public boolean isEmpty() {
            return pq.isEmpty();
        }
        
        public int size() {
            return pq.size();
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Queue and Stack using PriorityQueue ===\n");
        
        System.out.println("--- Queue (FIFO) Demonstration ---");
        CustomQueue<Integer> queue = new CustomQueue<>();
        
        System.out.println("Enqueuing: 10, 20, 30, 40, 50");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        
        System.out.println("Queue size: " + queue.size());
        System.out.println("Front element (peek): " + queue.peek());
        
        System.out.println("\nDequeuing elements:");
        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }
        
        System.out.println("\n--- Stack (LIFO) Demonstration ---");
        CustomStack<String> stack = new CustomStack<>();
        
        System.out.println("Pushing: Apple, Banana, Cherry, Date, Elderberry");
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        stack.push("Date");
        stack.push("Elderberry");
        
        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element (peek): " + stack.peek());
        
        System.out.println("\nPopping elements:");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
        
        System.out.println("\n--- Mixed Operations ---");
        CustomQueue<Character> charQueue = new CustomQueue<>();
        charQueue.enqueue('A');
        charQueue.enqueue('B');
        charQueue.enqueue('C');
        System.out.println("Queue: Dequeued " + charQueue.dequeue());
        charQueue.enqueue('D');
        System.out.println("Queue: Dequeued " + charQueue.dequeue());
        System.out.println("Queue: Peek " + charQueue.peek());
    }
}
