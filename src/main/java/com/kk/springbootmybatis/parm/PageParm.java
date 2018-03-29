package com.kk.springbootmybatis.parm;

import jdk.nashorn.internal.ir.ReturnNode;

/**
 * @author Mr.kk
 */
public class PageParm {

    private int beaginLine; //起始行

    private Integer pageSize = 3;//每页的数量

    private Integer currentPage = 0;//当前页

    public void setBeaginLine(int beaginLine) {
        this.beaginLine = beaginLine;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public int getBeaginLine() {
        return  beaginLine;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }
}
