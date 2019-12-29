package com.github.hrn.practice.demo.lambda;

import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;

/**
 * @author 胡荣娜
 * @date 2019-12-29
 */
public class ThreadLocalLambda {
    public final static ThreadLocal<DateFormatter> FORMATTER_THREAD_LOCAL = ThreadLocal.withInitial(() -> new DateFormatter(new SimpleDateFormat("dd-MM-YYYY")));
}
