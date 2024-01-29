# Lab Report 2 - Servers and SSH Keys

## Part 1: ChatServer
Below is the code for ChatServer.java, along with 2 screenshots for how ChatServer is called in two different instances.
1. The code:
```
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class Handler implements URLHandler {
    ArrayList<String> values = new ArrayList<>();
    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return "Home page";
        }
        else if (url.getPath().contains("/add-message")) {
            String[] params = url.getQuery().split("=", 3);
            String[] lilParams = params[1].split("&");
            if (params[0].equals("s") && lilParams[1].equals("user")) {
                    values.add(String.format("%s: %s", params[2], lilParams[0]));
                    String listString = String.join("\n", values);
                    return listString;                    
            }
        }
        else if (url.getPath().equals("/clear")) {
            values.clear();
            return "List cleared";
        }
        return "404! Please try again.";    
    }
}

public class ChatServer {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }
        int port = Integer.parseInt(args[0]);
        Server.start(port, new Handler());
    }
}
```

2. Message with no spaces:
![Image](/query1.png)
* Launching the server calls the `main()` method in the `ChatServer` class, which in turn calls the `handleRequest()` method in the `Handler` class. 
* The `main()` method takes the port number as an argument, stored in `String[] args`. This is stored in an integer field `port` as `args[0]`. The `handleRequest()` method takes the url as a parameter, stored in `URI url`. The other field in the `Handler` class is an `ArrayList` of strings called `values`. Within the `handleRequest()` method, two local arrays of strings `params[]` and `lilParams[]` exist.
* When the server is launched with port `4000`, `args[0]` takes the value of `4000` as a string. This is parsed into an integer when stored in `port`. When `handleRequest()` is called, the url passed is `http://localhost:4000/add-message?s=hello&user=chaitya`. Within `handleRequest()`, `params` takes the values of `["s", "hello&user", "chaitya"]`. This is because `url` is parsed with the = character. Additionally, `lilParams` takes the values of `["hello","user"]` because `params[1]` is parsed using the & character. After both arrays are created, the string `"chaitya: hello"` is added to `values` because `params[2]` and `lilParams[0]` are formatted into a string.
