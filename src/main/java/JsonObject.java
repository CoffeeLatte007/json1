import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * 样本对象
 *
 */
public class JsonObject implements Serializable {
    private static final long serialVersionUID = -1520171788566678009L;

    private Boolean fieldBoolean;
    private Integer fieldInt;
    private Long fieldLong;
    private Double fieldDouble;
    private Date fieldDate;
    private String fieldStr;
    private List<String> fieldList;
    private Map<String, Object> fieldMap;

    /**
     * 随机样本
     */
    public JsonObject() {
        Random random = new Random();

        fieldBoolean = random.nextBoolean();
        fieldInt = random.nextInt();
        fieldLong = random.nextLong();
        fieldDouble = random.nextDouble();
        fieldDate = new Date();
        fieldStr = DataBuilder.randomString();

        fieldList = DataBuilder.randomStringList();

        fieldMap = DataBuilder.randomMap();
    }

    /**
     * 指定List元素数量和Map元素数量的样本
     * @param listSize List元素数量
     * @param mapKeyNum Map元素数量
     */
    public JsonObject(int listSize, int mapKeyNum) {
        Random random = new Random();

        fieldBoolean = random.nextBoolean();
        fieldInt = random.nextInt();
        fieldLong = random.nextLong();
        fieldDouble = random.nextDouble();
        fieldDate = new Date();
        fieldStr = DataBuilder.randomString();

        fieldList = DataBuilder.randomStringList(listSize);

        fieldMap = DataBuilder.randomMap(mapKeyNum);
    }

    public Boolean getFieldBoolean() {
        return fieldBoolean;
    }

    public void setFieldBoolean(Boolean fieldBoolean) {
        this.fieldBoolean = fieldBoolean;
    }

    public Integer getFieldInt() {
        return fieldInt;
    }

    public void setFieldInt(Integer fieldInt) {
        this.fieldInt = fieldInt;
    }

    public Long getFieldLong() {
        return fieldLong;
    }

    public void setFieldLong(Long fieldLong) {
        this.fieldLong = fieldLong;
    }

    public Double getFieldDouble() {
        return fieldDouble;
    }

    public void setFieldDouble(Double fieldDouble) {
        this.fieldDouble = fieldDouble;
    }

    public Date getFieldDate() {
        return fieldDate;
    }

    public void setFieldDate(Date fieldDate) {
        this.fieldDate = fieldDate;
    }

    public String getFieldStr() {
        return fieldStr;
    }

    public void setFieldStr(String fieldStr) {
        this.fieldStr = fieldStr;
    }

    public List<String> getFieldList() {
        return fieldList;
    }

    public void setFieldList(List<String> fieldList) {
        this.fieldList = fieldList;
    }

    public Map<String, Object> getFieldMap() {
        return fieldMap;
    }

    public void setFieldMap(Map<String, Object> fieldMap) {
        this.fieldMap = fieldMap;
    }

}