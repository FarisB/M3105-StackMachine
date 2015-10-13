package fr.iutvalence.info.m3105.stackmachine;

public abstract class MemoryAb implements MemoryInterface {
	
	private int i;
	private int j;
	
	public abstract int getStartAddress();
	
	public abstract void write(int currentAddress, Object opCode);
	
	public MemoryAb(int i, int j) {
		this.i=i;
		this.j=j;
	}
}
