public class OutOfMemoryErrorTest {
	
	public static void main(String[] args) {
		int size = 10;
		
		while(true) {
			System.out.println("\n=================> OOM test started..\n" + size);
			
			int[] i = new int[size];
			
			int loop = size - 1;
			do {
				i[loop] = 0;
				--loop;
			} while(loop > 0);
			
			size = size * 5;
			
			
		}
	}
	
	static class Employee {
		public Employee(long name, double address) {
			super();
			this.name = name;
			this.address = address;
		}

		private long name;
		private double address;
	}

}
