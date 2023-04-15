package Item1;

public class Rabbit {
	private String name;
	private String color;

	public static Rabbit filterRabbitColor(String color) {
		if (color == "Black") return new BlackRabbit();
		else if (color == "Yellow") return new YellowRabbit();
		else if (color == "White") return new WhiteRabbit();
		else return new GrayRabbit();
	}
}

class BlackRabbit extends Rabbit {}
class YellowRabbit extends Rabbit {}
class WhiteRabbit extends Rabbit {}
class GrayRabbit extends Rabbit {}
