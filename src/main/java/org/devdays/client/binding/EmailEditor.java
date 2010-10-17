package org.devdays.client.binding;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class EmailEditor extends Composite {

	private static EmailEditorUiBinder uiBinder = GWT
			.create(EmailEditorUiBinder.class);

	interface EmailEditorUiBinder extends UiBinder<Widget, EmailEditor> {
	}

	@UiField
	TextBox email;

	public EmailEditor() {
		initWidget(uiBinder.createAndBindUi(this));
	}
}
