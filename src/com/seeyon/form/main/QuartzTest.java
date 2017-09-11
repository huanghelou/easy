package com.seeyon.form.main;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

import com.seeyon.form.quartz.HelloJob;

import static org.quartz.JobBuilder.*;
import static org.quartz.TriggerBuilder.*;

import java.util.Date;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;

import static org.quartz.SimpleScheduleBuilder.*;

public class QuartzTest {

	public static void main(String[] args) {
		try {
			
			Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
			scheduler.start();
			
			//获取job实例
			JobDetail jobDetail = JobBuilder.newJob(HelloJob.class).withIdentity("helloJob", "group1").build();
			
			//获取Trigger
			Trigger trigger = newTrigger().withIdentity("trigger1", "group1").startAt(new Date()).build();
			scheduler.shutdown();
			
		} catch (SchedulerException e) {
			
			e.printStackTrace();
		}
	}
}
