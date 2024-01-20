package com.intuit.program;

public class MetricData extends BaseEntity {

	private Long metricDataId;

	private String fieldValue;

	private String priorValue;

	private String sourceRefUrl;

	public MetricData() {

	}

	public MetricData(Long metricDataId, String fieldValue, String priorValue, String sourceRefUrl) {
		super();
		this.metricDataId = metricDataId;
		this.fieldValue = fieldValue;
		this.priorValue = priorValue;
		this.sourceRefUrl = sourceRefUrl;
	}

	public Long getMetricDataId() {
		return metricDataId;
	}

	public void setMetricDataId(Long metricDataId) {
		this.metricDataId = metricDataId;
	}

	public String getFieldValue() {
		return fieldValue;
	}

	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}

	public String getPriorValue() {
		return priorValue;
	}

	public void setPriorValue(String priorValue) {
		this.priorValue = priorValue;
	}

	public String getSourceRefUrl() {
		return sourceRefUrl;
	}

	public void setSourceRefUrl(String sourceRefUrl) {
		this.sourceRefUrl = sourceRefUrl;
	}

	@Override
	public String toString() {
		return "MetricData [metricDataId=" + metricDataId + ", fieldValue=" + fieldValue + ", priorValue=" + priorValue
				+ ", sourceRefUrl=" + sourceRefUrl + "]";
	}

}
