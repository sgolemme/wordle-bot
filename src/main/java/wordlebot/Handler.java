package wordlebot;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Handler implements RequestHandler<String, String> {

    @Override
    public String handleRequest(String input, Context context) {
        return "200 OK";
    }
}
