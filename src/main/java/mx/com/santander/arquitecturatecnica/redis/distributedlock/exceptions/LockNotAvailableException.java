package mx.com.santander.arquitecturatecnica.redis.distributedlock.exceptions;

public class LockNotAvailableException extends RuntimeException {

	private static final long serialVersionUID = -5508112846460561629L;

	public LockNotAvailableException(final String message) {
		super(message);
	}

	public LockNotAvailableException(final String message, final Throwable e) {
		super(message, e);
	}
}
