package fr.iutvalence.info.m3105.stackmachine;

public interface MemoryInterface {

	int getStartAddress();
	
	void write(int currentAddress, Object opCode);
	
}
