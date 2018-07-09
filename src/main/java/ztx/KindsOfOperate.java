package ztx;

import org.apache.log4j.Logger;

public class KindsOfOperate {
    private static final Logger logger = Logger.getLogger(App.class.getClass());

    public int add(int a, int b) {
        return a + b;
    }


    public int cheng(int a, int b) {
        logger.info("用到了cheng函数,此时a=" + a + "  b=" + b);
        logger.debug("");
        return a * b;
    }

    public int min(int a, int b) {
        return a < b ? a : b;
    }
}
