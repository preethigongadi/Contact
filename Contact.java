class Contact
{
		 String firstname = null;
		 String lastname = null;

		 Contact(String firstnm)
		 {
			 firstname = firstnm;
		 }


	//setters and getters of first name...
			public void setFirstName(String firstname_address) throws FirstNameLengthExceededException
			{
				if(firstname_address.length() == 10) throw new FirstNameLengthExceededException("Length of the first name is more than 10");
				System.out.println("***********"+firstname_address);
				this.firstname = firstname_address;
				//String fn=getFirstName();
				System.out.println("***********"+firstname);
			}
			public String getFirstName()
			{
				System.out.println("firstname");
				System.out.println(firstname);
				return this.firstname;
			}

	//setters and getters of last name....
			public void setLastName(String lastname_address) throws LastNameLengthExceededException
			{
				if(lastname_address.length() == 10) throw new LastNameLengthExceededException("Length of the last name is more than 10");
				lastname = lastname_address;
			}
			public String getLastName()
			{
				return lastname;
			}


}
