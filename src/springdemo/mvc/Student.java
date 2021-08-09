package springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String language;
	private String[] operatingSystem;
	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String, String> programmingLanguageOptions;

	
	public Student()
	{
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("DE", "Germany");
		countryOptions.put("FR", "France");
		countryOptions.put("PL", "Poland");
		
		programmingLanguageOptions = new LinkedHashMap<>();
		programmingLanguageOptions.put("Java", "Java");
		programmingLanguageOptions.put("C", "C");
		programmingLanguageOptions.put("PHP", "PHP");
		programmingLanguageOptions.put("Ruby", "Ruby");

	}

	public String[] getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public LinkedHashMap<String, String> getProgrammingLanguageOptions() {
		return programmingLanguageOptions;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
