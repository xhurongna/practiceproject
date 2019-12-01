package com.github.hrn.practice.project.job;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

/**
 * @author 胡荣娜
 * @date 2019-08-01
 */
@Slf4j
@Component
public class ScheduleRunner {

//    @Async
//    @Scheduled(fixedRate = 5000)
    public void fixedDelayJob()  {
        log.info(Thread.currentThread() + " job1开始定时任务 {}", LocalTime.now());
    }

//    @Async
//    @Scheduled(fixedRate = 5000)
    public void fixedDelayJob2() throws InterruptedException {
        log.info(Thread.currentThread() + " job2开始定时任务 {}", LocalTime.now());
        Thread.sleep(20000);
    }








}
