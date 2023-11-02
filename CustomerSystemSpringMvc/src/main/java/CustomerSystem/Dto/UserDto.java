package CustomerSystem.Dto;

public class UserDto {
	private String userName;
	private String passWord;
	private String loggedInPsnCd;
	
	public UserDto() {
		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getLoggedInPsnCd() {
		return loggedInPsnCd;
	}

	public void setLoggedInPsnCd(String loggedInPsnCd) {
		this.loggedInPsnCd = loggedInPsnCd;
	}
}
