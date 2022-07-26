import acm.program.*;

import java.io.*;
import java.util.*;

public class BookStore extends ConsoleProgram {

    private HashMap<Integer,String> titles;
    private HashMap<Integer,String> authors;

    public void run() {
	// Read the book records form the file
	readBooks("books.txt");
	println("Read " + titles.size() + " book records from the file.\n");

	// Asks user repeatedly for a book id and then display the related information
	while(true) {
	    String line = readLine("Please enter a book id: ");
	    // Your code starts here
	    
	    // Your code ends here
	}
	println("Bye.");
    }

    private void readBooks(String bookFile) {
	titles = new HashMap<Integer, String>();
	authors = new HashMap<Integer, String>();

	try {
	    BufferedReader rd = new BufferedReader(new FileReader(bookFile));
	    while (true) {
		String line = rd.readLine();
		if (line == null)
		    break;
		StringTokenizer tokenizer = new StringTokenizer(line,"/");
		// Your code starts here
		
		// Your code ends here
	    }
	} catch (Exception e) {
	    println("Error: " + e);
	}
    }
}
