package com.demo.echo;

import javax.enterprise.context.RequestScoped;
import javax.faces.event.ActionEvent;

import javax.inject.Named;


@Named
@RequestScoped
public class Controller {
	private String text;
	private int firstNumber, secondNumber, total;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	public int getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	public void calculateTotal(ActionEvent event){
		total = firstNumber + secondNumber;
	}

}
