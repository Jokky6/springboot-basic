package MainApplication.exception.http;

public class HttpException extends RuntimeException {
    public Integer getCode() {
        return code;
    }

    protected Integer code;

    public Integer getHttpStatusCode() {
        return httpStatusCode;
    }

    protected Integer httpStatusCode = 500;
}
