import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * Created with Test
 *
 * @author fuaokai
 * @version 1.0
 * @description
 * @date 2017/4/26 17:28
 */
public class Test {

    public static void main(String[] args) {
//        DefaultPasswordService d = new DefaultPasswordService();
//        System.out.println(d.encryptPassword("fuaokai"));
//        System.out.println(d.encryptPassword("fuaokai"));

        //c839698a8c4e4e33403bd758a986018f
        System.out.println(new Md5Hash("fuaokai", "slat").toString());
        System.out.println(new Md5Hash("fuaokaislat").toString());
        System.out.println(new Md5Hash(new Md5Hash("fuaokai").toString()).toString());

//        HashedCredentialsMatcher d1 = new HashedCredentialsMatcher();
//        d1.setHashAlgorithmName("md5");
//        d1.setHashIterations(2);
//        d1.setStoredCredentialsHexEncoded(true);
//
//        boolean isTrue = d1.doCredentialsMatch(new UsernamePasswordToken("fuaokai", "fuaokai"), new SimpleAuthenticationInfo("fuaokai", "fuaokai", "fuaokai"));
//        System.out.println(isTrue);
    }
}
