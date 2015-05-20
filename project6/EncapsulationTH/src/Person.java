
public class Person {
	 
	
		private String m_name;
		private int m_age;
		private String m_phoneNumber;
		private String m_address;

		public Person(String Name, int age, String phone, String address)
		{
			
			SetName(Name);
			SetAge(age);
			SetPhoneNumber(phone);
			SetAddress(address);
		}
		
		


		public String GetName()
		{
			return m_name;
		}

		private void SetName(String Name)
		{
			m_name = Name;
		}

		public int GetAge()
		{
			return m_age;
		}

		private void SetAge(int Age)
		{
			m_age = Age;
		}
		
		public String GetPhone()
		{
			return m_phoneNumber;
		}
		private void SetPhoneNumber(String Phone)
		{
			m_phoneNumber = Phone;
		}
		
		public String GetAddress()
		{
			return m_address;
		}
		private void SetAddress(String Address)
		{
			m_address = Address;
		}
		
		public int GrowsOlder()
		{
			int olderAge = 1 + m_age;
			return olderAge;
		}

	}


