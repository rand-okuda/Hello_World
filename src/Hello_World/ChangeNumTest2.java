/**
 *
 */
package Hello_World;

import org.junit.Test;

// 01. JUnitフレームワークのインポート
import junit.framework.TestCase;

/**
 * @author okuda
 *
 */
// 02. TestCaseクラスを継承
public class ChangeNumTest2 extends TestCase {
    // 03. コンストラクタ作成
    public ChangeNumTest2(String name) {
        super(name);
    }

    @Test
    // 04. テストメソッドの宣言
    public void testChangeNum () {
        // 05. 変換前の文字列（引数）
        String ts1 = "100";
        // 06. 変換後の文字列（Assert用）
        int tn1 = 100;
        // 07. オブジェクトの生成
        ChangeNum tcn1 = new ChangeNum();
        // 08. ChangeNumメソッドを呼出
        int test1 = tcn1.ChangeNum(ts1);
        // 09. Assert確認実行
        assertEquals(tn1, test1);

    }

}
