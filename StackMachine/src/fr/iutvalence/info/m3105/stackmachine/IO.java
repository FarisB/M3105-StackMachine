package fr.iutvalence.info.m3105.stackmachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;

public class IO extends IOAb
{
	public IO(InputStream inStream, OutputStream outStream, OutputStream errStream)
	{
		super(inStream, errStream, errStream);
	}
	
	public void displayRuntimeError(String string) {
		System.err.println(string);
		
	}

	@Override
	public void displayProgramTermination() {
		System.out.println("(HALT)");
	}

	@Override
	public int read() throws IOException {
		this.out.print("? ");
		String line = this.in.readLine();
		this.out.println();
		return Integer.parseInt(line);
		
	}

	@Override
	public void write(int op) {
		this.out.println("> "+op);
		
	}
}
