package org.devdays.client.binding;

import org.devdays.shared.Customer;

import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.Editor;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class CustomerEditor extends Composite implements Editor<Customer> {

	private static CustomerEditorUiBinder uiBinder = GWT
			.create(CustomerEditorUiBinder.class);

	interface CustomerEditorUiBinder extends UiBinder<Widget, CustomerEditor> {
	}

	@UiField
	TextBox firstName;
	
	@UiField
	TextBox lastName;

	@UiField
	AddressEditor addressEditor;
	
	public CustomerEditor() {
		initWidget(uiBinder.createAndBindUi(this));
	}
}
