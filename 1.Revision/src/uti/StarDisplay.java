package uti;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class StarDisplay {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<String> allLines = Files.readAllLines(Paths.get("resources/file.txt"));
		// WRONG 
//		for(String line : allLines){
//			line = line.replaceAll("[0-9]", "*");
//			System.out.println(line);
//		}
		for(int i = 0; i < allLines.size();i++){
			allLines.set(i, allLines.get(i).replaceAll("[0-9]", "*"));
		}
		System.out.println(allLines);
	}

}