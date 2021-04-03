package Býolum12Soru12;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Soru14 {

	public static void main(String[] args) throws IOException {

		File file = new File("integerYakalama.txt");
		
		if (file.exists() == false) {
			file.createNewFile();
		}
		String str = "";
		ArrayList<Integer> sayilar = new ArrayList<>();
		Scanner input = new Scanner(file);
		
		while (input.hasNext()) {
			if (input.hasNextInt()) {
				sayilar.add(input.nextInt());
			} else {
				str = input.next();
			}
		}
		input.close();
		System.out.println(file.getName().replaceAll(".txt", "") + " " + sayilar);
	}

}
