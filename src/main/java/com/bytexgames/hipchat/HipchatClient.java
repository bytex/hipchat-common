package com.bytexgames.hipchat;

/**
 * Abstract Hipchat Client
 * <p>Description: There can be multiple implementations of this class, depending on the HTTP library you'll be using.<//p>
 * Date: 11/12/15 - 4:56 PM
 *
 * @author Ruslan Balkin <a href="mailto:baron@baron.su">baron@baron.su</a>
 * @version 1.0.0.0
 */
public abstract class HipchatClient {
	private String domain;

	private String authToken;

	public HipchatClient() {
	}

	public HipchatClient(String domain, String authToken) {
		this.domain = domain;
		this.authToken = authToken;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public abstract boolean message(String room, Message message);
}