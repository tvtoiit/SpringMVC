package CustomerSystem.entity;

import java.math.BigDecimal;

public class Users {
	private BigDecimal psnCd;
	private String userId;
	private String passWord;
	private String userName;
	
	public Users() {
			
	}
	
	public Users(BigDecimal psnCd, String userId, String passWord, String userName) {
		this.psnCd = psnCd;
		this.userId = userId;
		this.passWord = passWord;
		this.userName = userName;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public BigDecimal getPsnCd() {
		return psnCd;
	}

	public void setPsnCd(BigDecimal psnCd) {
		this.psnCd = psnCd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
