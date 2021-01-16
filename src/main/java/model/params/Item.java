package model.params;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {

    @JsonProperty("createDt")
    public String createDt;
    @JsonProperty("deathCnt")
    public int deathCnt;
    @JsonProperty("defCnt")
    public int defCnt;
    @JsonProperty("gubun")
    public String gubun;
    @JsonProperty("gubunCn")
    public String gubunCn;
    @JsonProperty("gubunEn")
    public String gubunEn;
    @JsonProperty("incDec")
    public int incDec;
    @JsonProperty("isolClearCnt")
    public int isolClearCnt;
    @JsonProperty("isolIngCnt")
    public int isolIngCnt;
    @JsonProperty("localOccCnt")
    public int localOccCnt;
    @JsonProperty("overFlowCnt")
    public int overFlowCnt;
    @JsonProperty("qurRate")
    public String qurRate;
    @JsonProperty("seq")
    public int seq;
    @JsonProperty("stdDay")
    public String stdDay;
    @JsonProperty("updateDt")
    public String updateDt;

    @Override
    public String toString() {
        return "Item{" +
                "createDt='" + createDt + '\'' +
                ", deathCnt=" + deathCnt +
                ", defCnt=" + defCnt +
                ", gubun='" + gubun + '\'' +
                ", gubunCn='" + gubunCn + '\'' +
                ", gubunEn='" + gubunEn + '\'' +
                ", incDec=" + incDec +
                ", isolClearCnt=" + isolClearCnt +
                ", isolIngCnt=" + isolIngCnt +
                ", localOccCnt=" + localOccCnt +
                ", overFlowCnt=" + overFlowCnt +
                ", qurRate='" + qurRate + '\'' +
                ", seq=" + seq +
                ", stdDay='" + stdDay + '\'' +
                ", updateDt='" + updateDt + '\'' +
                '}';
    }
}
