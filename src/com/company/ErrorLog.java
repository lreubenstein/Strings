package com.company;

public class ErrorLog {

	private String machineId;
	private String description;
	
	/** Precondition: message is a valid Error log entry */
	public ErrorLog(String message) {
		int index = message.indexOf(':');
		machineId = message.substring(0, index);
		description = message.substring(index+1);
	}

	/** Returns true if the description in this error log entry
	 * contains keyword; false otherwise.
	 */
	public boolean containsKey(String keyword) {
		int x = description.length();
		int y = keyword.length();
		int index = description.indexOf(keyword);
		if(index == -1) return false;
		if(index != 0) {
			if(description.charAt(index-1) != ' ') return false;
		}
		if(index + y != x) {
			if(description.charAt(index+y)!= ' ') return false;
		}
		return true;
	}
	
	public String getMachineId() { return machineId;}
	public String getDescription() { return description; }

	public static void main(String[] args) {
		ErrorLog er1 = new ErrorLog("CLIENT3:security alert");
		ErrorLog er2 = new ErrorLog("Webserver:disk offline");
		ErrorLog er3 = new ErrorLog("SERVER1:file not found on disk3");
		ErrorLog er4 = new ErrorLog("SERVER2:read error on disk DSK1");
		ErrorLog er5 = new ErrorLog("SERVER1:write error on disk");
		ErrorLog er6 = new ErrorLog("Webserver:error on /dev/disk");
		ErrorLog er7 = new ErrorLog("Webserver:disk");
		
		System.out.println("message 1 " + er1.containsKey("disk"));
		System.out.println("message 2 " + er2.containsKey("disk"));
		System.out.println("message 3 " + er3.containsKey("disk"));
		System.out.println("message 4 " + er4.containsKey("disk"));
		System.out.println("message 5 " + er5.containsKey("disk"));
		System.out.println("message 6 " + er6.containsKey("disk"));
		System.out.println("message 7 " + er6.containsKey("error"));
		System.out.println("message 8 " + er7.containsKey("disk"));
		
		

	}

}
//message 1 false
//message 2 true
//message 3 false
//message 4 true
//message 5 true
//message 6 false
//message 7 true