package c.cn.Proprex;

/**
 * ClassName:  Admin
 * Author:   命运造我
 * Date:     2019/5/15 21:09
 * Description:
 */
public class SqlMapper {
    private String sql;
    private String resultType;
    private String resultMap;
    private String parameterType;
    private String parameterMap;

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public String getResultMap() {
        return resultMap;
    }

    public void setResultMap(String resultMap) {
        this.resultMap = resultMap;
    }

    public String getParameterType() {
        return parameterType;
    }

    public void setParameterType(String parameterType) {
        this.parameterType = parameterType;
    }

    public String getParameterMap() {
        return parameterMap;
    }

    public void setParameterMap(String parameterMap) {
        this.parameterMap = parameterMap;
    }

    @Override
    public String toString() {
        return "SqlMapper{" +
                "sql='" + sql + '\'' +
                ", resultType='" + resultType + '\'' +
                ", resultMap='" + resultMap + '\'' +
                ", parameterType='" + parameterType + '\'' +
                ", parameterMap='" + parameterMap + '\'' +
                '}';
    }
}
