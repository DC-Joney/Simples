package studentExecse.inheritance.day14;

/**
 * Created by Administrator on 2016/9/14.
 */
public class VArea {
    private String color;
    private Integer hegiht;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getHegiht() {
        return hegiht;
    }

    public void setHegiht(Integer hegiht) {
        this.hegiht = hegiht;
    }

    public VArea(String color, Integer hegiht) {
        this.color = color;
        this.hegiht = hegiht;
    }

    @Override
    public String toString() {
        return "VArea{" +
                "color='" + color + '\'' +
                ", hegiht=" + hegiht +
                '}';
    }

}
class Cricle{
    private Integer name;
}
