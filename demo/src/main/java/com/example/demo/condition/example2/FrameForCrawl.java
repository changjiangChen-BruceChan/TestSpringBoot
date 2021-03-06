package com.example.demo.condition.example2;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;
@ConditionalOnProperty(name = "crawlMethod",havingValue = "frame")
@Service
public class FrameForCrawl extends AbstractCrawlServiceImpl{
    @Override
    public void crawl() {
        System.out.println(this.createSQL("frame_crawl_table_info"));
    }
}
