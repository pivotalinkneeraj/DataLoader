package com.medecision.batch.writer;

import org.springframework.jdbc.core.JdbcTemplate;

public class DataUpdater extends JdbcTemplate {
	private String commandLineParam = null;

	public String getCommandLineParam() {
		return commandLineParam;
	}

	public void setCommandLineParam(String commandLineParam) {
		this.commandLineParam = commandLineParam;
	}

}
