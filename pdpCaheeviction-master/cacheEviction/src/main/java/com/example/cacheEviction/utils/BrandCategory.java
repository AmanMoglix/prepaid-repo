package com.example.cacheEviction.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URLEncoder;

public class BrandCategory {
    private static final Logger logger= LoggerFactory.getLogger(BrandCategory.class);

    public  String encodeRequestParam(String url)
    {
        try {
            url = URLEncoder.encode(url, "UTF-8");
        } catch (Exception e) {
            logger.error("Exception occured while encoding the url "+e);
        }
        return url;
    }
}
