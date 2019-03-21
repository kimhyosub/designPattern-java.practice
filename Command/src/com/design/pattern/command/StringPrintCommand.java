package com.design.pattern.command;

public class StringPrintCommand implements Command {
	
	private String string;
	
	public StringPrintCommand(String string) {
		this.string = string;
	}

	@Override
	public int compareTo(Command o) {
		StringPrintCommand other = (StringPrintCommand)o; 
		return this.string.length() - other.string.length();
	}

	@Override
	public void excute() {
		System.out.println(this.string);
	}

}
