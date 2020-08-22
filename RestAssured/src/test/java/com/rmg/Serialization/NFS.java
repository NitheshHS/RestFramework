package com.rmg.Serialization;

import java.io.Serializable;

public class NFS implements Serializable{
	String name;
	int level;
	int life;
	long scrore;
	public NFS(String name, int level, int life, long scrore) {
		this.name = name;
		this.level = level;
		this.life = life;
		this.scrore = scrore;
	}
	

}
