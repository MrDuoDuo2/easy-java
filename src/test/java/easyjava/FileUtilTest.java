package easyjava;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class FileUtilTest {
    @Test
    public void writeToLocal() throws IOException {
        String filePath = "../text.txt"; //文件在target目录下
        String content = "hello";
        InputStream inputStream = new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8));
        FilUtil.writeToLocal(filePath,inputStream);
    }
}
