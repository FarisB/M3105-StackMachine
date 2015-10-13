package fr.iutvalence.info.m3105.stackmachine;

import fr.iutvalence.info.m3105.stackmachine.Exceptions.AddressOutOfBoundsException;


public class Machine
{
	private CPU cpu;
	private Memory programMemory;
	private Stack stack;
	private IOInterface io;

	public Machine(Stack expStack, Stack callStack, IOInterface ioSystem)
	{
		cpu = new CPU();
		programMemory = new Memory(10,10);
		stack = new Stack(10);
		io = new IO(null, null, null);
		this.cpu.wireToProgramMemory(programMemory);
		this.cpu.wireToExpStack(expStack);
		this.cpu.wireToCallStack(callStack);
		this.cpu.wireToIoSubsystem(ioSystem);
	}

	public void loadProgram(Program program) throws AddressOutOfBoundsException
	{
		int currentAddress = this.programMemory.getStartAddress();

		for (int instructionNumber = 0; instructionNumber < program.getInstructionCount(); instructionNumber++)
		{
			Instruction instruction = program.getInstructionAt(instructionNumber);
			this.programMemory.write(currentAddress, instruction.getOpCode());
			currentAddress++;
			int[] instructionParams = instruction.getParams();
			if (instructionParams != null)
			{
				for (int instructionParam : instructionParams)
				{
					this.programMemory.write(currentAddress, instructionParam);
					currentAddress++;
				}
			}
		}
	}

	public void executeProgram(int address)
	{
		cpu.clearStacks();
		cpu.setPC(address);
		cpu.run();
		System.out.println("(end of program execution)");
	}

}
