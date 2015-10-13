package fr.iutvalence.info.m3105.stackmachine;

import java.io.IOException;

public interface IOInterface {

	abstract void displayRuntimeError(String string);

	abstract void displayProgramTermination();

	abstract int read() throws IOException;

	abstract void write(int op);

}