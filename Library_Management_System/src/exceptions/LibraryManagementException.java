package exceptions;

public class LibraryManagementException extends Exception {
    public LibraryManagementException(String message) {
        super(message);
    }

    public LibraryManagementException(String message, Throwable cause) {
        super(message, cause);
    }
}