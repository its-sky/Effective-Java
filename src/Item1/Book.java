package Item1;

public class Book {
	public static void main(String[] args) {
		Info info1 = Info.makeWithAuthor("Shin");
		Info info2 = Info.makeWithAuthorAndAddress("Shin", 12344);
		Info info3 = Info.makeWithAuthorAndPhone("Shin", 1233323);
	}
}

class Info {
	public Info() {}
	public Info(String author, int phoneNum, int address) {}

	public static Info makeWithAuthor(String author) {
		return new Info(author, 0, 0);
	}

	public static Info makeWithAuthorAndPhone(String author, int phoneNum) {
		return new Info(author, phoneNum, 0);
	}

	public static Info makeWithAuthorAndAddress(String author, int address) {
		return new Info(author, 0, address);
	}
}

