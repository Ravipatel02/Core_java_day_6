package Question2;

public class Box <T> {
	private T object ;
	
	public void setObject(T object) {
		this.object = object;
	}
	
	public T getObject() {
		return this.object;
	}
	
	public static void main(String[] args) {
		
		Box<Integer> intBox = new Box<>();
		intBox.setObject(10);
		Integer object2 = intBox.getObject();
		System.out.println(object2);
		
		Box<String> box = new Box<>();
		box.setObject("ravi");
		String object3 = box.getObject();
		System.out.println(object3);
		
		 // Attempting to store incompatible type will result in compile-time error
        // box.setObject(10); // Compile-time error: incompatible types
	}
}
