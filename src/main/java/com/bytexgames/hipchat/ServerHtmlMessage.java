package com.bytexgames.hipchat;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Html message with server badge
 * <p>Description: </p>
 * Date: 11/5/15 - 11:22 AM
 *
 * @author Ruslan Balkin <a href="mailto:baron@baron.su">baron@baron.su</a>
 * @version 1.0.0.0
 */
public class ServerHtmlMessage extends HtmlMessage {

	public static final String UNKNOWN_HOST = "unknown";

	public ServerHtmlMessage(String message) {
		super();
		setMessage(message);
	}

	@Override
	public void setMessage(String message) {
		String hostAddress;
		try {
			hostAddress = InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException ignored) {
			hostAddress = UNKNOWN_HOST;
		}
		super.setMessage(String.format("%s at <span class=\"aui-badge\">%s</span>", message, hostAddress));
	}
}
