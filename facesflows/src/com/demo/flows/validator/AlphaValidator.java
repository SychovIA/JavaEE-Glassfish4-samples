package com.demo.flows.validator;


import java.util.regex.Pattern;


import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;


@FacesValidator("alphaValidator")
public class AlphaValidator implements Validator{
	
	@Override
	public void validate(FacesContext facesContext, UIComponent uiComponent, Object value) throws ValidatorException{
		if(value == null) {
	            return;
	        }
		
		if(!Pattern.matches("[A-Za-z]*", (CharSequence) value)){
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Validation Error", 
					"only alphabetic characters are allowed.");
			
			throw new ValidatorException(message);
			
		}
	}
}