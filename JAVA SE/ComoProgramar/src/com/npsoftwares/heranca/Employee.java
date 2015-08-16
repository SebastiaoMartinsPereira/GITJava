package com.npsoftwares.heranca;

public abstract class Employee {

	private String first;
	private String last;
	private String socialSecutityNumber;

	public Employee(String firstName, String lastName, String ssn) {   //construtor que será usado  por todas as subclasses
																       //que se  extende da classe Employeed
		super();
		setFirst(firstName);
		setLast(lastName);
		setSocialSecutityNumber(ssn);

	}

	public void setFirst(String first) {
		this.first = first;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public void setSocialSecutityNumber(String socialSecutityNumber) {
		this.socialSecutityNumber = socialSecutityNumber;
	}

	public String getFirst() {
		return first;
	}

	public String getLast() {
		return last;
	}

	public String getSocialSecutityNumber() {
		return socialSecutityNumber;
	}

	@Override
	public String toString() {
		return String.format("%s %s\nsocial security number : %s", getFirst(),
				getLast(), getSocialSecutityNumber());
	}

	public abstract double earnings();  // classe abstrata não pussui implementação

}
