package library.app;

import library.model.Book;
import library.io.DataReader;

public class LibraryApp {

    public static void main(String[] args) {
	    final String APP_NAME = "Biblioteka v1.1";
	    System.out.println(APP_NAME);
        LibraryControl libControl = new LibraryControl();
        libControl.controlLoop();
    }
}
