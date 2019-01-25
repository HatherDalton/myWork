package designingClass;

public class HardDrive {

	private int totalC;
	private int freeSpace;
	private String name;
	
	public HardDrive (int xCapacity, int xfree, String xName) {
		totalC=xCapacity;
		freeSpace= xfree;
		name= xName;
	}
	
	public void addFile(int size) {
		if (freeSpace>=0) {
			freeSpace-=size;
			totalC+= size;
		}
	}
	public void deleteFile(int delete) {
		if (totalC>=0) {
			freeSpace+= delete;
			totalC-=delete;
		}
	}
	public String isFull() {
		if (freeSpace==0) {
			name= "True";
		}
		else {
			name="False";
		}
		return name;
	}
	public String isEmpty() {
		if (totalC==0) {
			name= "True";
		}
		else {
			name="False";
		}
		return name;
	}
	
///////////////////////////////////////////////////////	
}
