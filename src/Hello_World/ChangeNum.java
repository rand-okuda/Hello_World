/**
 *
 */
package Hello_World;

/**
 * @author okuda
 *
 */
public class ChangeNum {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // 01. オブジェクト生成
        ChangeNum cn1 = new ChangeNum();
        // 02. ChangeNum メソッド呼出
        cn1.ChangeNum(args[0]);

    }

    /**
     * @param s1
     * @return n1
     */
    int ChangeNum(String s1) {
        // 03. 数値に変換
        int n1 = Integer.parseInt(s1);
        System.out.println(s1);
        return n1;

    }

}
