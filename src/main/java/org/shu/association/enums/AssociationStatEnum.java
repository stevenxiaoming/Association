package org.shu.association.enums;

/**
 * Created with IntelliJ IDEA
 * User: StevenMing
 * Date: 2017/4/26
 * Time: 14:47
 */
public enum AssociationStatEnum {

    PERPARING(0, "社团筹建中"),
    REGISTERED(1, "社团已注册"),
    CANCELED(2, "社团已注销"),

    BU_MING(10, ""),
    GONG_YI_SHI_JIAN(11, "公益实践"),
    LI_LUN_XUE_XI(12, "理论学习"),
    SHE_HUI_KE_XUE(13, "社会科学"),
    TI_YU_JIAN_SHEN(14, "体育健身"),
    WEN_HUA_YI_SHU(15, "文化艺术"),
    XUE_SHU_KE_JI(16, "学术科技"),

    NO_RECRUIT(20, "社团暂不招新"),
    RECRUIT(21, "社团招新中");

    private int state;
    private String stateInfo;

    AssociationStatEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public static String stateOf(int index) {
        for (AssociationStatEnum state : values()) {
            if (state.getState() == index) {
                return state.getStateInfo();
            }
        }
        return null;
    }
}
