/**
 *
 */
package Hello_World;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

/**
 * @author okuda
 *
 */
public class HTMLParserTest {

    /**
     * {@link Hello_World.HTMLParser#main(java.lang.String[])} のためのテスト・メソッド。
     * 引数を空白で起動しコンソールメッセージをAssert。
     */
    @Test
    public void testMain() {
        // コンソール出力をリダイレクト
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        // テスト対象メソッド実行
        HTMLParser.main(new String[]{});
        // 期待される文字列+printlnの改行部分
        String expectedString = "引数にHTML文字列をワンワード（ブランクなし）で代入してください。" + System.lineSeparator();
        // 実際の出力文字列
        String actualString = out.toString();
        // Assert確認実行
        assertEquals(expectedString, actualString);

    }

}
