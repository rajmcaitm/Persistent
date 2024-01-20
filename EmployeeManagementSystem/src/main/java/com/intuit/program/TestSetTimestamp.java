package com.intuit.program;

public class TestSetTimestamp {

    public static void main(String[] args) {
        MetricData metricData = new MetricData();
        metricData.setCreatedBy("-1");
        metricData.setUpdatedBy("-1");
        System.err.println(metricData.getCreatedBy()+" : "+metricData.getUpdatedBy());
    }

}

