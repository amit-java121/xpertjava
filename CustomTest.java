package com;

public class CustomTest {
	
	public static void main(String[] args) {
		CustomTest ct = new CustomTest();	
		try{
		ct.checkStudentName("");
		}catch(NameNotFound nn){
			System.out.println(nn.getMessage());
		}
	}

	private void checkStudentName(String name) throws NameNotFound {

		if("".equals(name)){
		 throw new NameNotFound("Stduent name not found.....");	
		}
		
	}

}
