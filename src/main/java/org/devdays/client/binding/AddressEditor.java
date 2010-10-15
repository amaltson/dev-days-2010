package org.devdays.client.binding;

import org.devdays.shared.Address;

import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.Editor;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class AddressEditor extends Composite implements Editor<Address> {

	private static AddressEditorUiBinder uiBinder = GWT
			.create(AddressEditorUiBinder.class);

	interface AddressEditorUiBinder extends UiBinder<Widget, AddressEditor> {
	}

	@UiField
	TextBox street, city, country, postalCode;
	
	@UiField
	ListBox province;

	public AddressEditor() {
		initWidget(uiBinder.createAndBindUi(this));

		province.addItem("Ontario");
		province.addItem("Quebec");
	}
}
