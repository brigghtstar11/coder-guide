/**
 * 
 */
package com.coderguide.model;

import org.springframework.stereotype.Component;

/**
 * @author
 *
 */
@Component
public class SuccessModel {

	private int successCode	=	0;
	private String successDesc	=	"Record updated Successfully!!!";
	/**
	 * @return the successCode
	 */
	public int getSuccessCode() {
		return successCode;
	}
	/**
	 * @param successCode the successCode to set
	 */
	public void setSuccessCode(int successCode) {
		this.successCode = successCode;
	}
	/**
	 * @return the successDesc
	 */
	public String getSuccessDesc() {
		return successDesc;
	}
	/**
	 * @param successDesc the successDesc to set
	 */
	public void setSuccessDesc(String successDesc) {
		this.successDesc = successDesc;
	}
	
}
