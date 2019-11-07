import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputParser {
	private Scanner scan;
	private BufferedReader buff;
	
	public InputParser() {
		scan = new Scanner(System.in);
		buff = new BufferedReader(new InputStreamReader(System.in)); 
	}
	
	protected Integer getK() {
        System.out.println("Enter a number: ");
        return scan.nextInt();
	}
	
	protected List<Integer> getNumberList () {
        System.out.println("Enter several numbers: ");
        List<Integer> list = new ArrayList<Integer>();
        try {
			String[] test = buff.readLine().split(" ");
	        for (String temp : test) {
	        	list.add(Integer.parseInt(temp));
	        }
		} catch (IOException e) {
			e.printStackTrace();
		}

//        list.add(scan.nextInt());
//        while(scan.hasNext()) {
//        	if (scan.hasNextInt())
//        		list.add(scan.nextInt());
//            else 
//            	scan.next();
//        	System.out.println(scan.nextInt());
//        }
        return list;
	}
}
