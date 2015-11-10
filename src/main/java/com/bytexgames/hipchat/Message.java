package com.bytexgames.hipchat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Message class
 * <p>Description: Can be used in room/message API</p>
 * Date: 11/2/15 - 2:40 PM
 *
 * @author Ruslan Balkin <a href="mailto:baron@baron.su">baron@baron.su</a>
 * @version 1.0.0.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class Message {
	private String message;

	private MessageFormat messageFormat;

	private BackgroundColor color;

	private Boolean notify = false;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@JsonIgnore
	public MessageFormat getMessageFormat() {
		return messageFormat;
	}

	@JsonIgnore
	public BackgroundColor getColor() {
		return color;
	}

	public Boolean isNotify() {
		return notify;
	}

	@JsonProperty("color")
	public String getColorInHipchatFormat() {
		return color == null ? null : color.toString();
	}

	@JsonProperty("message_format")
	public String getMessageFormatInHipchatFormat() {
		return messageFormat.toString();
	}

	public void setColor(BackgroundColor color) {
		this.color = color;
	}

	public void setMessageFormat(MessageFormat messageFormat) {
		this.messageFormat = messageFormat;
	}

	public void setNotify(Boolean notify) {
		this.notify = notify;
	}
}
