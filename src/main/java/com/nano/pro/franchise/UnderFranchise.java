package com.nano.pro.franchise;

public class UnderFranchise {
	private int underFranId;
	private String underfranchisEmploemail;
	private String franchiseEmail;
	private String underFranchiseEmploName;
	public int getUnderFranId() {
		return underFranId;
	}
	public void setUnderFranId(int underFranId) {
		this.underFranId = underFranId;
	}
	public String getUnderfranchisEmploemail() {
		return underfranchisEmploemail;
	}
	public void setUnderfranchisEmploemail(String underfranchisEmploemail) {
		this.underfranchisEmploemail = underfranchisEmploemail;
	}
	public String getFranchiseEmail() {
		return franchiseEmail;
	}
	public void setFranchiseEmail(String franchiseEmail) {
		this.franchiseEmail = franchiseEmail;
	}
	public String getUnderFranchiseEmploName() {
		return underFranchiseEmploName;
	}
	public void setUnderFranchiseEmploName(String underFranchiseEmploName) {
		this.underFranchiseEmploName = underFranchiseEmploName;
	}
	@Override
	public String toString() {
		return "UnderFranchise [underFranId=" + underFranId + ", underfranchisEmploemail=" + underfranchisEmploemail
				+ ", franchiseEmail=" + franchiseEmail + ", underFranchiseEmploName=" + underFranchiseEmploName + "]";
	}
	
}
