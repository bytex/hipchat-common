package com.bytexgames.hipchat;

/**
 * Response format, json or XML
 * <p>Description:  Desired response format: json or xml. (default: json) </p>
 * Date: 11/2/15 - 2:43 PM
 *
 * @author Ruslan Balkin <a href="mailto:baron@baron.su">baron@baron.su</a>
 * @version 1.0.0.0
 */
public enum ResponseFormat {
	XML("xml"), JSON("json");

	private final String id;

	ResponseFormat(String id) {
		this.id = id;
	}

	/**
	 * Returns the name of this enum constant, as contained in the
	 * declaration.  This method may be overridden, though it typically
	 * isn't necessary or desirable.  An enum type should override this
	 * method when a more "programmer-friendly" string form exists.
	 *
	 * @return the name of this enum constant
	 */
	@Override
	public String toString() {
		return id;
	}
}
