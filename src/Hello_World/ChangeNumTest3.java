/**
 *
 */
package Hello_World;

import java.security.Permission;

import org.junit.Before;
import org.junit.Test;

/**
 * @author okuda
 *
 */
public class ChangeNumTest3 {

 // 独自Exceptinを作成(SecurityExceptionを継承
    class ExitException extends SecurityException {
        public int state = 1;
        public ExitException(int state) {
            this.state = state;
        }
    }

    @Before
    public void setUp() {
     // SecurityManagerのインスタンス作成
        SecurityManager securityManager = new SecurityManager() {
         // exitなどの権限を扱うcheckPermission(Permission)を上書き(Override)
            @Override
            public void checkPermission(Permission permission) {
            }
            // exitメソッドが呼ばれたときに、Exceptionを投げるように上書き(Override)
            @Override
            public void checkExit(int status) {
                throw new ExitException(status);
            }
        };
     // 設定した情報をset
        System.setSecurityManager(securityManager);
    }

    /**
     * {@link Hello_World.ChangeNum#main(java.lang.String[])} のためのテスト・メソッド。
     */
    @Test
    public void testMain() {
        try {
            ChangeNum.main(new String[]{"999"});
        } catch (Exception e) {
        }
    }

}
