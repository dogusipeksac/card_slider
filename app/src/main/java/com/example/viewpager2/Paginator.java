package com.example.viewpager2;

import java.util.ArrayList;

public class Paginator {
    public static final int TOTAL_NUM_ITEMS=10;
    public static final int ITEMS_PER_PAGE=4;
    public static final int ITEMS_REMAINING=TOTAL_NUM_ITEMS % ITEMS_PER_PAGE;
    public static final int LAST_PAGE=TOTAL_NUM_ITEMS / ITEMS_PER_PAGE;


    public ArrayList<Data> generatePage(int currentPage){

        int startItem=currentPage*ITEMS_PER_PAGE+1;
        int numOfData=ITEMS_PER_PAGE;

        ArrayList<Data> pageData=new ArrayList<>();

        if(currentPage==LAST_PAGE && ITEMS_REMAINING>0)
        {
            for(int i=startItem;i<startItem+ITEMS_REMAINING;i++) {

                Data data=new Data("Ali"+i,"At"+i,"19"+i);
                pageData.add(data);
            }
        }
        else
        {
            for(int i=startItem;i<startItem+numOfData;i++){
                Data data=new Data("Ali"+i,"At"+i,"19"+i);
                pageData.add(data);
            }
        }
        return pageData;
    }

}


