package me.sairu.service.exception;

public  class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

    @Override
    public String toString() {
        return String.format("BusinessException{message=%s, cause=%s}", getMessage(), getCause());
    }
}