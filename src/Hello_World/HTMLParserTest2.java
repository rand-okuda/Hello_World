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
public class HTMLParserTest2 {

    /**
     * {@link Hello_World.HTMLParser#main(java.lang.String[])} のためのテスト・メソッド。
     * 引数にHTML文字列を代入して起動しコンソールメッセージをAssert。
     */
    @Test
    public void testMain() {
        // コンソール出力をリダイレクト
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        // 引数用のHTML文字列
        String htmlString = "<html><head><title>TEST</title></head><body><h1>TEST</h1><p>TEST<ahref='login.jsp'>TEST</a></body></html>";
        // テスト対象メソッド実行
        HTMLParser.main(new String[]{htmlString});
        // 改行コード取得
        String lineCd = System.getProperty("line.separator");
        // 期待される文字列
        String expectedString = new String();
        expectedString += "タグ:[html], 属性:[], テキスト:[]" + lineCd;
        expectedString += "タグ:[head], 属性:[], テキスト:[]" + lineCd;
        expectedString += "タグ:[title], 属性:[], テキスト:[TEST]" + lineCd;
        expectedString += "タグ:[/title], 属性:[], テキスト:[]" + lineCd;
        expectedString += "タグ:[/head], 属性:[], テキスト:[]" + lineCd;
        expectedString += "タグ:[body], 属性:[], テキスト:[]" + lineCd;
        expectedString += "タグ:[h1], 属性:[], テキスト:[TEST]" + lineCd;
        expectedString += "タグ:[/h1], 属性:[], テキスト:[]" + lineCd;
        expectedString += "タグ:[p], 属性:[], テキスト:[TEST]" + lineCd;
        expectedString += "タグ:[ahref='login.jsp'], 属性:[], テキスト:[TEST]" + lineCd;
        expectedString += "タグ:[/a], 属性:[], テキスト:[]" + lineCd;
        expectedString += "タグ:[/body], 属性:[], テキスト:[]" + lineCd;
        expectedString += "タグ:[/html], 属性:[], テキスト:[]" + lineCd;
        // 実際の出力文字列
        String actualString = out.toString();
        // Assert確認実行
        assertEquals(expectedString, actualString);

    }

}
