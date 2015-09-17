package edu.rosehulman.chat.crextension;

import edu.rosehulman.chat.communication.Message;
import edu.rosehulman.chat.extension.IReceiverExtension;

public class CRExtension implements IReceiverExtension {

	@Override
	public void received(Message m) {
		System.out.println("Message Received: " + m.getMessage());
	}
}
