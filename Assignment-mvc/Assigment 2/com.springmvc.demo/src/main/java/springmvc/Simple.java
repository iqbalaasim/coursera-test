package springmvc;

public class Simple {
	
	@Override
	public String toString() {
		return "Simple [principal=" + principal + ", rate=" + rate + ", time=" + time + ", res=" + res + "]";
	}


	public double principal,rate,time;

	public double getPricipal() {
		return principal;
	}

	public void setPricipal(double pricipal) {
		this.principal = pricipal;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}
	
	
	public double res;
	
	public double getRes() {
		res=principal*rate*time/100;
		return res;
	}
	public void setRes(double res) {
		this.res=res;
	}
	
	
}
