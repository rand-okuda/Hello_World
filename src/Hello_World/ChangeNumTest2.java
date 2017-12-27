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
        // 10. main実行
        ChangeNum.main(new String[]{"999"});

    }

}
