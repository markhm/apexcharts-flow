package com.github.appreciated.apexcharts.config.chart.toolbar;

public enum AutoSelected {
    zoom("zoom"),
    selection("selection"),
    pan("pan");
    private String name;
    AutoSelected(String name){
        this.name = name;
    }
}
