package cn.gjing.tools.excel.valid;

/**
 * 提示等级
 * @author Gjing
 **/
public enum Rank {
    /**
     * 提示框等级
     */
    WARNING(1),STOP(0),INFO(2);
    private int rank;

    Rank(int type) {
        this.rank = type;
    }

    public int getRank() {
        return rank;
    }
}
