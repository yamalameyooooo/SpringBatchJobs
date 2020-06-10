package com.shamsu.SpringBatchJobs.service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class BatchJobService {

	Logger log = LoggerFactory.getLogger(BatchJobService.class);

	// schedule a job every 5 sec
	@Scheduled(fixedRate = 5000)
	public void batchJobOne() {
		System.out.println("5 Sec Job Called at " + new Date().toString());
		log.info("Batch Job 1 Called");
	}

	// schedule a job every 16 sec
	@Scheduled(cron = "0/16 * * * * *")
	public void batchJobTwo() {
		System.out.println("16 Sec Job Called at " + new Date().toString());
		log.info("Batch Job 2 Called");
	}

}
