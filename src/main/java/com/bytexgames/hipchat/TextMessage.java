package com.bytexgames.hipchat;

/**
 * Simple text message
 * <p>Description: </p>
 * Date: 11/2/15 - 2:53 PM
 *
 * @author Ruslan Balkin <a href="mailto:baron@baron.su">baron@baron.su</a>
 * @version 1.0.0.0
 */
public class TextMessage extends Message {
	public TextMessage() {
		setMessageFormat(MessageFormat.TEXT);
	}
}
