package com.design.patterns.structural.proxy;

import java.io.IOException;

/**
 * @author sumit
 *
 */
public class CommandExecutorImpl implements CommandExecutor {

	public void runCommand(String cmd) throws IOException {
		Runtime.getRuntime().exec(cmd);
		System.out.println("'" + cmd + "' command executed.");
	}

}
