package item16;

public class House {
	public String addr;
	public long price;

	public House(String addr, long price) {
		this.addr = addr;
		this.price = price;
	}

	public String getAddr() {
		return addr;
	}
	public long getPrice() {
		return price;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void setPrice(long price) {
		this.price = price;
	}
}
