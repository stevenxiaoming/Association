import org.shu.association.enums.AssociationStatEnum;

/**
 * Created with IntelliJ IDEA
 * User: StevenMing
 * Date: 2017/4/28
 * Time: 0:35
 */
public class DefaultTest {
    public static void main(String[] args) {
        String s = AssociationStatEnum.stateOf(13).toString();
        System.out.println(AssociationStatEnum.stateOf(13));
    }
}
