package day3;

public class SwitchEx {
public static void main(String[] args) {
	String color="green";
	switch (color) {
	case "red":
		System.out.println("turn of engine");
		break;
	case "yellow":
		System.out.println("start");
		break;
	case "green":
		System.out.println("Go");
		break;
	default:
		System.out.println("go to hell");
		break;
	}
}
}
