package day4;

public class TestArrayCopyDemo {
public static void main(String[] args) {
	char copyFrom[]= {'a','b','c','d','e','f','g','h','i','j'};
	char copyTo[]=new char[7];
	System.arraycopy(copyFrom, 2, copyTo, 0, 7);
	System.out.println(String.valueOf(copyTo));
}
}
