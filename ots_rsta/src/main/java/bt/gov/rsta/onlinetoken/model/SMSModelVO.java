// 
// Decompiled by Procyon v0.5.36
// 

package bt.gov.rsta.onlinetoken.model;

import java.util.List;
import java.io.Serializable;

public class SMSModelVO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String moduleType;
	private String templateModule;
	private String smsType;
	private List<String> recipentList;
	private Integer otpNumber;
	private String smsContent;

	public String getSmsContent() {
		return this.smsContent;
	}

	public void setSmsContent(final String smsContent) {
		this.smsContent = smsContent;
	}

	public String getModuleType() {
		return this.moduleType;
	}

	public void setModuleType(final String moduleType) {
		this.moduleType = moduleType;
	}

	public String getTemplateModule() {
		return this.templateModule;
	}

	public void setTemplateModule(final String templateModule) {
		this.templateModule = templateModule;
	}

	public String getSmsType() {
		return this.smsType;
	}

	public void setSmsType(final String smsType) {
		this.smsType = smsType;
	}

	public List<String> getRecipentList() {
		return this.recipentList;
	}

	public void setRecipentList(final List<String> recipentList) {
		this.recipentList = recipentList;
	}

	public Integer getOtpNumber() {
		return this.otpNumber;
	}

	public void setOtpNumber(final Integer otpNumber) {
		this.otpNumber = otpNumber;
	}
}
