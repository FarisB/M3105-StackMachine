package fr.iutvalence.info.m3105.stackmachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;

public abstract class IOAb implements IOInterface {

	protected BufferedReader in;
	protected PrintStream out;
	protected PrintStream err;

	public IOAb(InputStream inStream, OutputStream outStream, OutputStream errStream)
	{
		this.in = new BufferedReader(new InputStreamReader(inStream));
		this.out = new PrintStream(outStream);
		this.err = new PrintStream(errStream);
	}

	@Override
	public abstract void displayRuntimeError(String string);

	@Override
	public abstract void displayProgramTermination();

	@Override
	public abstract int read() throws IOException;

	@Override
	public abstract void write(int op);


}