package uti;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class DifferentWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("N = ?");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		BufferedReader objReader = null;
		try {
			String strCurrentLine;
			Class clazz = DifferentWords.class;
		    InputStream inputStream = clazz.getResourceAsStream("/file.txt");
			objReader = new BufferedReader(new InputStreamReader(inputStream));
			Set<String> distinctWords = new LinkedHashSet<String>();
			while ((strCurrentLine = objReader.readLine()) != null && distinctWords.size() <= n) {
				if(strCurrentLine.isEmpty()) {
					continue;
				}
				String[] words = strCurrentLine.split("[,. ]+");
				for(String word : words) {
					if(!distinctWords.contains(word)) {
						distinctWords.add(word);
						if( distinctWords.size() >= n ) {
							break;
						}
					}
				}
			}
			
			System.out.println(distinctWords);

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {
				if (objReader != null)
					objReader.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

}
