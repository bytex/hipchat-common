package com.bytexgames.hipchat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Message class
 * <p>Description: Can be used in room/message API</p>
 * Date: 11/2/15 - 2:40 PM
 *
 * @author Ruslan Balkin <a href="mailto:baron@baron.su">baron@baron.su</a>
 * @version 1.0.0.0
 */
public abstract class Message {
	@JsonProperty("message")
	private String message;

	@JsonProperty("message_format")
	private MessageFormat messageFormat;

	@JsonProperty("color")
	private BackgroundColor color;

	@JsonIgnore
	private Boolean notify = false;

	@JsonProperty("format")
	private String format;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public MessageFormat getMessageFormat() {
		return messageFormat;
	}

	public void setMessageFormat(MessageFormat messageFormat) {
		this.messageFormat = messageFormat;
	}

	public BackgroundColor getColor() {
		return color;
	}

	public void setColor(BackgroundColor color) {
		this.color = color;
	}

	@JsonIgnore
	public Boolean isNotify() {
		return notify;
	}

	@JsonProperty("notify")
	public Integer getNotifyInHipchatFormat() {
		return notify ? 1 : 0;
	}

	public void setNotify(Boolean notify) {
		this.notify = notify;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

}
