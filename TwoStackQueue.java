public class TwoStackQueue<E>{
	private Stack<E> first_stack;
	private Stack<E> second_stack;


	public TwoStackQueue(){
		first_stack = new Stack<E>();
		second_stack = new Stack<E>();
	}

	public void enqueue(E newData){
		Node<E> freeNode = new Node<E>(newData,null);
		first_stack.push(newData);
	}

	public Node<E> dequeue(){
		if (second_stack.isEmpty()){
			while (!first_stack.isEmpty()){
				second_stack.push(first_stack.pop().getData());
			}
		}
		return second_stack.pop();
	}

	public boolean isEmpty(){
		return first_stack == null;
	}

	public void printQueue(){
		Node<E> current = second_stack.pop();
		while (current != null){
			System.out.println(current.getData());
			current = current.getNext();
		}
	}
}