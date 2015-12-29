package com.yash.tag;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class FormTag extends TagSupport {

	private static final long serialVersionUID = 1L;
	
	String inputType;
	String inputName;
	String inputValue;
	
public void setInputType(String inputType) {
		this.inputType = inputType;
	}

	public void setInputName(String inputName) {
		this.inputName = inputName;
	}

	public void setInputValue(String inputValue) {
		this.inputValue = inputValue;
	}

	
@Override
public int doStartTag() throws JspException {
	 JspWriter out=pageContext.getOut();
	 try {
		
			 out.print("<input type="+inputType+" name="+inputName+" value="+inputValue+">");
			 
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	 return SKIP_BODY;
}	

@Override
public Enumeration<String> getValues() {
	// TODO Auto-generated method stub
	return super.getValues();
}

}
