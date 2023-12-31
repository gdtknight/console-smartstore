package me.smartstore.core.domain;

/**
 * 고객 유형별 세부 기준
 *
 * @author YongHo Shin
 * @version v1.0
 * @since 2023-05-10
 */
public class Parameter {
  private Integer minSpentTime;
  private Integer minPayAmount;

  public Parameter(Integer minSpentTime, Integer minPayAmount) {
    this.minSpentTime = minSpentTime;
    this.minPayAmount = minPayAmount;
  }

  public Integer getMinSpentTime() {
    return minSpentTime;
  }

  public void setMinSpentTime(Integer minSpentTime) {
    this.minSpentTime = minSpentTime;
  }

  public Integer getMinPayAmount() {
    return minPayAmount;
  }

  public void setMinPayAmount(Integer minPayAmount) {
    this.minPayAmount = minPayAmount;
  }

  @Override
  public String toString() {
    return "Parameter{"
        + "minimumSpentTime="
        + minSpentTime
        + ", minimumTotalPayment="
        + minPayAmount
        + '}';
  }
}
