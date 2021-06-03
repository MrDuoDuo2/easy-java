package easyjava;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class FilUtil {
    /**
     * @param destination 文件位置
	 * @param inputStream 文件输入流
     */
    public static void writeToLocal(String destination, InputStream inputStream)
            throws IOException {
        int index;
        byte[] bytes = new byte[inputStream.available()];
        FileOutputStream downloadFile = new FileOutputStream(destination);
        while ((index = inputStream.read(bytes)) != -1) {
            downloadFile.write(bytes, 0, index);
            downloadFile.flush();
        }
        downloadFile.close();
        inputStream.close();
    }
}
