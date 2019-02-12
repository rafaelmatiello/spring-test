package net.matiello.impl;

import java.util.UUID;

import net.matiello.interfaces.ISecurityManger;

public class SecurityManagerImpl implements ISecurityManger {

	public String login(String user, String password) {
		return UUID.randomUUID().toString();
	}

}
