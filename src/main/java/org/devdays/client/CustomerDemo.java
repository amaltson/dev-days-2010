package org.devdays.client;

import org.devdays.client.binding.CustomerEditor;
import org.devdays.shared.Customer;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.SimpleBeanEditorDriver;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

public class CustomerDemo implements EntryPoint {

	interface Driver extends SimpleBeanEditorDriver<Customer, CustomerEditor> {
	}

	Driver driver = GWT.create(Driver.class);

	public void onModuleLoad() {
		CustomerEditor editor = new CustomerEditor();
		driver.initialize(editor);
		driver.edit(new Customer("1", "Bob", "Smith"));

		RootPanel.get().add(editor);

		Button button = new Button("Get Data");
		RootPanel.get().add(button);

		button.addClickHandler(new ClickHandler() {

			public void onClick(ClickEvent arg0) {
				Customer customer = driver.flush();
				Window.alert("id: " + customer.getId() + ", first name: "
						+ customer.getFirstName() + ", last name: "
						+ customer.getLastName());
			}
		});
	}
}
