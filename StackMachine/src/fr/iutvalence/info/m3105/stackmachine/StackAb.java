package fr.iutvalence.info.m3105.stackmachine;

public abstract class StackAb implements StackInterface{
	
	private int sizeStack;
	
	public abstract void clearStack();
	
	public abstract void push();
	
	public abstract void pop();

	public StackAb(int i) {
		this.sizeStack=i;
	}
}
