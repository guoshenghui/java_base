package litejunit.v3.common;

/**
 * Thrown when an assertion failed.
 */
public class AssertionFailedError extends Error {

	public AssertionFailedError() {
	}

	public AssertionFailedError(String message) {
		super(message);
	}
}
