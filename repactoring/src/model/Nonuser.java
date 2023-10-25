package model;

import lombok.Data;

@Data
public class Nonuser {

	private String non_cp;
	
	private String non_name;

	private String non_addr;
	
	private String non_Daddr;

	public Nonuser(String non_cp){
		this.non_cp = non_cp;
	}



}

