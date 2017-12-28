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
public class HTMLParserTest3 {

    /**
     * {@link Hello_World.HTMLParser#main(java.lang.String[])} のためのテスト・メソッド。
     * 引数にHTMLではない文字列を代入して起動しコンソールメッセージが無い事をAssert。
     */
    @Test
    public void testMain() {
        // コンソール出力をリダイレクト
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        // 引数用のHTML文字列
        String htmlString = "XXX";
        // テスト対象メソッド実行
        HTMLParser.main(new String[]{htmlString});
        // 改行コード取得
        String lineCd = System.getProperty("line.separator");
        // 期待される文字列
        String expectedString = new String();
        // 実際の出力文字列
        String actualString = out.toString();
        // Assert確認実行
        assertEquals(expectedString, actualString);

    }

}
