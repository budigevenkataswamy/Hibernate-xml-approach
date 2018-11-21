package beans;

import java.util.Date;

public class vote {
	private int vid;
	private String pname;
	private Date cdate;
	private voter voter;
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Date getCdate() {
		return cdate;
	}
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	public voter getVoter() {
		return voter;
	}
	public void setVoter(voter voter) {
		this.voter = voter;
	}
	 

}
