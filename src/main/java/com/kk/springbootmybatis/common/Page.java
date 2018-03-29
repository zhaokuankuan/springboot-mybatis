package com.kk.springbootmybatis.common;

import com.kk.springbootmybatis.parm.PageParm;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 分页的封装数据
 * @author Mr.kk
 * @param <T>
 */
public class Page<T>  implements Serializable{

    private static final long serialVersionUID = -2020350783443768083L;

    private int currentPage = 1; //当前页数
    private long totalPage;      //总页数
    private long totalNumber;   //总记录数
    private List<T> list;        //封装的数据集

    public static Page NULL = new Page(0, 0, 15, new ArrayList());


    /**
     * @param currentPage   当前的页数
     * @param totalNumber 总记录数
     * @param pageSize     页数大小
     * @param list         当前页的数据
     */
    public Page(int currentPage,long totalNumber,int pageSize,List<T> list){
        super();
        this.currentPage =currentPage / pageSize+1;
        this.totalNumber = totalNumber;
        this.list = list;
        this.totalPage = totalNumber % pageSize == 0 ? totalNumber
                / pageSize : totalNumber / pageSize + 1;
    }

    /**
     * @param pageParm    传入的分页的数据
     * @param totalNumber 总条数
     * @param list         当前页的数据
     */
    public Page(PageParm pageParm,long totalNumber,List<T> list){
        super();
        this.currentPage = currentPage;
        this.totalNumber = totalNumber;
        this.list = list;
        this.totalPage = totalNumber % pageParm.getPageSize() == 0 ? totalNumber
                / pageParm.getPageSize() : totalNumber / pageParm.getPageSize() + 1;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public void setTotalPage(long totalPage) {
        this.totalPage = totalPage;
    }

    public void setTotalNumber(long totalNumber) {
        this.totalNumber = totalNumber;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public long getTotalPage() {
        return totalPage;
    }

    public long getTotalNumber() {
        return totalNumber;
    }

    public List<T> getList() {
        return list;
    }
}
