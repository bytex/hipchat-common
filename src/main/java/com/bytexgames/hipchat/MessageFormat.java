package com.bytexgames.hipchat;

/**
 * Message format, html or text
 * <p>Description:
 * <ul>
 * <li><strong>html</strong> - Message is rendered as HTML and receives no special treatment. Must be valid HTML and entities must be escaped (e.g.: &amp; instead of &). May contain basic tags: a, b, i, strong, em, br, img, pre, code, lists, tables. Special HipChat features such as @mentions, emoticons, and image previews are NOT supported when using this format.</li>
 * <li><strong>text</strong> - Message is treated just like a message sent by a user. Can include @mentions, emoticons, pastes, and auto-detected URLs (Twitter, YouTube, images, etc).</li></ul>
 * </p>
 * Date: 11/2/15 - 2:43 PM
 *
 * @author Ruslan Balkin <a href="mailto:baron@baron.su">baron@baron.su</a>
 * @version 1.0.0.0
 */
public enum MessageFormat {
	TEXT("text"), HTML("html");

	private final String id;

	MessageFormat(String id) {
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
