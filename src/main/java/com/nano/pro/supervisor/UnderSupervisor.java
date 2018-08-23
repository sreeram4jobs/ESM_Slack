package com.nano.pro.supervisor;

public class UnderSupervisor {
private int undersuperId;
private String UnderSupervisorEmploemail;
private String SupervisorEmail;
private String UnderSupervisorEmploName;
private int UndersupervisorCount;

public int getUndersupervisorCount() {
	return UndersupervisorCount;
}

public void setUndersupervisorCount(int undersupervisorCount) {
	UndersupervisorCount = undersupervisorCount;
}

public int getUndersuperId() {
	return undersuperId;
}

public void setUndersuperId(int undersuperId) {
	this.undersuperId = undersuperId;
}

public String getUnderSupervisorEmploemail() {
	return UnderSupervisorEmploemail;
}

public void setUnderSupervisorEmploemail(String underSupervisorEmploemail) {
	UnderSupervisorEmploemail = underSupervisorEmploemail;
}

public String getSupervisorEmail() {
	return SupervisorEmail;
}

public void setSupervisorEmail(String supervisorEmail) {
	SupervisorEmail = supervisorEmail.trim();
}

public String getUnderSupervisorEmploName() {
	return UnderSupervisorEmploName;
}

public void setUnderSupervisorEmploName(String underSupervisorEmploName) {
	UnderSupervisorEmploName = underSupervisorEmploName;
}

@Override
public String toString() {
	return "UnderSupervisor [undersuperId=" + undersuperId + ", UnderSupervisorEmploemail=" + UnderSupervisorEmploemail
			+ ", SupervisorEmail=" + SupervisorEmail + ", UnderSupervisorEmploName=" + UnderSupervisorEmploName
			+ ", UndersupervisorCount=" + UndersupervisorCount + "]";
}
	
}
