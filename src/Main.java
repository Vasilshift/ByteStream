import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static int main(String[] args) throws IOException {
        //byte b = 0;
        int result = 0;

        InputStream inputStream = InputStream.nullInputStream();
        //byte[] bytes = byte;
        //int n = read(bytes);
        int n = inputStream.read();

            while (inputStream.read() != -1) {
                result+= n;
                n = inputStream.read();
            }

        return result;
    }
}
