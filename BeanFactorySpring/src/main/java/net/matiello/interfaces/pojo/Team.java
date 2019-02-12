package net.matiello.interfaces.pojo;

import java.util.UUID;

public class Team {

	private UUID id;
	private String name;

	public UUID getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + "]";
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
