package net.matiello.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import net.matiello.interfaces.ISecurityManger;
import net.matiello.interfaces.ITeams;
import net.matiello.interfaces.pojo.Team;

public class TeamImpl implements ITeams {
	
	private ISecurityManger security;

	public TeamImpl(ISecurityManger security) {
		this.security = security;
	}

	public List<Team> getTeams() {

		List<Team> list = new ArrayList<Team>();

		Team team = new Team();
		team.setId(UUID.randomUUID());
		team.setName("Santos Futebol Clube "+security.login("", ""));
		list.add(team);
		return list;
	}

}
