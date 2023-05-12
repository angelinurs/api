package com.naru.api.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDTO {
	String name;
	String email;
	String organization;
	
	@Override
	public String toString( ) {
		
		return String.format("MemberDTO { name = %s, email= %s, organization=%s }", this.name, this.email, this.organization ); 
	}

}
